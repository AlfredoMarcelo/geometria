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
					+ "4. Calcular área de un circulo");
			
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
				System.out.println("opcion 2");
				seleccion = 0;
				break;
			default:
				System.out.println("seleccione una opcion del menu");
				seleccion = 0;
				break;
			}
		}while(seleccion !=5);

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
