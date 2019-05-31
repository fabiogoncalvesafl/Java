package br.com.dev.javacore.blocodeinicializacao.test;

import br.com.dev.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
	public static void main(String[] args){
		Cliente c = new Cliente();
		System.out.println("Exibir quantidade de parcelas");
		for(int parcela: c.getParcelas()){
			System.out.print(parcela+" ");
		}
	}
}
