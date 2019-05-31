package br.com.dev.javacore.introducaoclasses.test;

import br.com.dev.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args){
		Professor professor = new Professor();
		professor.nome = "William";
		professor.matricula = "2020";
		professor.rg = "2.222.222";
		professor.cpf = "999.999.999-99";
		Professor professor2 = new Professor();
		professor2.nome = "Hebert";
		professor2.matricula = "1010";
		professor2.rg = "1.111.111";
		professor2.cpf = "111.111.111-11";
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.rg);
		System.out.println(professor.cpf);
		System.out.println("----------------------------------");
		System.out.println(professor2.nome);
		System.out.println(professor2.matricula);
		System.out.println(professor2.rg);
		System.out.println(professor2.cpf);
	}
}