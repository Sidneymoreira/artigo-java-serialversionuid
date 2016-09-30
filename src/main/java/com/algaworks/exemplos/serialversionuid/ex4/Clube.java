package com.algaworks.exemplos.serialversionuid.ex4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Clube implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private int titulos;
	
	private LocalDate nascimento;
	
	private transient String hino;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		
		out.writeObject(hino);
		
		System.out.println("Serializacao customizada.");
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		
		hino = (String) in.readObject();
		
		System.out.println("Desserializacao customizada.");
	}
	
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
	
	public String getHino() {
		return hino;
	}
	
	public void setHino(String hino) {
		this.hino = hino;
	}
}