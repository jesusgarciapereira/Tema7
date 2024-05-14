package repasando.ejercicio05;

import java.util.Map;
import java.util.TreeMap;

public class ColeccionSeries {

	static Map<String, Integer> series = new TreeMap<>();

	public static boolean agregarSerie(String serie, int valoracion) {
		boolean hecho = false;

		if (!series.containsKey(serie)) {
			series.put(serie, valoracion);
			hecho = true;

		}

		return hecho;

	}

	public static void buscarSerie(String serie) {

		if (series.containsKey(serie)) {
			System.out.println("Valoración de " + serie + ": " + series.get(serie));

		} else {
			System.out.println("No existe la serie \"" + serie + "\" en la Base de Datos");
		}

	}
	
	public static boolean eliminarSerie(String serie) {
		
		boolean hecho = false;

		if (series.containsKey(serie)) {
			series.remove(serie);
			hecho = true;

		}

		return hecho;
		
	}
}
