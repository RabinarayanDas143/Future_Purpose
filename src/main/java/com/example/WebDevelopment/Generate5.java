package com.example.WebDevelopment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.Image;

public class Generate5 {

    public static void generatePdfWithTable(String filePath, List<String> headers, List<String[]> data, String password)
            throws IOException, DocumentException {
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
        
        // Add password protection
        writer.setEncryption(password.getBytes(), password.getBytes(), PdfWriter.ALLOW_PRINTING,
                PdfWriter.ENCRYPTION_AES_128);

        // Define a custom page event to add headers and signature
        HeaderAndSignatureEvent5 event = new HeaderAndSignatureEvent5(headers);
        writer.setPageEvent(event);

        document.open();

        // Create a table with the number of columns matching the headers
        PdfPTable table = new PdfPTable(headers.size());

        // Create a font with your desired font family and size
        Font font = FontFactory.getFont(FontFactory.HELVETICA, 9); // Example: Helvetica, font size 12

        // Add headers to the table with the specified font size
        for (String header : headers) {
            PdfPCell headerCell = new PdfPCell(new Phrase(header, font)); // Apply the font to the Phrase
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell.setBackgroundColor(BaseColor.YELLOW);
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(headerCell);
        }

        // Add data to the table with the specified font size
        for (String[] row : data) {
            for (String cell : row) {
                PdfPCell cellWithFont = new PdfPCell(new Phrase(cell, font)); // Apply the font to the Phrase
                cellWithFont.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cellWithFont);
            }
        }

        // Add the table to the document
        document.add(table);

        document.close();
        fileOutputStream.close();

        System.out.println("PDF file generated at: " + outputFile.getAbsolutePath());
    }

    public static void main(String[] args) {
        List<String> headers = Arrays.asList("Name", "Age", "City","City----1","City------2","City-------3","City-------4","City-------5","City-------6","City-------7");
        List<String[]> data = new ArrayList<>();
        // Add lots of data to test the pagination
        for (int i = 0; i < 100; i++) {
            data.add(new String[] { "Name" + i, "Age" + i, "City" + i,"City----1" + i,"City------2" + i,"City-------3" + i,"City------4" + i,"City------5" + i,"City------6" + i,"City------7" + i });
        }

        String password = "Rabi"; // Set your desired password here

        try {
            Generate5 generate = new Generate5();
            generate.generatePdfWithTable("", headers, data, password);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}

class HeaderAndSignatureEvent5 extends PdfPageEventHelper {

    private List<String> headers;
    private boolean isFirstPage = true;

    public HeaderAndSignatureEvent5(List<String> headers) {
        this.headers = headers;
    }

    @Override
    public void onStartPage(PdfWriter writer, Document document) {
    	
    	 if (isFirstPage) {
             // Add the heading "City Union Bank" to the first page
             try {
                 PdfPTable headingTable = new PdfPTable(1);
                 headingTable.setWidthPercentage(100);
                 PdfPCell headingCell = new PdfPCell(new Phrase("City Union Bank", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18)));
                 headingCell.setBorder(Rectangle.NO_BORDER);
                 headingCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                 headingTable.addCell(headingCell);
                  
                 
              // Add the current system date on the right side of the first page
                 PdfPCell dateCell = new PdfPCell();
                 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                 String currentDate = sdf.format(new Date());
                 Phrase datePhrase = new Phrase("Date: " + currentDate);
                 datePhrase.add(Chunk.NEWLINE); // Add a newline to separate the label and date
                 datePhrase.add(Chunk.NEWLINE); // Add another newline for spacing
                 dateCell.addElement(datePhrase);
                 dateCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                 dateCell.setBorder(Rectangle.NO_BORDER);
                 headingTable.addCell(dateCell);
                 
                 document.add(headingTable);
             } catch (DocumentException e) {
                 e.printStackTrace();
             }
             //isFirstPage = false; // Update flag to indicate the first page is processed
         }
    	
        if (!isFirstPage) {
            PdfPTable headerTable = new PdfPTable(headers.size());
            for (String header : headers) {
                PdfPCell headerCell = new PdfPCell(new Phrase(header));
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setBackgroundColor(BaseColor.YELLOW);
                headerTable.addCell(headerCell);
            }
            try {
                document.add(headerTable);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
        }
        isFirstPage = false;
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
            signature.setAbsolutePosition(document.getPageSize().getWidth() - 100, // Offset from the right edge
                    10 // Offset from the bottom edge
            );

            // Add the signature image to the document
            document.add(signature);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}

