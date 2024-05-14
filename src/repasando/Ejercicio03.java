package repasando;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {

		Map<Character, Integer> diccionario = new TreeMap<>();

		// Cadena de texto
		String texto = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos "
				+ "de gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		char arrayTexto[] = texto.toLowerCase().toCharArray();

		for (char caracter : arrayTexto) {
			if (Character.isLetter(caracter)) {
				if (!diccionario.containsKey(caracter)) {
					diccionario.put(caracter, 1);
				} else {
					diccionario.replace(caracter, diccionario.get(caracter) + 1);
				}
			}

		}

		for (Map.Entry<Character, Integer> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}


	}

}
