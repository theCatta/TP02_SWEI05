/*
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */

package produtos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Creditos")
public class Creditos extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Instituto Federal de S�o Paulo - Cubat�o</h1>");
		out.println("<h2>Disciplina SISTEMAS WEB I - TP02</h2>");
		out.println("<h1>Alunos:</h1>");
		out.println("<h2>Gabriel Ferreira de Souza CB3015491</h2>");
		out.println("<h2>Guilherme Ferreira Santos CB3015629</h2>");
		out.println();
		out.println("<a href='/produtos'>Inicio</a>");
		out.close();
	}
	
}
