package exercicios_complementares;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicio06 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia três valores com ponto flutuante 
		 * de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.	
		 * 
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java	 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTriangulo = (A * C) / 2;
		double areaCirculo = pi * (C * C); 
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		
		sc.close();
	}

}
