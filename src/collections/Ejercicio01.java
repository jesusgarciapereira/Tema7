package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que representa el Ejercicio01
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos una lista de tipo Enteros
		List<Integer> lista = new ArrayList<Integer>();
		
		// Rellenamos la lista con números del 1 al 10
		for (int i = 1; i <= 10; i++) {
			lista.add(i); 
		}
		
		// La mostramos
		System.out.println(lista);
		
		// Llamamos al método shuffle() para desordenarla
		Collections.shuffle(lista);
		
		// La mostramos desordenada
		System.out.println(lista);

	}

}
