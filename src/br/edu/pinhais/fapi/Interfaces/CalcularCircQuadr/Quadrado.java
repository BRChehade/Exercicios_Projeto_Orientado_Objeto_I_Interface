package br.edu.pinhais.fapi.Interfaces.CalcularCircQuadr;

public class Quadrado implements CalcularQuadrado {
	
	//calcularPermimetro
	//P = L + L + L + L
	//	ou
	//  P = 4L
	
	//calcularArea
	// A = L2

	@Override
	public int calcularQuadradoPerimetro(int alturaQuadrado) {
		// TODO Auto-generated method stub
		
		return alturaQuadrado + alturaQuadrado + alturaQuadrado +alturaQuadrado;
	}

	@Override
	public int calcularQuadradoArea(int alturaQuadrado) {
		// TODO Auto-generated method stub
		return alturaQuadrado * alturaQuadrado;
	}

	


	
	

}
