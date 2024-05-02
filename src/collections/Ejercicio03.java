package collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Clase que representa el Ejercicio03
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos un diccionario de tipo Caracter, Entero
		Map<Character, Integer> diccionario = new TreeMap<Character, Integer>();

		// Cadena de texto
		String texto = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos "
				+ "de gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		// Hacemos una copia del texto en minúsculas
		String textoFinal = texto.toLowerCase();

		// Array de tipo char con cada letra del texto
		char arrayTexto[] = textoFinal.toCharArray();

		// Bucle for-each que recorre cada caracter del array del texto
		for (char letra : arrayTexto) {
			// Si el caracter en el que estamos es una letra
			if (Character.isLetter(letra)) {
				
				// Si la letra está como clave en nuestro diccionario
				if (diccionario.containsKey(letra))
					// Actualizamos la clave con su valor + 1
					diccionario.put(letra, diccionario.get(letra) + 1);
				else
					// La introducimos junto con el valor 1
					diccionario.put(letra, 1);

				/* Esto es el if else anterior pero resumido
				diccionario.put(letra, diccionario.getOrDefault(letra, 0) + 1);
				*/
			}
		}

		// Mostramos el diccionario creado
		System.out.println(diccionario);

		/*
		 * for (Map.Entry<Character, Integer> entry : diccionario.entrySet()) {
		 * System.out.println(entry.getKey() + ": " + entry.getValue()); }
		 */
	}

}
