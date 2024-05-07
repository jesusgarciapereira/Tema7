package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa el Ejercicio04
 */
public class Ejercicio04 {

	public static void main(String[] args) {

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Cada uno de los nombres que le pediremos al usuario
		String nombre = "";

		// Creamos una lista de tipo String
		List<String> nombres = new ArrayList<String>();

		// Le pedimos al usuario que escriba 5 nombres
		System.out.println("Escribe 5 nombres:");

		// Mientras el tamaño de la lista sea menor que 5
		while (nombres.size() < 5) {
			// Mostramos este texto
			System.out.println("Nombre " + (nombres.size() + 1) + ": ");
			// Asignamos el texto introducido al usuario como nombre
			nombre = sc.nextLine();

			// Si la lista contiene ese nombre
			if (nombres.contains(nombre))
				// Sólo mostrará este texto
				System.out.println("El nombre \"" + nombre
						+ "\" ya está incluido en el registro, introduzca otro nombre distinto");
			// En caso contrario
			else
				// Lo añadirá a la lista
				nombres.add(nombre);

		}

		// Mostraremos la lista en el orden inverso
		System.out.println("Lista nombres en orden inverso:");

		// Llamamos al método reverse() de la clase Collections para ordenarla al
		// inverso
		Collections.reverse(nombres);

		// Bucle for-each para recorrer cada nombre de la lista nombres
		for (String cadaNombre : nombres) {
			// Mostramos cada nombre
			System.out.println(cadaNombre);

		}

		// Cerramos el Scanner
		sc.close();
	}
}
