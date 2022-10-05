import models.Lote;
import models.Produto;

import facades.Facade;

public class Sistema {
	
	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Bolacha1", "Fabricante01", 2.5);
		Produto prod2 = new Produto("Bolacha2", "Fabricante02", 2.2);
		Produto prod3 = new Produto("BatataFrita", "Pringles", 7.5);

		Lote l1 = new Lote(prod3, 1L);
		Lote l2 = new Lote(prod2, 15L);
		
		Facade mercadoFacade = new Facade();
		
		// Adicionando produto		
		mercadoFacade.criarProduto(prod1);
		mercadoFacade.criarProduto(prod2);
		mercadoFacade.criarProduto(prod3);
				
		// Adicionando lote
		mercadoFacade.criarLote(l1);
		mercadoFacade.criarLote(l2);
		
		System.out.println(mercadoFacade.listarProdutos());
		System.out.println(mercadoFacade.listarLotes());
	}
}
