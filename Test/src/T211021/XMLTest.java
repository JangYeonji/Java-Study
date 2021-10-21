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
			Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("-----------------------------");
			for(int temp=0;temp<nList.getLength();temp++) {
				Node nNode = nList.item(temp);
				if(nNode.getNodeType()==Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("문화재 번호 : "+getTagValue("MANAGE_NUM",eElement));
					System.out.println("문화재 이름 : "+getTagValue("NAME_KOR",eElement));
					System.out.println("문화재 한자명 : "+getTagValue("NAME_CNI",eElement));
					System.out.println("문화재 크기 : "+getTagValue("SCALE",eElement));
					System.out.println();
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		if (nValue==null)
			return null;
		return nValue.getNodeValue();
	}

}
