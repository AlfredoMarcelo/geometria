package geometria;

public class Circulo extends Figura {

	double diametro;
	
	
	public Circulo() {
	}

	
	
	public Circulo(double diametro) {
		this.diametro = diametro;
	}



	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}



	public double calcularRadio() {
		double radio = diametro/2;
		return radio;
	}
	
	@Override
	public double calcularArea() {
		double pi = 3.14;
		double radio = diametro / 2;
		double resultadoArea = pi * Math.pow(radio, 2);
		return resultadoArea;
	}

	@Override
	public double calcularPerimetro() {
		double pi = 3.14;
		double perimetro = pi * diametro; 
		return perimetro;
	}

}
