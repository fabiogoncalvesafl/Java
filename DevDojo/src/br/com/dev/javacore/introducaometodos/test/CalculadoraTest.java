package br.com.dev.javacore.introducaometodos.test;

import br.com.dev.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        double result = calc.divideDoisNumeros(10,2);
        System.out.println(result);
        calc.imprimindoDoisNumerosDivididos(200,0);
        System.out.println("Continuando a exec");
        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarargs(numeros);
        calc.somaVarargs(1,2,3,4,5);
    }    
}
