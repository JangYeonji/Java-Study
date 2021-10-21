package T211021;

import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://openapi.seoul.go.kr:8088/6558674679686d703531554b686b76/xml/ListCultureAssetsInfo/1/200/");
			InputStream stream = url.openStream();
			char ch = 0;
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc.getDocument
			System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("---");
			for(int temp=0;temp<nList.getLength();temp++) {
				Node nNode = nList;
			}
		}
	}
	public static String getTagValue(String sTag, Element eElemtng) {
		
	}

}
