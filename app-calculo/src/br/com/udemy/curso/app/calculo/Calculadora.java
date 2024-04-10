package br.com.udemy.curso.app.calculo;

import br.com.udemy.curso.app.calculo.interno.Operacoes;

public class Calculadora {
	
	private Operacoes op = new Operacoes();

	public double soma(double... nums) {
		return op.soma(nums);
	}

}
