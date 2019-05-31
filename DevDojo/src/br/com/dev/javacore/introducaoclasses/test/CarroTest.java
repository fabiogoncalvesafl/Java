package br.com.dev.javacore.introducaoclasses.test;

import br.com.dev.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
	public static void main(String[] args){
		Carro carro = new Carro();
		carro.modelo = "Siena";
		carro.placa = "JGA5824";
		carro.velocidadeMaxima = 200;
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		System.out.println(carro.velocidadeMaxima);
	}
}
