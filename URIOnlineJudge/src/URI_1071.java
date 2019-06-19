import java.util.Scanner;

public class URI_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		// ordenar o minimo e maximo
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		// min + 1 => o intervalo minimo não entra na contagem
		// max < => o inervalo maximo não entra na contagem
		for (int i = min + 1; i < max; i++) {
			// Ira somar somente os impares
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		sc.close();
	}

}
