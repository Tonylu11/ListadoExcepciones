package ejercicio8;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepción NullPointerException en la línea nula.toString();
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class MiExcepcion extends Exception {
	public MiExcepcion(String message) {
		super(message);
	}
}
