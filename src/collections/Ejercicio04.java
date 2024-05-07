package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> nombres = new ArrayList<String>();
		System.out.println("Escribe 5 nombres:");

		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("Nombre " + (i + 1) + ": ");
		 * String nombre = sc.nextLine(); if (nombres.contains(nombre)) { System.out.
		 * println("Nombre ya incluido en el registro, introduzca otro distinto"); i--;
		 * 
		 * } else { nombres.add(nombre); }
		 */

		while (nombres.size() < 5) {

			System.out.println("Nombre " + (nombres.size() + 1) + ": ");
			String nombre = sc.nextLine();
			if (nombres.contains(nombre)) {
				System.out.println("Nombre ya incluido en el registro, introduzca otro distinto");

			} else {
				nombres.add(nombre);
			}

		}

		System.out.println("Nombre en orden inverso:");
		Collections.reverse(nombres);
		for (String nombre : nombres) {
			System.out.println(nombre);

		}
		
		sc.close();
	}
}
