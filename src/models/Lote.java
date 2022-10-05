package models;
import java.util.Date;
import java.util.UUID;

public class Lote {
	
	private String id;
	private Long quantidade;
	private Produto produto;
	//como é requerido a data de validade, logo deve haver a data de fabricação
	private Date dataFabricacao;
	private Date dataValidade;
	
	public Lote(Produto produto, Long quantidade) {
		
		this.id = UUID.randomUUID().toString();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}

	public Long getQuantidade() {
		return quantidade;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public String toString() {
		return "ID: " + getId() + " Produto: " + getProduto().getNome() + " - " + getQuantidade() + " unidade(s)";
	}
}
