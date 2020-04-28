/*
 * 
 * FASE 2
 * Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
 * Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.
 *
 * 
 */

package fases;

import java.util.Arrays;
import java.util.Scanner;

public class Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";
		
		String [] arrayCiutats = new String[6];
		
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
				
		/*
		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutats[i] = introNoms.nextLine();
			arrayCiutats[i] = (String) ("ciutat" + i);
		}
		*/
		
		Arrays.sort(arrayCiutats);
		
		System.out.println("Llistat de ciutats de la matriu: ");
		
		for (int i = 0; i < arrayCiutats.length; i++) {
			System.out.println(arrayCiutats[i]);
		}
		
	}

}
