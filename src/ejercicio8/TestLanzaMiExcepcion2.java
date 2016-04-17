package ejercicio8;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepci�n NullPointerException en la l�nea nula.toString();
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestLanzaMiExcepcion2 {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}
		System.out.println("main: Acabando...");
	}

	private static void metodo1() throws MiExcepcion {
		metodo2();
		System.out.println("M�todo1: Acabando...");
	}

	private static void metodo2() throws MiExcepcion {
		String nula = null;
		if (nula == null) {
			throw new MiExcepcion("Mi primera excepcion");
		}
		nula.toString();
		System.out.println("M�todo2: Acabando...");

	}
}
