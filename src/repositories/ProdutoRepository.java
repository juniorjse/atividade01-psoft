package repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import models.Produto;

public class ProdutoRepository {
	
	Map<String, Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<String, Produto>();
	}

	public Collection<Produto> getAll() {
		return produtos.values();
	}
	
	public Produto getProd(String id) {
		return this.produtos.get(id);
	}
	
	public String addProduto(Produto prod) {
		this.produtos.put(prod.getId(), prod);
		return(prod.getId());
	}
}
