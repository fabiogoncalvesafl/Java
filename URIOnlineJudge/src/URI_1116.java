import java.util.Scanner;

public class URI_1116 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x, y;
		double resultado = 0;
		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				resultado = (double) x / y;
				System.out.println(resultado);
			}
		}

		sc.close();
	}

}