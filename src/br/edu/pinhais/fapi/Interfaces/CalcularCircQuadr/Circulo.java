package br.edu.pinhais.fapi.Interfaces.CalcularCircQuadr;

public class Circulo implements CalcularCirculo {


	//calcularPermimetro
	//P = 2 π . r
	

	//calcularArea
	//A = π . r2
		

	@Override
	public double calcularCirculoPerimetro(double raioCirculo) {
		// TODO Auto-generated method stub
		return raioCirculo * (2 * 3.14);
	}

	@Override
	public double calcularCirculoArea(double raioCirculo) {
		// TODO Auto-generated method stub
		return  (raioCirculo *  raioCirculo) * 3.14;
	}
	



}
