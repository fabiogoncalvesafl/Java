package br.com.dev.introducao.arrays;
public class Arrays2 {
	public static void main(String[] args){
		//byte, short, int, long, float, double = 0
		//char = '\u0000'
		//boolean = false
		//reference(String) =  null
		String[] nomes = new String[3];
		nomes[0] = "Clark Kent";
		nomes[1] = "Bruce Wayne";
		nomes[2] = "Fabio Goncalves";
		for(int i =0; i < nomes.length; i++){
			System.out.println("Nome "+(i + 1)+": "+nomes[i]);
		}
	}
}
