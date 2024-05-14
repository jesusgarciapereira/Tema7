package repasando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nombres = new ArrayList<>();
		String nombreIntroducido = "";
		int i = 1;
		
		System.out.println("Introduzca 5 nombres");
		
		while(nombres.size() < 5) {
			System.out.print("Nombre " + i + ": ");
			nombreIntroducido = sc.nextLine();
		
			if(nombres.contains(nombreIntroducido)) {
				System.out.println(nombreIntroducido + " ya existe en la lista, escriba otro");
			} else {
				nombres.add(nombreIntroducido);
				i++;
			}
		}
		
		System.out.println(nombres);
		
		Collections.reverse(nombres);
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
