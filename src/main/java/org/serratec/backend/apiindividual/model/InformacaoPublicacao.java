package org.serratec.backend.apiindividual.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;

@Embeddable
public class InformacaoPublicacao {

	private String autor;
	private LocalDate dataPublicacao;
	private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
}
