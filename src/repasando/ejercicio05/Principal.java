package repasando.ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		String serie = "";
		do {
			menu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Seleccione serie:");
				serie = sc.nextLine();
				int valoracion;
				System.out.println("Ingrese una valoración:");
				valoracion = sc.nextInt();
				if (ColeccionSeries.agregarSerie(serie, valoracion)) {
					System.out.println("Serie añadida correctamente");
				} else {
					System.out.println("No se ha podido añadir la serie");
				}
				break;

			case 2:
				System.out.println("Seleccione serie:");
				serie = sc.nextLine();
				ColeccionSeries.buscarSerie(serie);
				break;
			case 3:
				System.out.println("Seleccione serie:");
				serie = sc.nextLine();
				if (ColeccionSeries.eliminarSerie(serie)) {
					System.out.println("Serie eliminada correctamente");
				} else {
					System.out.println("No se ha podido eliminar la serie");
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Opción no disponible");
				break;
			}

		} while (opcion != 4);

		System.out.println("Saliendo del programa");

		sc.close();

	}

	/**
	 * Funcion que muestra el siguiente menu
	 */
	private static void menu() {
		System.out.println("Gestión de series");
		System.out.println("1. Agregar");
		System.out.println("2. Buscar");
		System.out.println("3. Eliminar");
		System.out.println("4. Salir");
		System.out.println("Seleccione opción:");
	}

}
