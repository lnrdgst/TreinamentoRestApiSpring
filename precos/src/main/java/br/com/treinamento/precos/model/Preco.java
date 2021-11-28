package br.com.treinamento.precos.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Preco {
	
	@Id
	private Long codigoProduto;
	
	private BigDecimal preco;


	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preco other = (Preco) obj;
		return Objects.equals(codigoProduto, other.codigoProduto);
	}
	
	
	
	
	

	public Preco(Long codigoProduto2, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
	}
}
