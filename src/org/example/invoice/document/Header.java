package org.example.invoice.document;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.example.invoice.PDFPrinter;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.awt.Color;
import java.io.IOException;

public class Header {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private Date invoiceDate;
	private String invoiceNumber;

    public Header(JSONObject jsonHeader) {
        if(jsonHeader.containsKey("invoiceDate")) {
            this.setInvoiceDate((String)jsonHeader.get("invoiceDate"));
        }
        if(jsonHeader.containsKey("invoiceNumber")) {
            this.setInvoiceNumber((String)jsonHeader.get("invoiceNumber"));
        }
    }

    public void setInvoiceDate(String invoiceDate) {
    	try {
    		this.invoiceDate = sdf.parse(invoiceDate);
    	} catch(ParseException pe) {
    		pe.printStackTrace();
    		this.invoiceDate = null;
    	}        
    }
    public String getInvoiceDateString() {
        return sdf.format(this.invoiceDate);
    }
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void printPDF(PDDocument pdfDocument, PDPageContentStream contents) throws IOException {        
        PDImageXObject pdImage = PDImageXObject.createFromFile("C:/xampp/htdocs/Zanimo3/web/client/cdn.shopify.com/s/files/1/2452/7833/t/2/assets/logoe8b2.png", pdfDocument);
        final float width = 60f;
        final float scale = width / pdImage.getWidth();
        contents.drawImage(pdImage, 50, 720, width, pdImage.getHeight()*scale);


        PDFont headerFont = PDType1Font.HELVETICA_BOLD;
        PDFPrinter headerPrinter = new PDFPrinter(contents, headerFont, 16);
        headerPrinter.putText(120, 740, "Zanimo");

        PDFont font = PDType1Font.HELVETICA;
        PDFPrinter textPrinter = new PDFPrinter(contents, font, 10);
        textPrinter.putText(120, 720, "Esprit");
        textPrinter.putText(120, 708, "Pôle Technologique El Ghazela, Ariana 2088");
        textPrinter.putText(120, 696, "55-260-895, 127.0.0.1");

        Color color = new Color(200, 200, 200);
        PDFPrinter invoiceHeaderPrinter = new PDFPrinter(contents, font, 24, color);
        invoiceHeaderPrinter.putText(450, 740, "ZANIMO");     

        textPrinter.putText(400, 710, "Invoice date:");
        textPrinter.putText(400, 698, "Invoice number:");
        textPrinter.putText(500, 710, this.getInvoiceDateString());
        textPrinter.putText(500, 698, this.getInvoiceNumber());
    }
}