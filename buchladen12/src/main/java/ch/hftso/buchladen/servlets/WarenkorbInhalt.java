package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WarenkorbInhalt
 */
public class WarenkorbInhalt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/banner");
		if (dispatcher != null) {
			dispatcher.include(request, response);
		}

		PrintWriter out = response.getWriter();

		
		out.println("<p style='color:orange'>Ihr  W&#228;hrenkorb enh&#228;lt : 1 Buch</p>");
		out.println("<table border='0' cellpadding='6'>");
		out.println("<tr>");

		out.println("<th>ANZAHL</th>");
		out.println("<th>TITLE</th>");
		out.println("<th>PREIS</th>");
		out.println("<tr>");
		out.println("<td>1 </td>");
		out.println("<td>Inside Servlet </td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">L&#246;schen</A></td>");

		out.println("<tr>");
		out.println("<td></td>");
		out.println("<td>Total: </td>");
		out.println("<td>SFr.18.50</td>");

		out.println("<tr>");

		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Bestellen</A></td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">L&#246;sche Warenkorb</A></td>");

		out.println("</table><br />");
	}

}
