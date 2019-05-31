package br.com.dev.javacore.sobrecargametodos.test;

import br.com.dev.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Fabio Goncalves","999.999.999-99", 3000,"0.000.000");
		Funcionario funcionario2 = new Funcionario();
//		funcionario.init("Fabio Goncalves","999.999.999-99", 3000,"0.000.000");
		funcionario.imprime();
		funcionario2.imprime();
	}
}