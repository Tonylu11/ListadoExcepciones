package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner {
	/**
	 * Probando la clase Scanner
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			pedirEntero();
		} catch (InputMismatchException e) {
			System.err.println("Error");
			pedirEntero();
		}
	}

	private static void pedirEntero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		System.out.println(scanner.nextInt());
	}
}
