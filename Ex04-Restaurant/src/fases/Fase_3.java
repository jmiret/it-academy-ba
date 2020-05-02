/*
 * 
 * FASE 3 
 * Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al principi.
 * En el cas que la informació que hem introduït a la List coincideixi amb la del array, 
 * haurem de sumar el preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui 
 * que el producte que hem demanat no existeix.
 *   
 */

package fases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase_3 {

	public static void main(String[] args) {
	
		int billFive= 5 ;
		int billTen = 10;
		int billTwenty = 20;
		int billFifty = 50;
		int billOneHundred = 100;
		int billTwoHundred = 200;
		int billFiveHundred = 500;
		
		float totalPrice = 0;
		
		String[] menuList = new String[5];
		float[] menuPrices = new float[5];
		
		List<Object> orderList = new ArrayList<>();
		
		Scanner introValues = new Scanner(System.in);
		
		int valIntroValues = 1;
		
		System.out.println("Introdueix els plats i preu del menú d'avui: ");
		
		// Save intro values in arrays
		for (int i = 0; i < menuPrices.length; i++) {
			System.out.println("Nom del plat: ");
			menuList[i] = introValues.nextLine();
			System.out.println("Preu del plat: ");
			menuPrices[i] = Float.parseFloat(introValues.nextLine());
		}
		
		// Show menu list
		System.out.println("");
		System.out.println("**********");
		System.out.println("Menu List:");
		System.out.println("**********");
				
		// Show values in arrays
		for (int i = 0; i < menuPrices.length; i++) {
			System.out.print(menuList[i]);
			System.out.print(" - ");
			System.out.println(menuPrices[i]);
		}
						
		System.out.println("");
		
		while (valIntroValues == 1) {			
			System.out.println("Vols demanar menjar (1:Si / 0:No)? ");
			if (Integer.parseInt(introValues.nextLine()) == 1) {
				System.out.println("Quins plats vols? ");
				orderList.add(introValues.nextLine());
			} else {
				valIntroValues = 0;
			}
		}		
		
		// Show orderList
		System.out.println("");
		System.out.println("***********");
		System.out.println("Order List:");
		System.out.println("***********");
		
		orderList.forEach((item) -> System.out.println(item));						
		
		// Search list element in array
		for (int i = 0; i < orderList.size(); i++) {
			for (int j = 0; j < menuList.length; j++) {				
				if (orderList.get(i).equals(menuList[j])) {	
					totalPrice += menuPrices[j]; // calculem preu total
					valIntroValues++; // valIntroValues como controlador de platos no existentes en menuList 					
				}
			}		
		}
		
		// Mostramos precio total
		totalPrice = (float) Math.round(totalPrice * 100) / 100; // redondeamos a 2 decimales				
		if (valIntroValues != orderList.size() || orderList.size() == 0) { // valIntroValues ahora como contador de platos no existentes en menuList
			System.out.println("");
			System.out.println("Llista buida o amb algun plat que no està en el menú.");
		} else {
			System.out.println("");
			System.out.println("***********");
			System.out.println("Preu Total:");
			System.out.println("***********");
			System.out.println(totalPrice + " €");	
			System.out.println("");
			
			// Calculem desglos monedes	
			valIntroValues = 0; 			// valIntroValues ahora como variable de unidades de bitllete
				
			orderList.clear(); 				// orderList ahora como lista de billetes
			orderList.add(billFiveHundred);
			orderList.add(billTwoHundred);
			orderList.add(billOneHundred);
			orderList.add(billFifty);
			orderList.add(billTwenty);
			orderList.add(billTen);
			orderList.add(billFive);
			
			for (int i = 0; i < orderList.size(); i++) {
				valIntroValues = (int) Math.floor(totalPrice / (int) orderList.get(i)); 			// obtenemos la parte entera del cociente	
				totalPrice = totalPrice - ((int) orderList.get(i) * valIntroValues); 				// obtenemos el resto de euros
				totalPrice = (float) Math.round(totalPrice * 100) / 100;							// redondeamos a 2 decimales
				System.out.println(valIntroValues + " bitllets de " + orderList.get(i) + " €.");				
			}
			
			System.out.println("=> " + totalPrice + " € en monedes.");		
						
		}		
								
	}
	
}
