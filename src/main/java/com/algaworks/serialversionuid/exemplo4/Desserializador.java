package com.algaworks.serialversionuid.exemplo4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desserializador {

	public static void main(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("/tmp/saopaulo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Clube clube = (Clube) ois.readObject();
		ois.close();

		System.out.println("Pronto! Objeto desserializado.");
		System.out.println("Nome: " + clube.getNome() + ", Hino: " + clube.getHino());
	}
}