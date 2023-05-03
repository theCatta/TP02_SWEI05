/*
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */


package produtos;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaProduto")
public class ListaProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		Banco banco = new Banco();
		List<Produto> lista= banco.getProdutos();
		
		request.setAttribute("produto", lista);
		
		RequestDispatcher rd=request.getRequestDispatcher("/listaProduto.jsp");
		rd.forward(request, response);	
	}	
}
