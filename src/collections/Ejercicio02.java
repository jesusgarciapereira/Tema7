package collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Clase que representa el Ejercicio02
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos una serie de tipo Enteros
		Set<Integer> serie = new LinkedHashSet<Integer>();
		// Creamos un objeto de tipo Random
		Random r = new Random();
		
		// Mientras el tamaño de la serie sea menor que 10
		while (serie.size() < 10) {
			// Generamos un número aleatorio entre 1 y 20
			int aleatorio = r.nextInt(20) + 1;
			// Si el número generado no está, lo añadimos a la serie  
			serie.add(aleatorio);

		}

		// Mostramos la serie
		System.out.println(serie);
	}

}
