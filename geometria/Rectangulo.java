package geometria;

public class Rectangulo extends Figura {
	
	double base;
	double altura;
	
	

	public Rectangulo() {
	}
	
	

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double calcularArea() {
		double area = base * altura;
		return area;
	}

	@Override //sobreescritura de metodo desde figura
	public double calcularPerimetro() {
		double ladoA = base * 2; 
		double ladoB = altura * 2; 
		double perimetro = ladoA + ladoB;
		return perimetro;
	}

}
