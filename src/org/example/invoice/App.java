package org.example.invoice;

import org.json.simple.JSONValue;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.*;
import org.example.invoice.document.*;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.json.JSONException;

public class App 
{
    
    
    public static void main( String[] args )
    {
        PDDocument pdfDocument = new PDDocument();
    	try {
	    	JSONObject jsonDocument = 
	    		(JSONObject)JSONValue
	    			.parse(new FileReader(new File("C:/Users/Ben Ghozzia Ahmed/Desktop/java-by-example-master/invoice/afew.json")));

	    	Invoice invoice = new Invoice(jsonDocument);
                
                JSONObject product = new JSONObject();
                ArrayList products = new ArrayList<JSONObject>();
                
                    product.put("food", 1);
                    product.put("accessory", 6);


            PDPage pdfPage = new PDPage();
            pdfDocument.addPage(pdfPage);
            PDPageContentStream contents = new PDPageContentStream(pdfDocument, pdfPage);

            invoice.printPDF(pdfDocument, contents);            

            pdfDocument.save("single-invoice.pdf");
    	} catch (Exception e) {
    		e.printStackTrace();
        } finally {
            try {
                pdfDocument.close();    
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
