package com.example.WebDevelopment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Generate2 {

    public static void generatePdfWithTable(String filePath, List<String> headers, List<String[]> data) throws IOException, DocumentException {
        // Create a PDF document
        Document document = new Document();
        File outputFile;

        if (filePath == null || filePath.isEmpty()) {
            String userHome = System.getProperty("user.home");
            String downloadsFolder = userHome + File.separator + "Downloads";
            outputFile = new File(downloadsFolder + File.separator + "default_output.pdf");
        } else {
            outputFile = new File(filePath);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        PdfWriter writer = PdfWriter.getInstance(document, fileOutputStream);

        // Define a custom page event to add headers and signature
        HeaderAndSignatureEvent event = new HeaderAndSignatureEvent();
        writer.setPageEvent(event);

        document.open();

        // Create a table with the number of columns matching the headers
        PdfPTable table = new PdfPTable(headers.size());

        // Add headers to the table
        for (String header : headers) {
            PdfPCell headerCell = new PdfPCell(new Phrase(header));
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell.setBackgroundColor(BaseColor.YELLOW);
            table.addCell(headerCell);
        }

        // Add data to the table
        for (String[] row : data) {
            for (String cell : row) {
                table.addCell(cell);
            }
        }

        // Add the table to the document
        document.add(table);

        document.close();
        fileOutputStream.close();

        System.out.println("PDF file generated at: " + outputFile.getAbsolutePath());
    }

    public static void main(String[] args) {
        List<String> headers = Arrays.asList("Name", "Age", "City");
        List<String[]> data = new ArrayList<>();
        // Add lots of data to test the pagination
        for (int i = 0; i < 100; i++) {
            data.add(new String[]{"Name" + i, "Age" + i, "City" + i});
        }

        try {
        	Generate2 generate = new Generate2();
            generate.generatePdfWithTable("", headers, data);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}

class HeaderAndSignatureEvent extends PdfPageEventHelper {

    @Override
    public void onStartPage(PdfWriter writer, Document document) {
        // Add headers on every page
        PdfPTable headerTable = new PdfPTable(1);
        PdfPCell headerCell = new PdfPCell(new Phrase("Header"));
        headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        headerTable.addCell(headerCell);

        try {
            document.add(headerTable);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        // Load the signature image
        String signaturePath = "src/main/resources/Signature/UBI.png"; // Provide the path to your signature image
        Image signature;
        try {
            signature = Image.getInstance(signaturePath);

            // Resize the image to fit within the bounds of the page
            signature.scaleToFit(100, 50); // Adjust to your desired size

            // Position the image at the bottom right corner of the page
            signature.setAbsolutePosition(
                    document.getPageSize().getWidth() - 110, // Offset from the right edge
                    10 // Offset from the bottom edge
            );

            // Add the signature image to the document
            document.add(signature);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
