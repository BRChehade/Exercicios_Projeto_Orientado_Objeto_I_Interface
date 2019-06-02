package br.edu.pinhais.fapi.Interfaces.Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcular calculos;
		
		int num1;
		int num2;
		int op;
		int res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("========== Calculadora ==========");
		System.out.println();
		System.out.println("Informe o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("------------------------------------");
		System.out.println("========== Escolha Uma Op��o ==========");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		op = ler.nextInt();
		System.out.println("========== Resultado ==========");
		
		switch (op) {
		case 1:
			calculos = new Operacoes();
			System.out.println("R: " + calculos.calcularOperacaoSoma(num1, num2));
			break;
		case 2:
			calculos = new Operacoes();
			System.out.println("R: " + calculos.calcularOperacaoSubtracao(num1, num2));
			break;
		case 3:
			calculos = new Operacoes();
			System.out.println("R: " + calculos.calcularOperacaoMultiplicacao(num1, num2));
			break;
		case 4:
			calculos = new Operacoes();
			if(num2 == 0) {
				System.out.println("Nunca aprendeu que o segundo n�mero da divis�o n�o pode ser 0 (ZEROOO) ");
				System.out.println("Informe novamente o segundo n�mero: (Dessa vez coloca certo!) ");
				num2 = ler.nextInt();
			}
			System.out.println("R: " + calculos.calcularOperacaoDivisao(num1, num2));
	
			break;

		default:
			break;
		}
		
		
		
		
		

	}

}
