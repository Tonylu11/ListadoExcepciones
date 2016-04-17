package ejercicio8;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepci�n NullPointerException en la l�nea nula.toString();
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestCapturaExcepcion {

	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabando...");
	}

	private static void metodo1() {
		metodo2();
		System.out.println("M�todo1: Acabando...");
	}

	private static void metodo2() {
		String nula = null;
		try {
			nula.toString();
		} catch (NullPointerException e) {
			System.err.println(e.toString());
		}
		System.out.println("M�todo2: Acabando...");
	}

}
