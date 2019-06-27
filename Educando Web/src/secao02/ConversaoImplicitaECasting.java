package secao02;

public class ConversaoImplicitaECasting {

	public static void main(String[] args) {
		// Conversão implícita entre tipos
		// Casting: conversão explícita entre tipos COMPATÍVEIS
		
		// Exemplo 1 (Casting)
		double a;
		float b;
		a = 5.0;
		b = (float)a;
		System.out.println(b);
		
		// Exemplo 2 (Casting)
		double c;
		int d;
		c = 5.0;
		d = (int)c;
		System.out.println(d);
		
		// Exemplo 3 (Casting)
		int e, f;
		double result;
		e = 5;
		f = 2;
		result = (double)e / f;
		System.out.println(result);
		
		// Exemplo 4 (Conversão Explicita)
		int g, h;
		double result2;
		g = 5;
		h = 2;
		result2 = g / h;
		System.out.println(result2);

		// Exemplo 5 (Tipos Compativeis)
		int i;
		double result3;
		String s = "33";
		i = Integer.parseInt(s);
		result3 = Double.parseDouble(s);
		System.out.println(i);
		System.out.println(result3);
	}

}
