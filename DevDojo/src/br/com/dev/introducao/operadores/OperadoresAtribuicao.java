package br.com.dev.introducao.operadores;
public class OperadoresAtribuicao{
	/**
	* = atribui��o
	* -= menos igual
	* += mais igual
	* *= multiplica��o igual
	* /= divis�o igual
	* %= resto igual
	*/
	public static void main(String[] args){
		
		int salario = 1800;
		//salario = salario + 1000;
		//salario += 1000;
		//salario *= 0.1; // 1800 * 0.1 = 180 (10% de 1800)
		salario = salario + (int) (salario * 0.1); //Teve que for�ar o resultado utilizando um cast devido o resultado ser um boolean
		int numero = 11;
		//numero = numero % 2;
		numero %= 2;
		
		System.out.println(salario);
		System.out.println(numero);
	}	
}