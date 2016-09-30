package com.algaworks.exemplos.serialversionuid.ex3;

import java.time.LocalDate;

public class Clube implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private int titulos;
	
	private LocalDate nascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTitulos() {
		return titulos;
	}
	
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}	
}