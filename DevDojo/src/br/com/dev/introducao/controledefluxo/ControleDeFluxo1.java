package br.com.dev.introducao.controledefluxo;
public class ControleDeFluxo1{
	/*
	* if (Se) 
	* else (Sen?o)	
	*/	
	public static void main(String[] args){
		
		int idade = 61;
		String categoria;
		
		if(idade < 15){
			categoria = "Categoria Infantil";
		}else if(idade >= 15 && idade < 18){
			categoria = "Categoria Juvenil";
		}else if(idade >= 18 && idade < 60){
			categoria = "Categoria Adulto";
		}else{
			categoria = "Categoria Terceira Idade";
		}
		System.out.println(categoria);	
	}
}