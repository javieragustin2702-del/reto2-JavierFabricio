package reto;

import java.util.Scanner;

public class funciones1 {
	
	public static void menulongitud(Scanner sc) {
		int num = 0;
		boolean salir = true;
		do {
			try {
				System.out.println("Selecicona la conversión de logintud:\n1. millas a kilometros\n2. kilogramos a libras\n0. Salir");
				num = Integer.parseInt(sc.nextLine());
				double  num2 = 0;
				switch (num) {
				case 0:
					salir = false;
					break;
				case 1:
					System.out.println("Escribe los kilometros que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(kilometrosAmillas(num2));
					break;
				case 2:
					System.out.println("Escribe las millas que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(millasAKilometros(num2));
					break;
				default:
					System.out.println("No has puesto nada del menú");
				}
			} catch (Exception e) {
				System.out.println("Ponga lo indicado en el menú");
			}
		} while (salir != false);
		}
	
	public static void menupeso(Scanner sc) {
		int num = 0;
		boolean salir = true;
		do {
			try {
				System.out.println("Selecicona la conversión de peso:\n1. libras\n2. kilogramos a Libras\n0. Salir");
				num = Integer.parseInt(sc.nextLine());
				double  num2 = 0;
				switch (num) {
				case 0:
					salir = false;
					break;
				case 1:
					System.out.println("Escribe las libras que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(libraAkilogramo(num2));
					break;
				case 2:
					System.out.println("Escribe los kilogramos que le quieres ingresar");
					num2 = Double.parseDouble(sc.nextLine());
					System.out.println(kilogramoAlibra(num2));
				default:
					System.out.println("No has puesto nada del menú");
				}
			} catch (Exception e) {
				System.out.println("Ponga lo indicado en el menú");
			}
		} while (salir != false);
	}	

	
	public static double millasAKilometros(double millas) {
		double kilometros = millas * 1.60934;
		return kilometros;
	}

	public static double kilometrosAmillas(double kilometros) {
		double millas = kilometros * 0.621371;
		return millas;
	}

	public static double kilogramoAlibra (double kilogramo) {
		double libra = kilogramo * 2.20462;
		return libra;
	}
		
	public static double libraAkilogramo ( double libra) {
		double kilogramo = libra * 0.453592;
		return kilogramo;
	}
		
		
	

}
