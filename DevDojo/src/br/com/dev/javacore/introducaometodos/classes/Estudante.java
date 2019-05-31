package br.com.dev.javacore.introducaometodos.classes;

public class Estudante {
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;
	
	public void imprime(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		if(notas != null){
			for(double nota: notas){
				System.out.print(nota+" ");
			}
		}
	}
	
	public void tirarMedia(){
		if(notas == null){
			System.out.println("Esse estudante nao possui notas");
			return;
		}
		double media = 0;
		for(double nota: notas){
			media += nota;
		}
		media = media / notas.length;
		
		if(media > 6){
			this.aprovado = true;
			System.out.println("\nA media e: "+media+" situacao: Aprovado");
		}else{
			this.aprovado = false;
			System.out.println("\nA media e: "+media+" situacao: Reprovado");
		}
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setNotas(double[] notas){
		this.notas = notas;
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public double[] getNotas(){
		return this.notas;
	}
//	Para valores boolean e recomendado utilizar "is"
	public boolean isAprovado(){
		return this.aprovado;
	}
}