package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Warenkorbzustand
 */
public class Warenkorbzustand extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/banner");
		if (dispatcher != null) {
			dispatcher.include(request, response);
		}

		PrintWriter out = response.getWriter();
		
		out.println("<p style='color:green'>Sir haben gel&#246;scht: Developing Java Servlets</p>");
		out.println("<p>Ihre Warenkorb ist leer!</p>");
		out.println(
				"<A HREF=.\"home/robinson/Documents/Mavenworkbench/Praktika_Servlet_Buchladen_Vorlage/Buchladen_Vorlage/buchladen/src/main/webapp/Hello.htm\">Weiter Einkaufen</A>");

		out.println("<p></p>");
		

	}

}
