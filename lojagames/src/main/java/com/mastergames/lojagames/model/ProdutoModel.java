package com.mastergames.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_produtos")
public class ProdutoModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id; 

		@NotBlank(message = "O atributo nome é obrigatório e não pode utilizar espaços em branco!") 
		@Size(min = 4, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
		private String nomeProduto;
		
		@NotBlank(message = "O atributo fabricante é obrigatório e não pode utilizar espaços em branco!") 
		@Size(min = 4, max = 100, message = "O atributo fabricante deve conter no mínimo 05 e no máximo 100 caracteres")
		private String fabricante;
		
		@UpdateTimestamp
		private LocalDateTime datacompra;
		
		@NotNull
		private BigDecimal preco;
		
		private int quantidade;

		@ManyToOne
		@JsonIgnoreProperties("produto")
		private CategoriaModel categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public LocalDateTime getDatacompra() {
			return datacompra;
		}

		public void setDatacompra(LocalDateTime datacompra) {
			this.datacompra = datacompra;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public CategoriaModel getCategoria() {
			return categoria;
		}

		public void setCategoria(CategoriaModel categoria) {
			this.categoria = categoria;
		}
}
