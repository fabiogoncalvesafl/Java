package logica_de_Programacao;
import java.util.Locale;
import java.util.Scanner;

public class E_C_ExercicioResolvido03_B {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			//Sintaxe opcional: operadores de atribuição cumulativa
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();
	}

}
