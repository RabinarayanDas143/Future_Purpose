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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Generate1 {

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

        // Load the signature image
        String signaturePath = "src/main/resources/Signature/UBI.png"; // Provide the path to your signature image
        Image signature = Image.getInstance(signaturePath);

       // Image signature = Image.getInstance(signaturePath);

        // Resize the image to fit within the bounds of the page
        signature.scaleToFit(100, 50); // Adjust to your desired size

        // Position the image at the bottom right corner of the page
        signature.setAbsolutePosition(
            document.getPageSize().getWidth() - 110, // Offset from the right edge
            10 // Offset from the bottom edge
        );

        // Add the signature image to the document
        document.add(signature);

        document.close();
        fileOutputStream.close();

        System.out.println("PDF file generated at: " + outputFile.getAbsolutePath());
    }

    public static void main(String[] args) {
        List<String> headers = Arrays.asList("Name", "Age", "City");
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Alice", "30", "New York"});
        data.add(new String[]{"Bob", "25", "Los Angeles"});
        data.add(new String[]{"Charlie", "35", "Chicago"});

        try {
        	Generate1 generate = new Generate1();
        	generate.generatePdfWithTable("", headers, data);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
