package br.com.dev.introducao.controledefluxo;
public class ControleDeFluxo6 {
    public static void main(String[] args) {
        //Dado um valor de um carro descura em quantas vezes pode ser parcelado
        //Por?m as parcelas n?o podem ser menores do que 1000

        double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela<= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
