/*
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */


package produtos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removeProd")
public class RemoveProdSevlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request,
			HttpServletResponse response)
	        throws ServletException,IOException{
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.rmvProd(id);
		
		response.sendRedirect("listaProduto");
	}
}
