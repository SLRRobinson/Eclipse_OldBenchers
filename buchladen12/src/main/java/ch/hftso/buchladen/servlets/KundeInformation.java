package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KundeInformation
 */
public class KundeInformation extends HttpServlet {
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
	}

}
