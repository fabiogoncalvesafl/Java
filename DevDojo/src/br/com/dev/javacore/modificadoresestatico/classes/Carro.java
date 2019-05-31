package br.com.dev.javacore.modificadoresestatico.classes;

public class Carro {
//	velocidade limite deve ser de 240KM/h
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {

	}
	
	public void imprime(){
		System.out.println("----------------------------------------------");
		System.out.println("Modelo: "+this.nome);
		System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
		System.out.println("Velociade limite: "+velocidadeLimite);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
//	public double getVelocidadeLimite() {
//		return velocidadeLimite;
//	}
//	public void setVelocidadeLimite(double velocidadeLimite) {
//		this.velocidadeLimite = velocidadeLimite;
//	}
}
