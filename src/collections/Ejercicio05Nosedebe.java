package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio05Nosedebe {
	public static void main(String[] args) {
		Map<String, String> series = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Gestión de series");
			System.out.println("1. Agregar");
			System.out.println("2. Buscar");
			System.out.println("3. Eliminar");
			System.out.println("4. Salir");
			System.out.println("Seleccione opción:");

			int opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("Añade una serie");
				String nombre = sc.nextLine();
				System.out.println("Añade una valoraciñon");
				String valor = sc.nextLine();
				series.put(nombre, valor);
				break;

			case 2:

				System.out.println("Añade una serie");
				String nombreBuscar = sc.nextLine();
				if (series.containsKey(nombreBuscar)) {
					System.out.println(nombreBuscar + ":" + series.get(nombreBuscar));
				} else {
					System.out.println("No existe");
				}
				break;

			case 3:

				System.out.println("Añade una serie");
				String nombreEliminar = sc.nextLine();
				if (series.containsKey(nombreEliminar)) {
					series.remove(nombreEliminar);
					System.out.println("Eliminado correctamente");
				} else {
					System.out.println("No existe");
				}
				break;

			case 4:

				System.out.println("Saliendo del programa");
				return;
			default:
				System.out.println("Opción no válida");
			}
			sc.close();

		}
	}
}
