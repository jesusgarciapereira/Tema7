package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		Map<String, String> series = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		String nombre = "";

		do {
			menu();

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				System.out.println("Añade una valoraciñon");
				String valor = sc.nextLine();
				series.put(nombre, valor);
				break;

			case 2:

				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				if (series.containsKey(nombre)) {
					System.out.println(nombre + ":" + series.get(nombre));
				} else {
					System.out.println("No existe");
				}
				break;

			case 3:

				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				if (series.remove(nombre) != null) {
					System.out.println("Eliminado correctamente");
				} else {
					System.out.println("No existe");
				}
				break;

			case 4:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 4);

		sc.close();

	}

	private static void menu() {
		System.out.println("Gestión de series");
		System.out.println("1. Agregar");
		System.out.println("2. Buscar");
		System.out.println("3. Eliminar");
		System.out.println("4. Salir");
		System.out.println("Seleccione opción:");
	}
}
