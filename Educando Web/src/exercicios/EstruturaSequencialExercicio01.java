package exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio01 {
	/* Faça um programa para ler dois valores inteiros, 
	e depois mostrar na tela a soma desses números com uma
	mensagem explicativa, conforme exemplos.*/
	// 10         | -30         | 0
	// 20         | 10          | 0
	// SOMA = 40  | SOMA = -20  | SOMA = 0 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
