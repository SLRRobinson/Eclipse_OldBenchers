package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Warenkorb
 */
public class Warenkorb extends HttpServlet {
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
		
		out.println("<p style='color:green'>Sie haben das Buch Inside Servlet In Ihre Wahrenkorb gelegt</p>");

		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Warenkorb</A>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Bestellen</A>");

		out.println("<p></p>");

		out.println("<p></p>");

		out.println("<p>Bitte W&#228;hlen Sie aus unserer Auswahl</p>");

		out.println("<table border='0' cellpadding='6'>");
		out.println("<tr>");

		out.println("<th>PREIS</th>");
		out.println("<th>TITLE</th>");
		out.println("<th>KAUFEN</th>");
		out.println("<tr>");
		out.println("<td>Preis:<input type='text' preis='buchPreis'value='SFr.10.95' size='7'/> </td>");
		out.println("<td>Java Servlet Programming <br />von Jason Hunter  </td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");

		out.println("<tr>");
		out.println("<td>Preis:<input type='text' preis='buchPreis'value='SFr.19.75'size='7' /> </td>");
		out.println("<td>Developing Java Servlet <br />von James Goodwill  </td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");

		out.println("<tr>");
		out.println("<td>Preis:<input type='text' preis='buchPreis'value='SFr.18.50'size='7' /> </td>");
		out.println("<td>Inside Servlets <br />von Dustin R. Callaway  </td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");

		out.println("<tr>");
		out.println("<td>Preis:<input type='text' preis='buchPreis'value='SFr.20.10' size='7'/> </td>");
		out.println("<td>Java Servlets by Example <br />von Alan R. Williamson  </td>");
		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");

		out.println("<tr>");
		out.println("<td>Preis:<input type='text' preis='buchPreis'value='SFr.17.75'size='7' /> </td>");

		out.println("<td>Java Servlets  <br />von Karl Moss</td>");

		out.println(
				"<td><A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A></td>");
		out.println("</table><br />");
		
		
	}

}
