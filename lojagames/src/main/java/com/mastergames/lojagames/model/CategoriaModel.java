package com.mastergames.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_categorias")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 4, max = 100)
	private String categoriaProduto;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCategoriaProduto() {
		return categoriaProduto;
	}


	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}


	public List<ProdutoModel> getProduto() {
		return produto;
	}


	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	
	
	
}
