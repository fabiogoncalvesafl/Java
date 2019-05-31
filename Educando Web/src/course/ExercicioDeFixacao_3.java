package course;

import java.util.Scanner;

public class ExercicioDeFixacao_3 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler três números inteiros na mesma linha, separados por espaço em branco.
		 * Em seguida, mostrar na tela qual é o maior dos números lidos. Se houver empate, mostrar apenas um.
		 * Saida: Higher = 
		 */
		Scanner sc = new Scanner(System.in);
		// 4 10 7 | 7 3 7 | 9 9 9
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Higher = " + n1);
		}
		else if(n2 > n3) {
			System.out.println("Higher = " + n2);
		}
		else {
			System.out.println("Higher = "+ n3);
		}
		
		sc.close();
	}

}
