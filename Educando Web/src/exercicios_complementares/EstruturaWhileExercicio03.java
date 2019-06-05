package exercicios_complementares;

import java.util.Scanner;

public class EstruturaWhileExercicio03 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. um algoritmo para ler o tipo de combustível
		 * abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
		 * deve ser solicitado um novo código (até que seja válido). O programa será
		 * encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo. 8 1 7 2 2 4 Resposta:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java
		 */
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
