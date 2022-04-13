package geometria;

import java.util.Scanner;

public class Logica {

	public static void main(String[] args) {
		//mostrar menu
		//usar scanner para seleccion de opcion
		//
		int seleccion = 0;
		do {
		System.out.println("Seleccione una la operación que desea realizar:\n"
					+ "1. Calcular área de un rectangulo\n"
					+ "2. Calcular radio de un circulo\n"
					+ "3. Calcular périmetro de un circulo\n"
					+ "4. Calcular área de un circulo\n"
					+ "5. Salir del programa");
			
		System.out.printf("\nSeleccione una opción\n");
		Scanner teclado = new Scanner(System.in);
		seleccion = teclado.nextInt();
			switch(seleccion) {
			case 1:
				System.out.println("selecciono opcion 1");
				calcularAreaRectangulo();
				seleccion = 0;
				break;
			case 2:
				System.out.println("selecciono opcion 2");
				calcularRadio();
				seleccion = 0;
				break;
			case 3:
				System.out.println("selecciono opcion 3");
				calcularPerimetroCirculo();
				seleccion = 0;
				break;
			case 4:
				System.out.println("selecciono opcion 4");
				calcularAreaCirculo();
				seleccion = 0;
				break;
			case 5:
				System.out.println("Salio del programa");
				seleccion = 5;
				break;
			default:
				System.out.println("Ingrese una opción valida");
				seleccion = 0;
				break;
			}
		}while(seleccion !=5);
		
	}

	private static void calcularAreaCirculo() {
		Circulo circulo = new Circulo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el diametro para calcular el área del circulo");
		circulo.diametro = teclado.nextDouble();
		double resultado = circulo.calcularArea();
		System.out.println("El área del circulo es: => " + resultado + "\n");
	}

	private static void calcularPerimetroCirculo() {
		Circulo circulo = new Circulo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el diametro del circulo para obtener el perimetro");
		circulo.diametro = teclado.nextDouble();
		double resultado = circulo.calcularPerimetro();
		System.out.println("El perimetro del circulo es: =>" + resultado + "\n");
	}

	private static void calcularRadio() {
		Circulo circulo = new Circulo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el diametro del circulo para obtener su radio");
		circulo.diametro = teclado.nextDouble();
		double resultado = circulo.calcularRadio();
		System.out.println("El radio del circulo es: => " + resultado + "\n");
		
	}

	private static void calcularAreaRectangulo() {
		Rectangulo rectangulo = new Rectangulo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("\ningrese la base");
		rectangulo.base = teclado.nextDouble();
		System.out.println("ingrese la altura");
		rectangulo.altura = teclado.nextDouble();
		double resultado = rectangulo.calcularArea();
		System.out.println("El area del rectangulo  es: => " + resultado + "\n");
	}
	
	
	

}
