package ejercicio9;

/**
 * 9. Ejecuta el siguiente c�digo y responde:
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestPropagaExcepcion {
	public static void main(String[] args) {
		metodo1();
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
