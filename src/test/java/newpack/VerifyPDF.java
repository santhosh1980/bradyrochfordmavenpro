package newpack;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class VerifyPDF {

	public static void main(String[] args) throws Exception {

		boolean flag = false;

		String reqTextInPDF = "PLEASE SEARCH in the appropriate records for all entries\r\n"
				+ "relating to unsatisfied Judgments, Revivals, Decrees, Rules,\r\n"
				+ "Orders, Registrations relating to Real and Chattel Real Estate,\r\n"
				+ "Lis Pendens Recognisances, Crown Bonds, Judgments at the suit\r\n"
				+ "of the Crown or the State, Statutes, Inquisitions and Acceptance of\r\n"
				+ "Office registered, re-registered or redocketed against.";

		String parsedText = null;
		
		// Read PDF from local location
		//FileInputStream obj = new FileInputStream("C:\\Users\\U35035\\Downloads\\judgmentSearchPdf.pdf");
		//PDDocument doc = PDDocument.load(obj);
		//End
		
		//Read PDF from URL
		//URL url = new URL("http://www.vandevenbv.nl/dynamics/modules/SFIL0200/view.php?fil_Id=5515");
		URL url = new URL("https://qa.lawlink.ie/LawLink/closing-pdf/168799-06F528D8718274B92B7A815DF4AF023D/all.pdf");
		BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
		PDDocument doc = PDDocument.load(fileToParse);
	    //
		
	
		
		

		PDFTextStripper pdfStripper = new PDFTextStripper();
		pdfStripper.setStartPage(1);
		pdfStripper.setEndPage(1);
		parsedText = pdfStripper.getText(doc);
		
		doc.close();
		

		System.out.println("+++++++++++++++++");
		System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

		if (parsedText.contains(reqTextInPDF)) {
			flag = true;
		}

		System.out.println(flag);

	}

}
