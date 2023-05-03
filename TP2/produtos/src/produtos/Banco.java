/*
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */


package produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static { 
		Produto default1=new Produto();
		default1.setId(chaveSequencial++);
		default1.setNome("Default");
		default1.setDescricao("Componente utilizado apenas para teste");
		default1.setUnidadeCompra(99);
		default1.setPrecoMaxComprado(99);
		default1.setQtdPrevistoMes(99);
		lista.add(default1);
	}
	
		//Adicionar a lista
		public void addProd(Produto prod) {
			prod.setId(Banco.chaveSequencial++);
			Banco.lista.add(prod);
		}
		//Listar produtos
		public List<Produto> getProdutos() {
			return Banco.lista;
		}
		//remover produtos
		public void rmvProd(long  id) {
			Iterator<Produto> it= lista.iterator();
			while(it.hasNext()){			
				Produto pdt=it.next();		
				if(pdt.getId()==id) {
					it.remove();
				}
				
			}
		}	
		//retornar produto
		public Produto srcProd(long id) {
			for(Produto prod:lista) {
				if(prod.getId()==id) {
					return prod;
				}
			}
			return null;		
		}
}


