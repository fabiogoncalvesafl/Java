package br.com.dev.introducao.exercicios;
public class Exercicio04 {
    /**
     * Crie um switch que dado um valor de 1 a 7
     * considerando 1 domingo imprima se e dia util ou final de semana
     */
    public static void main(String[] args) {
        byte dia = 1;
        /*switch (dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia Util");
                break;
            case 3:
                System.out.println("Terca");
                System.out.println("Dia Util");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia Util");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia Util");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia Util");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }*/
        switch (dia){
            case 1: case 7:
                System.out.println("Final de Semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
