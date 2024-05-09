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
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdf {

    /**
     * Generate a PDF containing a table with manually set headers and a list of data.
     * 
     * @param filePath Path to save the generated PDF file
     * @param headers A list of header names for the table
     * @param data List of String arrays representing table data
     * @throws IOException If there's an error writing the file
     * @throws DocumentException If there's an error with the PDF document
     */
    public static void generatePdfWithTable(String filePath, List<String> headers, List<String[]> data) throws IOException, DocumentException {
        // Create a PDF document
        Document document = new Document();
        File outputFile = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        PdfWriter.getInstance(document, fileOutputStream);

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

        // Add the table to the document and close it
        document.add(table);
        document.close();
        fileOutputStream.close();

        // Log the absolute path where the PDF is saved
        System.out.println("PDF file generated at: " + outputFile.getAbsolutePath());
    }

    public static void main(String[] args) {
        // Define the headers for the table
        List<String> headers = Arrays.asList("Name", "Age", "City","Name", "Age", "City","Name", "Age", "City");

        // Example data to populate the table
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Alice", "30", "New York","Alice", "30", "New York","Alice", "30", "New York"});
        data.add(new String[]{"Bob", "25", "Los Angeles","Bob", "25", "Los Angeles","Bob", "25", "Los Angeles"});
        data.add(new String[]{"Charlie", "35", "Chicago","Charlie", "35", "Chicago","Charlie", "35", "Chicago"});

        // Set the desired path for the PDF file
        String customPath = "C:/Users/HP/OneDrive/Desktop/PdfDownload/custom_output.pdf"; // Change this to your desired path

        // Generate and save the PDF to the specified path
        try {
            generatePdfWithTable(customPath, headers, data);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
