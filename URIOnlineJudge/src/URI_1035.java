import java.util.Scanner;

public class URI_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, soma1, soma2;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		soma1 = c + d;
		soma2 = a + b;
		
		if(b > c && d > a && soma1 > soma2 && soma1 >= 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
	}

}
