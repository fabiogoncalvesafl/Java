package br.com.dev.javacore.introducaometodos.test;

import br.com.dev.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args){
		Estudante estudante = new Estudante();
		estudante.setNome("Fabio Goncalves");
		estudante.setIdade(34);
		estudante.setNotas(new double[]{8,7,9,5});
		estudante.imprime();
		estudante.tirarMedia();
//		System.out.println(estudante.getNome());
		System.out.println("Aprovado: "+estudante.isAprovado());
	}
}
