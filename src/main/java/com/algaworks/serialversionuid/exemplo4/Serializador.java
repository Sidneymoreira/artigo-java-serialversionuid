package com.algaworks.serialversionuid.exemplo4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;

public class Serializador {

	public static void main(String... args) throws Exception {
		Clube oMelhorClube = new Clube();
		oMelhorClube.setNome("São Paulo Futebol Clube");
		oMelhorClube.setTitulos(2147483647);// por 1 não tenho que declarar long
		oMelhorClube.setNascimento(LocalDate.of(1930, Month.JANUARY, 27));
		oMelhorClube.setHino("Salve o tricolor paulista... Amado clube brasileiro.");

		FileOutputStream fos = new FileOutputStream("/tmp/saopaulo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oMelhorClube);
		oos.close();
		System.out.println("Pronto! Objeto serializado.");
	}
}
