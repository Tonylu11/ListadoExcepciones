package ejercicio9;

/**
 * 9. Ejecuta el siguiente código y responde:
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestPropagaExcepcion4 {

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception e) {
			System.err.println("División por cero.");
		}
	}

	private static void metodo1() {
		metodo2();
	}

	private static void metodo2() {
		metodo3();
	}

	private static void metodo3() {
		int a = 7 / 0;
	}
}
