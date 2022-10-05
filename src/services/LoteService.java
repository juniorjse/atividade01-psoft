package services;

import java.util.Collection;

import models.Lote;
import models.Produto;
import repositories.LoteRepository;

public class LoteService {

	private LoteRepository loteRep;
	
	public LoteService(LoteRepository rep) {
		this.loteRep = rep;
	}
	
	public String addLote(Lote lote) {
		this.loteRep.addLote(lote);
		return lote.getId();
	}

	public Collection<Lote> listarLotes() {
		return this.loteRep.getAll();
	}
	
	
}
