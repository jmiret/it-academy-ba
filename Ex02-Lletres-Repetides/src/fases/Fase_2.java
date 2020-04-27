
/*
 * 
 * FASE 2
 * Canvia la taula per una llista (List<Character>)
 * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONANT’.
 * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!
 * 
 */
package fases;

import java.util.ArrayList;

public class Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> lletresNom = new ArrayList<>();
				
		lletresNom.add('J');
		lletresNom.add('O');
		lletresNom.add('R');
		lletresNom.add('D');
		lletresNom.add('7');
		lletresNom.add('I');
				
		for(int i = 0; i < lletresNom.size(); i++) {
			
			System.out.print(lletresNom.get(i));
			
			//if (Character.isDigit(((CharSequence) lletresNom).charAt(i))) {
			if (Character.isDigit(lletresNom.get(i))) {
				System.out.print(" Els noms de persones no contenen números! ");			
			} else {
				if (lletresNom.get(i) == 'A' || lletresNom.get(i) == 'E' || lletresNom.get(i) == 'I' || lletresNom.get(i) == 'O' || lletresNom.get(i) == 'U') {
					System.out.print(" VOCAL ");
				} else {
					System.out.print(" CONSONANT ");
				}
			}
			
			System.out.println(" ");
		}		
		
	}

}
