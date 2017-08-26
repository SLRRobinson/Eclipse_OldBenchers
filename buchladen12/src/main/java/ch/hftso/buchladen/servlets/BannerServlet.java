package ch.hftso.buchladen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HFT-SO Modul 6x4 WA 1
 * Aufbau eines Buchladens mit Servlets. 
 * Banner.
 * 
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
public class BannerServlet extends HttpServlet {
  private static final long serialVersionUID = -339597570490789422L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    request.setCharacterEncoding("utf-8");
    StringBuffer buffer = new StringBuffer();
    buffer.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
    buffer.append("<html><head>");
    buffer.append("<meta http-equiv='content-type' content='text/html; charset=utf-8'>");
    buffer.append("<title>Buchladen</title></head>");
    buffer.append("<body><div align='center'><hr><h1>");
    buffer.append("<img src='" + request.getContextPath());
    buffer.append("/images/logo_hftm.jpg' alt='HFTM'> ");
    buffer.append("Buchladen</h1><br><hr><br></div>");
    
    PrintWriter out = response.getWriter();
    out.println(buffer.toString());
  }
}
