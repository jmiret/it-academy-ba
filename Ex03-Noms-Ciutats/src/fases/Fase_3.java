/*
 * 
 * FASE 3
 * Cambieu les vocals “a” dels noms de les ciutats per el numero 4 
 * i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
 * Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
 * 
 */

package fases;

import java.util.Arrays;
import java.util.Scanner;

public class Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";
		
		String [] arrayCiutats = new String[6];
		String [] arrayCiutatsModificades = new String[6];
		
		Scanner introNoms = new Scanner(System.in);

		System.out.println("Introdueix el nom de les ciutats: ");
					
		ciutat1 = introNoms.nextLine();
		arrayCiutats[0] = ciutat1;
		ciutat2 = introNoms.nextLine();
		arrayCiutats[1] = ciutat2;
		ciutat3 = introNoms.nextLine();
		arrayCiutats[2] = ciutat3;
		ciutat4 = introNoms.nextLine();
		arrayCiutats[3] = ciutat4;
		ciutat5 = introNoms.nextLine();
		arrayCiutats[4] = ciutat5;
		ciutat6 = introNoms.nextLine();
		arrayCiutats[5] = ciutat6;
			
		Arrays.sort(arrayCiutats);
		
		// Canvi de les vocals "a" per el número "4" de les ciutats
		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutats[i] = arrayCiutats[i].replace("a", "4");
			arrayCiutatsModificades[i] = arrayCiutats[i];
		}
		
		Arrays.sort(arrayCiutatsModificades);
		
		System.out.println("Llistat de ciutats de la matriu: ");
		
		for (int i = 0; i < arrayCiutatsModificades.length; i++) {
			System.out.println(arrayCiutatsModificades[i]);
		}
		
	}

}
