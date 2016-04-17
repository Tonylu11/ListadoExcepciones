package ejercicio8;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepción NullPointerException en la línea nula.toString();
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestCapturaEnElMain {

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.err.println(e.toString());
		}
		System.out.println("main: Acabando...");
	}

	private static void metodo1() {
		metodo2();
		System.out.println("Método1: Acabando...");
	}

	private static void metodo2() {
		String nula = null;
		nula.toString();
		System.out.println("Método2: Acabando...");

	}

}
