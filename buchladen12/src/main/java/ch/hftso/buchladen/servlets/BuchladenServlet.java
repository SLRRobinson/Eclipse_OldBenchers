package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HFT-SO Modul 6x4 WA 1 Aufbau eines Buchladens mit Servlets. Einstiegsseite.
 * 
 * @author ?
 * @version 1.0 / 21.04.2012
 */
public class BuchladenServlet extends HttpServlet {
	private static final long serialVersionUID = 1596798256674485229L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/banner");
		if (dispatcher != null) {
			dispatcher.include(request, response);
		}

		PrintWriter out = response.getWriter();

		out.println("<p>Inside Servlets</p>");
		out.println("<p>Autor:Dustin R. Callaway</p>");
		out.println("<p>Jahr:2003</p>");
		out.println("<p>Beschreibung:Gute Session Ausf&#252;hrungen</p>");
	
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">In den Warenkorb</A>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A>");

		out.println("<p></p>");
		
		out.println("<a href='./Produktauswahl?'>Produktauswahl</a>");

		
		/**
		out.println("<p style='color:orange'>Bitte W&#228;hlen Sie aus unserer Auswahl </p>");
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

		out.println("<p style='color:green'>Sir haben gel&#246;scht: Developing Java Servlets</p>");
		out.println("<p>Ihre Warenkorb ist leer!</p>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A>");

		out.println("<p></p>");

		out.println("<p>Ihre Einkaufssumme ist: SFr. 18.50</p>");
		out.println(
				"<p style='color:orange'>Damit wir Ihre Bestellung erledigen k&#246;nnen, brauchen wir die folgenden <br /> informationen:</p>");

		out.println("<form action='myservlet' autocomplete='on'>");
		out.println("First name:<input type='text' name='fname'><br />");
		out.println(" Kartennummer: <input type='text' knummer='xxx'><br />");
		out.println("<input type='Submit'> ");

		out.println(" </form>");

		out.println("<p></p>");

		out.println("<p style='color:red'>Vielen Dank Ruedi Baumman f&#252;r Ihre Bestellung.</p>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Beenden</A>");

		out.println("<form>");
		out.println("Operand1:<input type='number' operand='operand1' <br /> ");
		out.println("Operand2:<input type='number' operand='operand2' <br /> ");
		out.println("<input type='radio' name='addieren'>");
		out.println("<input type='radio' name='dividieren'>");
		out.println("<input type='radio' name='subtrahieren'>");
		out.println("<input type='radio' name='multiplizieren' value='multiplizieren'>");
		out.println("</form>");
		
		*/

		out.println("<p></p>");

	}
}
