package br.com.learning;

public class TestaAula {

	
	public static void main(String[] args) {
		
		
		Curso curso = new Curso("teste 1", "Teste 2");
		
		curso.adiciona(new Aula("teste", 1));
		curso.adiciona(new Aula("teste", 2));
		
		System.out.println(curso);
		
		
	}
	
}
