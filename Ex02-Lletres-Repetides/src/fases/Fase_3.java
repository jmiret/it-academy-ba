/*
 * 
 * FASE 3
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
 * 
 */

package fases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> lletresNom = new ArrayList<>();
		int freqLletres;
		HashMap<Character, Integer> mapLletresNom = new HashMap<Character, Integer>();	
				
		lletresNom.add('7');
		lletresNom.add('A');
		lletresNom.add('R');
		lletresNom.add('N');
		lletresNom.add('A');
		lletresNom.add('U');
				
		for(int i = 0; i < lletresNom.size(); i++) {
						
			System.out.print(lletresNom.get(i));
			
			//if (Character.isDigit(((CharSequence) lletresNom).charAt(i))) {
			if (Character.isDigit(lletresNom.get(i))) {
				System.out.print(" Els noms de persones no contenen números! ");			
			} else {
				freqLletres = Collections.frequency(lletresNom, lletresNom.get(i));
				mapLletresNom.put(lletresNom.get(i), freqLletres);
				
				if (lletresNom.get(i) == 'A' || lletresNom.get(i) == 'E' || lletresNom.get(i) == 'I' || lletresNom.get(i) == 'O' || lletresNom.get(i) == 'U') {
					System.out.print(" VOCAL ");
				} else {
					System.out.print(" CONSONANT ");
				}
			}
			
			System.out.println(" ");
		}
		
		System.out.println(mapLletresNom);		
		
	}

}