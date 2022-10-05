package services;

import java.util.Collection;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	LoteRepository loteRep;
	ProdutoRepository prodRep;
	
	public ProdutoService(LoteRepository loteRep, ProdutoRepository prodRep) {
		this.loteRep = loteRep;
		this.prodRep = prodRep;
	}
	
	public String addProduto(Produto p) {
		this.prodRep.addProduto(p);
		return p.getId();
	}
	
	public Collection<Produto> listarProdutos() {
		return this.prodRep.getAll();
	}
	
}
