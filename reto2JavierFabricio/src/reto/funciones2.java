package reto;

public class funciones2 {

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
