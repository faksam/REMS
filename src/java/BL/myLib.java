package BL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class myLib {
    
    @SuppressWarnings("finally")
    
    //xmlFile
    private String xmlFile;

    public static String getxmlFile() {
        return "C:\\\\Users\\Samuel\\Documents\\NetBeansProjects\\REMS\\src\\java\\data\\database.xml";
    }

    public static String keyin(String inputMsg) {

        System.out.print(inputMsg);
        String s = "";

        try {
            BufferedReader bufferRead = new BufferedReader(
                    new InputStreamReader(System.in));
            s = bufferRead.readLine();
            System.out.println("Debug info: " + s);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return s;
        }
    }


    public static void AddUser(String user_value) {
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            Element rootElement = xmlDoc.getRootElement();
            Element users = rootElement.getChild("users");
            Element user = new Element(user_value.toLowerCase());
            
            Element name = new Element("name");
            Element username = new Element("username");
            Element password = new Element("password");
            Element account_type = new Element("account_type");

            user.addContent(name);
            user.addContent(username);
            user.addContent(password);
            user.addContent(account_type);

            name.setText("Fakunle Samuel");
            username.setText("faksam");
            password.setText("password");
            account_type.setText("Admin");

            users.addContent(user);

            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            //String xmlFile = "src\\notes.xml";
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));
            System.out.println("Generate XML file is finished");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static boolean SearchUser(String Username,String Password,String AccountType) {
        Boolean isFound = false;
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

            Element rootElement = xmlDoc.getRootElement();
            Element users = rootElement.getChild(AccountType.toLowerCase()+"s");

            //String node_name = myLib.keyin("Please Enter The Name of LandLord you need to search: ");
            
            List<Element> lstNodes = users.getChildren();
            for (int i = 0; i < lstNodes.size(); i++) {
                Element node = (Element) lstNodes.get(i);
                String _n_id = node.getAttributeValue("id");
                String _nodeName = node.getChildText("name");
                String _Username = node.getChildText("username");
                String _Password = node.getChildText("password");
                String _AccountType = node.getChildText("account_type");
                
                if ( _Username.equalsIgnoreCase(Username) && _Password.equalsIgnoreCase(Password) && 
                        _AccountType.equalsIgnoreCase(AccountType)) {
                    isFound = true;
                    String name = node.getChildText("name");
                    String username = node.getChildText("username");
                    String password = node.getChildText("password");
                    String account_type = node.getChildText("account_type");
                    
                    System.out.println("We found a landlord with Name " + name + "; Username: "  + username);
                    
                    break;
                    
                }

            }
            if (!isFound) {
                System.out.println("Sorry, we don't find out any note with Username: " + Username);
            }
            System.out.println("Finished search!");
        } catch (Exception e) {
            // TODO: handle exception
        }
        return isFound;
    }

    public static void UpdateUser(String user_value) {
        Boolean isFound = false;
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

            Element rootElement = xmlDoc.getRootElement();
            Element users = rootElement.getChild(user_value.toLowerCase()+"s");

            String node_name = myLib.keyin("Please Enter The Name of LandLord you need to search: ");

            
            List<Element> lstNodes = users.getChildren();
            for (int i = 0; i < lstNodes.size(); i++) {
                Element node = (Element) lstNodes.get(i);
                String nodeName = node.getChildText("name");
                
                if (nodeName.equalsIgnoreCase(node_name)) {
                    isFound = true;
                    
                    String name = myLib.keyin("Enter new name for landlord: ");
                    String username = myLib.keyin("Enter new username for landlord: ");
                    String password = myLib.keyin("Enter new password for landlord: ");
                    String account_type = myLib.keyin("Enter new account_type for landlord: ");
                    //new code for update new value
                    node.getChild("name").setText(name);
                    node.getChild("username").setText(username);				
                    node.getChild("password").setText(password);
                    node.getChild("account_type").setText(account_type);				

                    break;
                }

            }
            if (!isFound) {
                System.out.println("Sorry, we don't find out any note with id: " + node_name);
            }
            
            else
            {
                    XMLOutputter outFile = new XMLOutputter();
                    outFile.setFormat(Format.getPrettyFormat());
                    outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
                    System.out.println("Updated succefully!");
            }
            System.out.println("Finished updating!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void DeleteUser(String user_value) {

        Boolean isFound = false;
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

            Element rootElement = xmlDoc.getRootElement();
            Element users = rootElement.getChild(user_value.toLowerCase()+"s");

            String node_name = myLib.keyin("Please Enter The Name of LandLord you need to search: ");

            
            List<Element> lstNodes = users.getChildren();
            for (int i = 0; i < lstNodes.size(); i++) {
                Element node = (Element) lstNodes.get(i);
                String nodeName = node.getChildText("name");
                
                if (nodeName.equalsIgnoreCase(node_name)) {
                    isFound = true;
                    
                    node.detach();
                    break;
                }

            }
            if (!isFound) {
                System.out.println("Sorry, we don't find out any note with id: " + node_name);
            }
            
            else
            {
                    XMLOutputter outFile = new XMLOutputter();
                    outFile.setFormat(Format.getPrettyFormat());
                    outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
                    System.out.println("Updated succefully!");
            }
            System.out.println("Finished updating!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    

    public static void AddCommercialProperty(String property_value) {
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element commercialProperties = properties.getChild(property_value+"Properties");
            
            Element commercialProperty = new Element(property_value+"Property");
            
            Element address = new Element("address");
            Element price = new Element("price");
            Element description = new Element("description");
            Element status = new Element("status");
            Element landlord = new Element("landlord");
            Element building = new Element("building");
            Element comType = new Element("comType");

            commercialProperty.addContent(address);
            commercialProperty.addContent(price);
            commercialProperty.addContent(description);
            commercialProperty.addContent(status);
            commercialProperty.addContent(landlord);
            commercialProperty.addContent(building);
            commercialProperty.addContent(comType);

            address.setText("Fakunle Samuel");
            price.setText("faksam");
            description.setText("password");
            status.setText("Admin");
            landlord.setText("Fakunle Samuel");
            building.setText("faksam");
            comType.setText("password");

            commercialProperties.addContent(commercialProperty);

            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));
            System.out.println("Generate XML file is finished");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void AddResidentialProperty(String property_value) {
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element residentialProperties = properties.getChild(property_value+"Properties");
            
            Element residentialProperty = new Element(property_value+"Property");
            
            Element address = new Element("address");
            Element price = new Element("price");
            Element description = new Element("description");
            Element status = new Element("status");
            Element landlord = new Element("landlord");
            Element no_rooms = new Element("no_rooms");
            Element no_bath = new Element("no_bath");
            Element livingArea = new Element("livingArea");
            Element resType = new Element("resType");

            residentialProperty.addContent(address);
            residentialProperty.addContent(price);
            residentialProperty.addContent(description);
            residentialProperty.addContent(status);
            residentialProperty.addContent(landlord);
            residentialProperty.addContent(no_rooms);
            residentialProperty.addContent(no_bath);
            residentialProperty.addContent(livingArea);
            residentialProperty.addContent(resType);

            address.setText("Fakunle Samuel");
            price.setText("faksam");
            description.setText("password");
            status.setText("Admin");
            landlord.setText("Fakunle Samuel");
            no_rooms.setText("faksam");
            no_bath.setText("password");
            livingArea.setText("Admin");
            resType.setText("Fakunle Samuel");

            residentialProperties.addContent(residentialProperty);

            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));
            System.out.println("Generate XML file is finished");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void AddVacantLandProperty(String property_value) {
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element vacantLandProperties = properties.getChild(property_value+"Properties");
            
            Element vacantLandProperty = new Element(property_value+"Property");
            
            Element address = new Element("address");
            Element price = new Element("price");
            Element description = new Element("description");
            Element status = new Element("status");
            Element landlord = new Element("landlord");
            Element size = new Element("size");

            vacantLandProperty.addContent(address);
            vacantLandProperty.addContent(price);
            vacantLandProperty.addContent(description);
            vacantLandProperty.addContent(status);
            vacantLandProperty.addContent(landlord);
            vacantLandProperty.addContent(size);

            address.setText("Fakunle Samuel");
            price.setText("faksam");
            description.setText("password");
            status.setText("Admin");
            landlord.setText("Fakunle Samuel");
            size.setText("faksam");

            vacantLandProperties.addContent(vacantLandProperty);

            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));
            System.out.println("Generate XML file is finished");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void SearchProperty(String property_value) {
        Boolean isFound = false;
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element BeDeletedProp = properties.getChild(property_value+"Properties");
            
            String node_name = myLib.keyin("Please Enter The Name of LandLord you need to search: ");
            
            List<Element> lstNodes = BeDeletedProp.getChildren();
            for (int i = 0; i < lstNodes.size(); i++) {
                Element node = (Element) lstNodes.get(i);
                
                String nodeName = node.getChildText("name");
                
                if (nodeName.equalsIgnoreCase(node_name)) {
                    isFound = true;
                    String name = node.getChildText("name");
                    String username = node.getChildText("username");
                    String password = node.getChildText("password");
                    String account_type = node.getChildText("account_type");
                    
                    System.out.println("We found a landlord with Name " + name + "; Username: "  + username);
                    break;
                }

            }
            if (!isFound) {
                System.out.println("Sorry, we don't find out any note with id: " + node_name);
            }
            System.out.println("Finished search!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public static void DeleteProperty(String property_value) {

        Boolean isFound = false;
        try {
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element BeDeletedProp = properties.getChild(property_value+"Properties");
            
            String node_name = myLib.keyin("Please Enter The Name of LandLord you need to search: ");

            
            List<Element> lstNodes = BeDeletedProp.getChildren();
            for (int i = 0; i < lstNodes.size(); i++) {
                Element node = (Element) lstNodes.get(i);
                String nodeName = node.getChildText("name");
                
                if (nodeName.equalsIgnoreCase(node_name)) {
                    isFound = true;
                    
                    node.detach();
                    break;
                }

            }
            if (!isFound) {
                System.out.println("Sorry, we don't find out any note with id: " + node_name);
            }
            
            else
            {
                    XMLOutputter outFile = new XMLOutputter();
                    outFile.setFormat(Format.getPrettyFormat());
                    outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
                    System.out.println("Updated succefully!");
            }
            System.out.println("Finished updating!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public static void UpdateCommercialProperty() {

    }

    public static void UpdateResidentialProperty() {
        
    }

    public static void UpdateVacantLandProperty() {
        
    }

}
