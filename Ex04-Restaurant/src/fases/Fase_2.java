/*
 * 
 * FASE 2
 * Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
 * Afegirem el nom del plat i després el preu.
 * Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, 
 * guardarem la informació en una List fent servir un bucle while.
 * Haurem de preguntar si es vol seguir demanant menjar. 
 * Podeu fer servir el sistema (1:Si / 0:No), per tant haureu de crear un altre variable int per guardar la informació.
 * 
 */

package fases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fase_2 {
	
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
		
		// Save intro values in arrays while 1
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
		
	}
	
}	
