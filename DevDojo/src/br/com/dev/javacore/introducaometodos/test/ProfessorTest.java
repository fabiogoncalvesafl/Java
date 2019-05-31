package br.com.dev.javacore.introducaometodos.test;

import br.com.dev.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args){

		Professor prof = new Professor();
		prof.nome = "Fabio";
		prof.matricula = "1111";
		prof.rg = "1.111.111";
		prof.cpf = "111.111.111-11";

		Professor prof2 = new Professor();
		prof2.nome = "William";
		prof2.matricula = "2222";
		prof2.rg = "2.222.222";
		prof2.cpf = "222.222.222-22";

		prof.imprime();
		prof2.imprime();
		//prof.imprime(prof2);
	}
}