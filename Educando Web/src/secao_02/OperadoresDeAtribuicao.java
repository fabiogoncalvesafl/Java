package secao_02;

public class OperadoresDeAtribuicao {
	
	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("-------------------------");
		
		n1 *= 2;
		n2 += n1;
		s += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("-------------------------");
		
		int a = 10;
		a++;
		System.out.println(a);
		System.out.println("-------------------------");
		int c = 10;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		System.out.println("-------------------------");
		int e = 10;
		int f = ++e;
		System.out.println(e);
		System.out.println(f);
	}

}
