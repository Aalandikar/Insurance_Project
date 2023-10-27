package com.example.insurance.project.commonutil;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.insurance.project.model.PaymentMode;
import com.example.insurance.project.model.User;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class PaymentCommonUtil {

	public static void paymentDetailReport(HttpServletResponse response, List<PaymentMode> paymentModes) throws IOException {
		try {

			// Creating the Object of Document
			Document document = new Document(PageSize.A4);

			// Getting instance of PdfWriter
			PdfWriter.getInstance(document, response.getOutputStream());

			// Opening the created document to modify it
			document.open();

			// Creating font
			// Setting font style and size
			Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			fontTiltle.setSize(20);

			// Creating paragraph
			Paragraph paragraph = new Paragraph("Payment Details:", fontTiltle);

			// Aligning the paragraph in document
			paragraph.setAlignment(Paragraph.ALIGN_CENTER);

			// Adding the created paragraph in document
			document.add(paragraph);

			// Creating a table of 3 columns
			PdfPTable table = new PdfPTable(5);

			// Setting width of table, its columns and spacing
			table.setWidthPercentage(100f);
			table.setWidths(new int[] { 2,2,2,2,2});
			table.setSpacingBefore(3);

			// Create Table Cells for table header
			PdfPCell cell = new PdfPCell();

			// Setting the background color and padding
			cell.setBackgroundColor(CMYKColor.pink);
			cell.setPadding(5);

			// Creating font
			// Setting font style and size
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font.setColor(CMYKColor.WHITE);

			// Adding headings in the created table cell/ header
			// Adding Cell to table
			cell.setPhrase(new Phrase("Payment Id", font));
			table.addCell(cell);
//			cell.setPhrase(new Phrase("User_Name", font));
//			table.addCell(cell);
			cell.setPhrase(new Phrase("Payment Type", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Amount", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Payment Date", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Status", font));
			table.addCell(cell);

			// Iterating over the list 
			for (PaymentMode paymentmode : paymentModes) {
				// Adding paymentmode id
				table.addCell(String.valueOf(paymentmode.getpaymentModeId()));
				// Adding user id
//				table.addCell(String.valueOf(paymentmode.getUserId()));
				// Adding paymentmodeType
				table.addCell(paymentmode.getPaymentType());
				// Adding payment amount
				table.addCell(Double.toString(paymentmode.getAmount()));
				// Adding payment date
				 LocalDate payDate = paymentmode.getPaymentDate();
		            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Define your desired date format
		            String paymentDate = payDate.format(formatter);
				    table.addCell(paymentDate);	
				// Adding paymentmode status
				table.addCell(paymentmode.getStatus());
			}
			// Adding the created table to document
			document.add(table);

			// Closing the document
			document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
