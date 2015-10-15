/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import com.sun.org.apache.xerces.internal.impl.xs.XMLSchemaLoader;
import com.sun.org.apache.xerces.internal.xs.XSConstants;
import com.sun.org.apache.xerces.internal.xs.XSModel;
import com.sun.org.apache.xerces.internal.xs.XSNamedMap;
import com.sun.org.apache.xerces.internal.xs.XSNamespaceItem;
import com.sun.org.apache.xerces.internal.xs.XSNamespaceItemList;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Samuel
 */
public class tester {
    public static void main(String[] args) {
        
        /*try {
            XMLSchemaLoader loader = new XMLSchemaLoader();
            XSModel model = loader.loadURI(new File("src\\java\\data\\landlord.xsd").toURI().toString());
            XSNamedMap map = model.getComponents(XSConstants.ELEMENT_DECLARATION);  //returns the root component 
            XSNamespaceItemList mapList =  model.getNamespaceItems();
            //XSNamespaceItemList itemlist = xsmodel.getNamespaceItems();
            for (int j = 0; j < mapList.getLength(); j++) {
                    String name = mapList.get(j).toString(); //returns 'country' correctly.                    
                    System.out.println("Printing: "+name);
                }
            
            System.out.println("List: "+mapList.toString());
            //XSNamespaceItem namespaceItem = map.;
            if (map != null) {
                for (int j = 0; j < map.getLength(); j++) {
                    String name = map.item(j).getName(); //returns 'country' correctly.                    
                    System.out.println("Printing: "+name);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
        Path currentRelativePath = Paths.get("");
String s = currentRelativePath.toAbsolutePath().toString();
System.out.println("Current relative path is: " + s);
}}
