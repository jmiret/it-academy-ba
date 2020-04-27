/*
 * 
 * FASE 4
 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
 * És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
 * 
 */

package fases;

import java.util.ArrayList;

public class Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> name = new ArrayList<>();
		ArrayList<Character> surname = new ArrayList<>();
		ArrayList<Character> fullName = new ArrayList<>();
				
		name.add('J');
		name.add('O');
		name.add('R');
		name.add('D');
		name.add('I');
		
		surname.add('M');
		surname.add('I');
		surname.add('R');
		surname.add('E');
		surname.add('T');
		
		for (int i = 0; i < name.size(); i++) {
			fullName.add(name.get(i));
		}
		
		fullName.add(' ');
		
		for (int i = 0; i < surname.size(); i++) {
			fullName.add(surname.get(i));
		}
		
		System.out.println(fullName);
		
	}
	
}
