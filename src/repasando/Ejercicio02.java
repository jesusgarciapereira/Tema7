package repasando;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio02 {

	public static void main(String[] args) {
		Set<Integer> serieAleatorios = new LinkedHashSet<>();

		Random r = new Random();

		int numAleatorio;

		while (serieAleatorios.size() < 10) {
			numAleatorio = r.nextInt(1, 21);

			
				serieAleatorios.add(numAleatorio);

			
		}
		
		System.out.println(serieAleatorios);

	}
}
