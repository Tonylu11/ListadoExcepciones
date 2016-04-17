package ejercicio7;

/**
 * 7. El siguiente c�digo lanza una excepci�n. Capt�rala (try/catch) y haz un
 * System.out.println() de los siguientes m�todos de la excepci�n capturada:
 * getMessage(), getCause(), getLocalizedMessage(), toString().Realiza las
 * siguientes actividades:
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestCapturaExcepcion {
	public static void main(String[] args) {
		int dividendo = 7;
		int divisor = 0;
		try {
			int cociente = dividendo / divisor;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			System.err.println(e.getLocalizedMessage());
			System.err.println(e.toString());
		}
		System.out.println("Aaaaaaaadios");
	}
}
