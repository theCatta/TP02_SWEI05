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

@WebServlet("/alteraProd")
public class AlteraProdServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Alterando produto");
		
		String nomeProd = request.getParameter("nome");
		Integer unidProdStg = Integer.valueOf(request.getParameter("unidadeCompra"));
		String descProd = request.getParameter("descricao");
		Double prevProdStg = Double.valueOf(request.getParameter("qtdPrevistoMes"));
		Double maxProdStg = Double.valueOf(request.getParameter("precoMaxComprado"));
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		System.out.println(id);
		Banco banco = new Banco();
		Produto prod = banco.srcProd(id);
		
		prod.setNome(nomeProd);
	 	prod.setUnidadeCompra(unidProdStg); 
		prod.setDescricao(descProd);
		prod.setQtdPrevistoMes(prevProdStg);
		prod.setPrecoMaxComprado(maxProdStg);
		try {
			response.sendRedirect("listaProduto");
		} catch(IOException exc) {
		    throw new RuntimeException("Erro ao redirecionar para lista de produtos", exc);
		}
		
	}
}
