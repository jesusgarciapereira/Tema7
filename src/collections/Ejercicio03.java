package collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase que representa el Ejercicio03
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos un diccionario de tipo Caracter, Entero
		TreeMap<Character, Integer> mapa = new TreeMap();

		// Cadena de texto
		String texto = "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos "
				+ "de gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		for (char letra : texto.toCharArray()) {
			if(Character.isLetter(letra)) {
			letra = Character.toLowerCase(letra);
			mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
		}}
		
		System.out.println(mapa);
		
		for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
			System.out.println(entry.getKey() + ": ");
		}
	}

}
