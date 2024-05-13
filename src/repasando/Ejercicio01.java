package repasando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio01 {

	public static void main(String[] args) {
		List<Integer> enteros = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			enteros.add(i);
		}
		
		System.out.println(enteros);
		
		Collections.shuffle(enteros);
		
		System.out.println(enteros);
	}

}
