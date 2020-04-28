/*
 * 
 * FASE 4
 * Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)
 * Ompliu els nous arrays lletra per lletra.(2 punts)
 * Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
 * 
 */

package fases;

import java.util.Arrays;
import java.util.Scanner;

public class Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		
		String [] arrayCiutats = new String[6];
		String [] arrayCiutatsModificades = new String[6];
		
		char [] arrayCiutat1;
		char [] arrayCiutat2;
		char [] arrayCiutat3;
		char [] arrayCiutat4;
		char [] arrayCiutat5;
		char [] arrayCiutat6;
		
		Scanner introNoms = new Scanner(System.in);

		System.out.println("Introdueix el nom de les ciutats: ");
					
		ciutat1 = introNoms.nextLine();
		arrayCiutat1 = new char [ciutat1.length()];
		arrayCiutat1 = ciutat1.toCharArray();
		
		ciutat2 = introNoms.nextLine();
		arrayCiutat2 =  new char [ciutat2.length()];
		arrayCiutat2 = ciutat2.toCharArray();
		
		ciutat3 = introNoms.nextLine();
		arrayCiutat3 =  new char [ciutat3.length()];
		arrayCiutat3 = ciutat3.toCharArray();
		
		ciutat4 = introNoms.nextLine();
		arrayCiutat4 =  new char [ciutat4.length()];
		arrayCiutat4 = ciutat4.toCharArray();
		
		ciutat5 = introNoms.nextLine();
		arrayCiutat5 =  new char [ciutat5.length()];
		arrayCiutat5 = ciutat5.toCharArray();
		
		ciutat6 = introNoms.nextLine();
		arrayCiutat6 =  new char [ciutat6.length()];
		arrayCiutat6 = ciutat6.toCharArray();
						
		System.out.println("Llistat de ciutats de la matriu: ");
				
		System.out.print(ciutat1 + " - ");
		for (int i = arrayCiutat1.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat1[i]);
		}
		System.out.println();
		
		System.out.print(ciutat2 + " - ");
		for (int i = arrayCiutat2.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat2[i]);
		}
		System.out.println();
		
		System.out.print(ciutat3 + " - ");
		for (int i = arrayCiutat3.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat3[i]);
		}
		System.out.println();
		
		System.out.print(ciutat4 + " - ");
		for (int i = arrayCiutat4.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat4[i]);
		}
		System.out.println();
		
		System.out.print(ciutat5 + " - ");
		for (int i = arrayCiutat5.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat5[i]);
		}
		System.out.println();
		
		System.out.print(ciutat6 + " - ");
		for (int i = arrayCiutat6.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat6[i]);
		}
		System.out.println();

	}

}
