package cuartoIntegrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuartoIntegrador {
	static Scanner scanner = new Scanner(System.in);
	static String[] nombres = new String[3];
	static String[] apellidos = new String[3];
	static int[] numerosCamiseta = new int[3];

	public static void main(String[] args) {
		ingresarDatos();
		agregarJugador();
	}

	public static void ingresarDatos() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingresar los datos del Jugador " + (i + 1));
			System.out.print("Nombre: ");
			nombres[i] = scanner.next();
			System.out.print("Apellido: ");
			apellidos[i] = scanner.next();
			System.out.print("Numero del dorsal: ");
			numerosCamiseta[i] = scanner.nextInt();

		}

	}

	public static void agregarJugador() {

		String respuestaAgregarJugador;
		boolean respuestaAgregarIncorrecta = true;

		while (respuestaAgregarIncorrecta) {

			System.out.print("¿Desea agregar un jugador suplente? ");
			respuestaAgregarJugador = scanner.next().toLowerCase();
			if (respuestaAgregarJugador.equals("si")) {

				String[] nombresSuplentes = new String[4];
				String[] apellidosSuplentes = new String[4];
				int[] numerosCamisetaSuplentes = new int[4];
				for (int i = 0; i < 3; i++) {
					nombresSuplentes[i] = nombres[i];
					apellidosSuplentes[i] = apellidos[i];
					numerosCamisetaSuplentes[i] = numerosCamiseta[i];
				}
				System.out.println("Ingresar los datos del Jugador Suplente");
				System.out.print("Nombre: ");
				nombresSuplentes[3] = scanner.next();
				System.out.print("Apellido: ");
				apellidosSuplentes[3] = scanner.next();
				System.out.print("Numero del dorsal: ");
				numerosCamisetaSuplentes[3] = scanner.nextInt();
				scanner.nextLine();
				analizarDatosCuatroJugadores(nombresSuplentes, apellidosSuplentes, numerosCamisetaSuplentes);
				respuestaAgregarIncorrecta = false;
			} else if (respuestaAgregarJugador.equals("no")) {

				analizarDatosTresJugadores(nombres, apellidos, numerosCamiseta);
				respuestaAgregarIncorrecta = false;
			} else {
				System.out.println("Respuesta incorrecta. ingrese 'si' o 'no'.");
			}
		}

	}

	public static void analizarDatosTresJugadores(String[] nombres, String[] apellidos, int[] numerosCamiseta) {

		System.out.println("Datos de los jugadores:");
		for (int i = 0; i < 3; i++) {
			System.out.println("Jugador " + (i + 1) + ": " + nombres[i] + " " + apellidos[i] + " - Camiseta "
					+ numerosCamiseta[i]);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Los datos son correctos? ");
		String respuesta = scanner.nextLine().toLowerCase();
		if (respuesta.equals("si")) {
			System.out.println("Los datos son correctos.");
		} else {
			System.out.print("Ingrese el numero de camiseta del jugador que desea cambiar: ");
			int numeroCamisetaModificar = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < 3; i++) {
				if (numerosCamiseta[i] == numeroCamisetaModificar) {
					System.out.print("Nuevo nombre: ");
					nombres[i] = scanner.nextLine();
					System.out.print("Nuevo apellido: ");
					apellidos[i] = scanner.nextLine();
					System.out.print("Nuevo numero del dorsal: ");
					numerosCamiseta[i] = scanner.nextInt();
					scanner.nextLine();
				}
			}
			System.out.println("Datos actualizados:");
			for (int i = 0; i < 3; i++) {
				System.out.println("Jugador " + (i + 1) + ": " + nombres[i] + " " + apellidos[i] + " - Camiseta "
						+ numerosCamiseta[i]);
			}
		}

	}

	public static void analizarDatosCuatroJugadores(String[] nombres, String[] apellidos, int[] numerosCamiseta) {
		System.out.println("Datos de los jugadores:");
		for (int i = 0; i < 4; i++) {
			System.out.println("Jugador " + (i + 1) + ": " + nombres[i] + " " + apellidos[i] + " - Camiseta "
					+ numerosCamiseta[i]);
		}

		System.out.print("¿Los datos son correctos? ");
		String respuesta = scanner.next().toLowerCase();
		if (respuesta.equals("si")) {
			System.out.println("Los datos son correctos.");
		} else {

			System.out.print("Ingrese el número de camiseta del jugador que desea cambiar ");
			int numeroCamisetaModificar = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < 4; i++) {
				if (numerosCamiseta[i] == numeroCamisetaModificar) {
					System.out.print("Nuevo nombre: ");
					nombres[i] = scanner.nextLine();
					System.out.print("Nuevo apellido: ");
					apellidos[i] = scanner.nextLine();
					System.out.print("Nuevo numero del dorsal: ");
					numerosCamiseta[i] = scanner.nextInt();

				}
			}
		}
	}

}
