package br.edu.pinhais.fapi.Interfaces.Calculadora;

public class Operacoes implements Calcular {
	
	int res;

	@Override
	public int calcularOperacaoSoma(int num1, int num2) {
		// TODO Auto-generated method stub
		res = num1 + num2;
		return res;
	}

	@Override
	public int calcularOperacaoSubtracao(int num1, int num2) {
		// TODO Auto-generated method stub
		res = num1 - num2;
		return res;
	}

	@Override
	public int calcularOperacaoMultiplicacao(int num1, int num2) {
		// TODO Auto-generated method stub
		res = num1 * num2;
		return res;
	}

	@Override
	public int calcularOperacaoDivisao(int num1, int num2) {
		// TODO Auto-generated method stub
		res = num1 / num2;
		return res;
	}

}
