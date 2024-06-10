package com.example.WebDevelopment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

import com.itextpdf.text.BaseColor;
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

public class Generate7 {

	private static final int LINES_PER_PAGE = 30;

	public static void generatePdfWithTable(String filePath, List<String> headers, List<String[]> data,
			String userPassword, String ownerPassword) throws IOException, DocumentException {
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

		// Set encryption with user and owner passwords
		// writer.setEncryption(userPassword.getBytes(), ownerPassword.getBytes(),
		// PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);

		AccessPermission accessPermission = new AccessPermission();
		StandardProtectionPolicy protectionPolicy = new StandardProtectionPolicy(ownerPassword, userPassword,
				accessPermission);
		protectionPolicy.setEncryptionKeyLength(128);
		protectionPolicy.setPermissions(accessPermission);
		//document.protect(protectionPolicy);

		// Define a custom page event to add headers
		HeaderEvent7 event = new HeaderEvent7(headers);
		writer.setPageEvent(event);

		document.open();

		// Create a table with the number of columns matching the headers
		PdfPTable table = new PdfPTable(headers.size());

		// Create a font with your desired font family and size
		Font font = FontFactory.getFont(FontFactory.HELVETICA, 12); // Example: Helvetica, font size 12

		// Add headers to the table with the specified font size
		for (String header : headers) {
			PdfPCell headerCell = new PdfPCell(new Phrase(header, font)); // Apply the font to the Phrase
			headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			headerCell.setBackgroundColor(BaseColor.YELLOW);
			table.addCell(headerCell);
		}

		int lineCount = 0;

		// Add data to the table with the specified font size
		for (String[] row : data) {
			for (String cell : row) {
				PdfPCell cellWithFont = new PdfPCell(new Phrase(cell, font)); // Apply the font to the Phrase
				table.addCell(cellWithFont);
			}
			lineCount++;
			// Start a new page if the line count reaches the limit
			if (lineCount >= LINES_PER_PAGE) {
				document.add(table);
				document.newPage();
				table.deleteBodyRows(); // Clear the table for the next page
				lineCount = 0; // Reset line count
			}
		}

		// Add the remaining table to the document if it contains any data
		if (lineCount > 0) {
			document.add(table);
		}

		document.close();
		fileOutputStream.close();

		System.out.println("PDF file generated at: " + outputFile.getAbsolutePath());
	}

	public static void main(String[] args) {
		List<String> headers = Arrays.asList("Name", "Age", "City", "City----1", "City------2", "City-------3",
				"City-------4", "City-------5", "City-------6", "City-------7");
		List<String[]> data = new ArrayList<>();
		// Add lots of data to test the pagination
		for (int i = 0; i < 100; i++) {
			data.add(new String[] { "Name" + i, "Age" + i, "City" + i, "City----1" + i, "City------2" + i,
					"City-------3" + i, "City------4" + i, "City------5" + i, "City------6" + i, "City------7" + i });
		}

		String userPassword = "user123";
		String ownerPassword = "owner123";

		try {
			Generate7 generate = new Generate7();
			generate.generatePdfWithTable("", headers, data, userPassword, ownerPassword);
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
}

class HeaderEvent7 extends PdfPageEventHelper {

	private List<String> headers;
	private boolean isFirstPage = true;

	public HeaderEvent7(List<String> headers) {
		this.headers = headers;
	}

	@Override
	public void onStartPage(PdfWriter writer, Document document) {
		if (isFirstPage) {
			// Add the heading "City Union Bank" to the first page
			try {
				PdfPTable headingTable = new PdfPTable(1);
				headingTable.setWidthPercentage(100);
				PdfPCell headingCell = new PdfPCell(
						new Phrase("City Union Bank", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18)));
				headingCell.setBorder(Rectangle.NO_BORDER);
				headingCell.setHorizontalAlignment(Element.ALIGN_CENTER);
				headingTable.addCell(headingCell);
				document.add(headingTable);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			isFirstPage = false; // Update flag to indicate the first page is processed
		}

		// Add the table headers to each page
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
}
