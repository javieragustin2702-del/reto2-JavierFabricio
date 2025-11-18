package reto;

import java.util.Scanner;

public class funciones2 {
	
	public static void menuTemepatura(Scanner sc) {
		int num = 0;
		boolean salir = true;
		do {
			try {
				System.out.println("Selecicona la conversión de temperatura:\n1. Celsius a Fahrenheit\n2. Fahrenheit a Celsius");
				num = Integer.parseInt(sc.nextLine());
				double  num2 = 0;
				switch (num) {
				case 0:
					salir = false;
				case 1:
					System.out.println("Escribe los grados celsius que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(cambioCelsiusFahrenheit(num2));
					break;
				case 2:
					System.out.println("Escribe los grados Fahrenheit que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(cambioFahrenheitCelsius(num2));
					break;
				default:
					System.out.println("No has puesto nada del menú");
				}
			} catch (Exception e) {
				System.out.println("Ponga lo indicado en el menú");
			}
		} while (salir != false);
		}
	
	public static void menuVolumen(Scanner sc) {
		int num = 0;
		do {
			try {
				System.out.println("Selecicona la conversión de volumen:\n1. Litros a Galone\n2. Galones a Litros");
				num = Integer.parseInt(sc.nextLine());
				double  num2 = 0;
				switch (num) {
				case 1:
					System.out.println("Escribe los Litros que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(cambioLitrosGalones(num2));
					break;
				case 2:
					System.out.println("Escribe los Galones que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(cambioGalonesLitros(num2));
				default:
					System.out.println("No has puesto nada del menú");
				}
			} catch (Exception e) {
				System.out.println("Ponga lo indicado en el menú");
			}
		} while (true);
		
	}

	public static double cambioCelsiusFahrenheit(double num) {
		double devuelto = (num *9 / 5) +32;
		return devuelto;
	}
	public static double cambioFahrenheitCelsius(double num) {
		double devuelto = (num-32) * 5 / 9;
		return devuelto;
	}
	public static double cambioLitrosGalones(double num) {
		double devuelto = num/3.78;
		return devuelto;
	}
	public static double cambioGalonesLitros(double num) {
		double devuelto = num * 3.78;
		return devuelto;
	}
}
