package br.com.learning;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	
	public static void main(String[] args) {
		
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		
		
		aulas.forEach(aula -> {
			System.out.println("for-each");
			System.out.println(aula);
		});
		
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		System.out.println(aulas.size());
		
		
		aulas.add("Aumentando nosso conhecimento");
		aulas.add("Estudar sempre é fundamental");
		aulas.add("Estamos dispostos sempre a mudar");
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
	}
		
}
