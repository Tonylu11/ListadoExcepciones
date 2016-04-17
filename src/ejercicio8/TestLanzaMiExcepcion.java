package ejercicio8;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepción NullPointerException en la línea nula.toString();
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestLanzaMiExcepcion {

	public static void main(String[] args) {

		metodo1();
		System.out.println("main: Acabando...");
	}

	private static void metodo1() {
		try {
			metodo2();
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Método1: Acabando...");
	}

	private static void metodo2() throws MiExcepcion {
		String nula = null;
		if (nula == null) {
			throw new MiExcepcion("Mi primera excepcion");
		}
		nula.toString();
		System.out.println("Método2: Acabando...");
	}

}
