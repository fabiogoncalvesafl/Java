package br.com.dev.javacore.sobrecargaconstrutores.test;

import br.com.dev.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args){
		Estudante estudante = new Estudante("647826", "Fabio Goncalves", new double[]{6,7,8}, "27/09/2018");
		estudante.imprime();
	}
}