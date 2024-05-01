package collections;

import java.util.TreeMap;

/**
 * Clase que representa el Ejercicio03
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos un diccionario de tipo Caracter, Entero
		TreeMap<Character, Integer> diccionario = new TreeMap<Character, Integer>();

		// Cadena de texto
		String texto = "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos "
				+ "de gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		// Array de tipo char con cada letra del texto
		char arrayTexto[] = texto.toCharArray();

		// Bucle for-each que recorre cada caracter del array del texto
		for (char letra : arrayTexto) {
			// Si el caracter en el que estamos es una letra
			if (Character.isLetter(letra)) {
				// Lo ponemos en minúsculas
				letra = Character.toLowerCase(letra);
				// Agregamos o actualizamos la clave en nuestro diccionario con nuestra letra
				// Y le ponemos como valor el obtenido de dicha clave (o en su defecto un 0) y le sumamos 1
				diccionario.put(letra, diccionario.getOrDefault(letra, 0) + 1);
			}
		}

		// Mostramos el diccionario creado
		System.out.println(diccionario);

		/*
		for (Map.Entry<Character, Integer> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}*/
	}

}
