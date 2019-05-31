package br.com.dev.introducao.controledefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 14;
        String status;
        //Utilizar operadores ternarios somente com no maximo duas condicoes
        //status = idade < 18 ? <true> : <false> ;
        //status = idade < 18 ? "Nao Adulto" : "Adulto";
        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";
        System.out.println(status);
    }
}
