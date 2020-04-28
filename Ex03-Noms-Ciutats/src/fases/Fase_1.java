/*
 * 
 * FASE 1
 * Crea sis variables tipu string buides.
 * Demana per consola que s’introdueixin els noms.
 * Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
 * Mostra per consola el nom de les 6 ciutats.
 * 
 */

package fases;

import java.util.Scanner;

public class Fase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";
		
		Scanner introNoms = new Scanner(System.in);

		System.out.println("Introdueix el nom de les ciutats: ");
		
		ciutat1 = introNoms.nextLine();
		ciutat2 = introNoms.nextLine();
		ciutat3 = introNoms.nextLine();
		ciutat4 = introNoms.nextLine();
		ciutat5 = introNoms.nextLine();
		ciutat6 = introNoms.nextLine();
		
		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);
		
	}

}
