package br.com.dev.introducao.exercicios;
public class Exercicio05 {
    //imprima todos os numeros pares de 0 até 100000
    public static void main(String[] args) {
        int numeros = 100000;
        for(int i = 0; i <= numeros; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
