package br.com.dev.javacore.introducaoclasses.test;
import br.com.dev.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args){
		Estudante joao = new Estudante();
		joao.nome = "Joao";
		joao.matricula = "1212";
		joao.idade = 15;
		
		System.out.println(joao.nome);
		System.out.println(joao.matricula);
		System.out.println(joao.idade);
	}
}
