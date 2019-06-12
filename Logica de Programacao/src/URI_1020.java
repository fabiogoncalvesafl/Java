import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N, anos, meses, dias, resto;
		
		N = sc.nextInt();
		
		anos = N / 365;
		resto = N % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
