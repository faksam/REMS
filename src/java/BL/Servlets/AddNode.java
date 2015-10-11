/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.Servlets;

import static BL.myLib.keyin;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Samuel
 */
@WebServlet(name = "Users", urlPatterns = {"/Users"})
public class AddNode extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddUser at " + request.getContextPath() + "</h1>");
            String NodeType="residentialProperties";
            Boolean isFound = false;
     try {
		String note_id = keyin("Please Enter note id you need to search: ");
		SAXBuilder saxBuilder = new SAXBuilder();
		String xmlFile = "src\\database.xml";
		Document xmlDoc = saxBuilder.build(new File(xmlFile));
		Element rootElement = xmlDoc.getRootElement();
                //
                List<Element> ListNodeType = rootElement.getChildren(NodeType);
                //
		List<Element> lstNotes = rootElement.getChildren();
		for (int i = 0; i < lstNotes.size(); i++) {
			Element note = (Element)lstNotes.get(i);
			String n_id = note.getAttributeValue("id");
			System.out.println("Note id: "+ n_id);
			if(note_id.equalsIgnoreCase(n_id))
			{
				isFound=true;
				String name =note.getChildText("name");
				String value = note.getAttributeValue("value");
				System.out.println("We found a note with id " + note_id+ "; name: "+ name+ "Value: "+ value);
				break;
			}
			
		}
		if(!isFound)
		{
			System.out.println("Sorry, we don't find out any note with id: "+ note_id);
		}
		System.out.println("Finished search!");
	} catch (Exception e) {
		// TODO: handle exception
	}
            out.println("</body>");
            out.println("</html>");
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
