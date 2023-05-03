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

@WebServlet("/novoProd")
public class NovoProdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			System.out.println("Cadastrando novo produto");
			
			String nomeProd = request.getParameter("nome");
			Integer unidProdStg = Integer.valueOf(request.getParameter("unidadeCompra"));
			String descProd = request.getParameter("descricao");
			Double prevProdStg = Double.valueOf(request.getParameter("qtdPrevistoMes"));
			Double maxProdStg = Double.valueOf(request.getParameter("precoMaxComprado"));
			
			/*int unidProdInt = Integer.parseInt(unidProdStg);
			double prevProdDob = Double.parseDouble(prevProdStg);
			double maxProdDob = Double.parseDouble(maxProdStg);*/
			
			Produto prod = new Produto();
			prod.setNome(nomeProd);
		 	prod.setUnidadeCompra(unidProdStg); 
			prod.setDescricao(descProd);
			prod.setQtdPrevistoMes(prevProdStg);
			prod.setPrecoMaxComprado(maxProdStg);
			
			Banco banco = new Banco();
			banco.addProd(prod);
			
			RequestDispatcher rd =
				request.getRequestDispatcher("/formNovoProd.jsp");
				request.setAttribute("produto", prod);
				rd.forward(request, response);
	}
}
