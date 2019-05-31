package br.com.dev.introducao.exercicios;
public class Exercicio03 {
    /**
     * Exercicio - Imposto
     *
     * Crie uma variavel salario e imprima seu imposto
     * imposto:
     * salario < 1000 5%
     * salario >= 1000 && salario < 2000 10%
     * salario >= 2000 && salario < 4000 15%
     * salario > 4000 20%
     * @param args
     */
    public static void main(String[] args) {
        float salario = 900;
        float totalImposto = 0;
        if(salario < 1000){
            totalImposto = salario *= 0.05;
            System.out.println("Vai pagar 5% de imposto: "+totalImposto+" Reais");
        }else if(salario >= 1000 && salario < 2000){
            totalImposto = salario *= 0.1;
            System.out.println("Vai pagar 10% de imposto: "+totalImposto+" Reais");
        }else if(salario >= 2000 && salario < 4000){
            totalImposto = salario *= 0.15;
            System.out.println("Vai pagar 15% de imposto: "+totalImposto+" Reais");
        }else{
            totalImposto = salario *= 0.2;
            System.out.println("Vai pagar 20% de imposto: "+totalImposto+" Reais");
        }
    }
}
