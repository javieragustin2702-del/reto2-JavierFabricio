package reto;

import java.util.Locale;
import java.util.Scanner;
import reto.funciones1;
import reto.funciones2;


public class reto2 {

		public static int dimeEntero(String texto, Scanner sc)
		{
			do
			{
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n= Integer.parseInt(s);
				return n;

			} catch (Exception e) {
				System.out.println("Formato incorrecto. No es un número");
			}
			}while(true);
		}
		public static double dimeDouble(String texto, Scanner sc)
		{
			do
			{
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				double d= Double.parseDouble(s);
				return d;

			} catch (Exception e) {
				System.out.println("Formato incorrecto. No es un número");
			}
			}while(true);
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int operacion = 0;
		boolean salida = true;
		String n = "";
		do {
			try {
				System.out.println("Selecciona el tipo de conversión:\n1. Longitud\n2. peso\n3. Temperatura\n4. Volumen");
				operacion = dimeEntero(n, sc);
				switch (operacion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					funciones2.menuTemepatura(sc);
					break;
				case 4:
					funciones2.menuVolumen(sc);
				default:
					System.out.println("Que sea de los números que te he dado");
				}
			} catch (Exception e) {
			}
		} while (salida != false);
	}

}
