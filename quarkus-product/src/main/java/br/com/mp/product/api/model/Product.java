package br.com.mp.product.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Product extends PanacheEntity{
	
	@NotBlank(message="nome não pode estar em branco")
	private String nome;
	
	@NotBlank(message="marca não pode estar em branco")
	private String marca;
	
	@CreationTimestamp
	@NotNull
	@Column(name="ano_modelo")
	private  LocalDate anoModelo;
	
	@CreationTimestamp
	@NotNull
	@Column(name="cria_dt_hora", insertable = true)
	private  LocalDateTime criaDtHora;
	
	private BigDecimal preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(LocalDate anoModelo) {
		this.anoModelo = anoModelo;
	}

	public LocalDateTime getCriaDtHora() {
		return criaDtHora;
	}

	public void setCriaDtHora(LocalDateTime criaDtHora) {
		this.criaDtHora = criaDtHora;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	

}
