package com.Service;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;



public class XMLParser {

	public static void main(String[] args) {
		

		File file = new File(files);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document xmlDoc = builder.parse(files);
		
		

	static private String getAttrValue(Node node,String attrName) {
	    if ( ! node.hasAttributes() ) return "";
	    NamedNodeMap nmap = node.getAttributes();
	    if ( nmap == null ) return "";
	    Node n = nmap.getNamedItem(attrName);
	    if ( n == null ) return "";
	    return n.getNodeValue();
	}
	
	static private String getTextContent(Node parentNode,String childName) {
	    NodeList nlist = parentNode.getChildNodes();
	    for (int i = 0 ; i < nlist.getLength() ; i++) {
	    Node n = nlist.item(i);
	    String name = n.getNodeName();
	    if ( name != null && name.equals(childName) )
	        return n.getTextContent();
	    }
	    return "";
	}
	
	XPath xpath = XPathFactory.newInstance().newXPath();
	Object res = xpath.evaluate("/ExBank/Account", xmlDoc, XPathConstants.NODESET);
	

	PreparedStatement stmt = con.prepareStatement("INSERT INTO accounts(\n" +
	              " Account_id, AccNum, AccType, BankName, Customer_id, firstname,\n" +
	              " lastname, address)\n" +
	              "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
	
	for (int i = 0 ; i < nlist.getLength() ; i++) {
	    Node node = nlist.item(i);
	    List<String> columns = Arrays
	    .asList(getAttrValue(node, "id"),
	        getTextContent(node, "AccNum"),
	        getTextContent(node, "AccType"),
	        getTextContent(node, "BankName"),
	        getTextContent(node, "Customer_Id"),
	        getTextContent(node, "firstname"),
	        getTextContent(node, "lastname"),
	        getTextContent(node, "address"));
	  
	    for (int n = 0 ; n < columns.size() ; n++) {
	    stmt.setString(n+1, columns.get(n));
	    }
	    stmt.execute();
	}
	
	
//		SAXBuilder builder = new SAXBuilder();//dom SAX parser
//		
//		//read xml
//		Document xml = null;
//		try {
//			xml= builder.build(new File("ExBank.xml"));
//		}catch (JDOMException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//get root elem
//		Element root = xml.getRootElements();
//		
//		System.out.println("Root element of XML document is: " + root.getName());
//		System.out.println("Number of children: " + root.getChildren().size());
//		
//		List Account = root.getChildren();
//		
//		//iterate over children
//		Iterator itr = Account.iterator();
//		while(itr.hasNext()) {
//			Element Account = (Element) itr.next();
//			
//			System.out.println("Account ID is: " + Account.getAttributeValue("ID"));
//			System.out.println("Customer is: " + root.getChildText("Customer"));
//			
//		}

	}

}
