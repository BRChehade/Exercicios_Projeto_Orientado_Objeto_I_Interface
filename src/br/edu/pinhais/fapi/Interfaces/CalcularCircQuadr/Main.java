package br.edu.pinhais.fapi.Interfaces.CalcularCircQuadr;

import java.util.Scanner;

public class Main {
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcularQuadrado calcQuadrado;
		CalcularCirculo calcCirculo;
		

		int alturaQuadrado;
		double raioCirculo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a Altura do Quadrado em centimetro(s): ");
		alturaQuadrado = ler.nextInt();
		System.out.println("Informe o Raio do Cirtulo em centimetro(s): ");
		raioCirculo = ler.nextInt();
		
		calcQuadrado = new Quadrado();
		System.out.println("O Perimetro do Quadrado � " + calcQuadrado.calcularQuadradoPerimetro(alturaQuadrado) + " e a Area �: " + calcQuadrado.calcularQuadradoArea(alturaQuadrado) + " :)");
		calcCirculo = new Circulo();
		System.out.println("O Perimetro do Circulo � " + calcCirculo.calcularCirculoPerimetro(raioCirculo) + " e a Area �: " + calcCirculo.calcularCirculoArea(raioCirculo) + " :D");
		
		
		
	}

}
