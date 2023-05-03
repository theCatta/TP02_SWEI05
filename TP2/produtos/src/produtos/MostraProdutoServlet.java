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

@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String paramId = request.getParameter("id");
		Integer id= Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Produto produto = banco.srcProd(id);
		
		System.out.println(produto.getNome());
		
		request.setAttribute("produto", produto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProd.jsp");
		rd.forward(request, response);
	}
}
