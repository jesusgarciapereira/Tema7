package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase que representa el Ejercicio05
 */
public class Ejercicio05 {

	public static void main(String[] args) {

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Opcion y nombre que le pediremos al usuario
		int opcion = 0;
		String nombre = "";

		// Creamos un diccionario de tipo String, String
		Map<String, String> series = new HashMap<>();

		// Estas instrucciones se ejecutarán, al menos, una vez
		do {
			// Mostramos el menú
			menu();

			// Asignamos a la opción el número introducido por el usuario
			opcion = sc.nextInt();
			// Y limpiamos el buffer
			sc.nextLine();

			// Switch para cada caso de la opcion
			switch (opcion) {

			// Si la opción es 1
			case 1:
				// Variable local con la valoración que le pediremos al usuario
				String valoracion = "";

				// Le pedimos al usuario una serie
				System.out.println("Añade una serie");
				// Y lo asignamos al nombre
				nombre = sc.nextLine();

				// Le pedimos al usuario una valoración
				System.out.println("Añade una valoración");
				// Y lo asignamos a la valoración
				valoracion = sc.nextLine();

				// Añadimos al diccionario series el par valor del nombre y la valoración
				series.put(nombre, valoracion);
				break;

			// Si la opción es 2
			case 2:
				// Le pedimos al usuario una serie
				System.out.println("Indica el nombre de la serie a buscar");
				// Y lo asignamos al nombre
				nombre = sc.nextLine();

				// Si ese nombre está como clave en nuestro diccionario
				if (series.containsKey(nombre)) {
					// Mostramos el nombre y el valor correspondiente a dicha clave
					System.out.println(nombre + ": " + series.get(nombre));
					// En caso contrario
				} else {
					// Indicamos que no existe
					System.out.println(nombre + " no existe en nuestro diccionario");
				}
				break;

			// Si la opción es 3
			case 3:

				// Le pedimos al usuario una serie
				System.out.println("Indica el nombre de la serie a eliminar");
				// Y lo asignamos al nombre
				nombre = sc.nextLine();

				// Si el valor devuelto por el remove es distinto de null (es decir, si existe y ha sido removido)
				if (series.remove(nombre) != null) {
					// Indicamos que se ha eliminado correctamente
					System.out.println("Eliminado correctamente");
					// En caso contrario
				} else {
					// Indicamos que no existe
					System.out.println(nombre + " no existe en nuestro diccionario");
				}
				break;

			// Si la opción es 4
			case 4:
				// Saldremos del programa y lo indicamos
				System.out.println("Saliendo del programa");
				break;
				// Si la opción es cualquier otro caso
			default:
				// Indicaremos que la opción no es válidad
				System.out.println("Opción no válida");
			}
			// Mientras la opción sea distinto de 4 repetiremos todas las instrucciones del
			// do
		} while (opcion != 4);

		// Cerramos el Scanner
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
