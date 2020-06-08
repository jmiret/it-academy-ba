package com.floristeria.Application;

import java.util.Scanner;

import com.floristeria.Controller.FlowerShopController;
import com.floristeria.Domain.Material;
import com.floristeria.Persistence.LoadDatabase;
import com.floristeria.View.Console;
import com.floristeria.View.ShowData;

public class FloristeriaApplication {
	
	private static FlowerShopController controller = new FlowerShopController();
		
	public static Scanner dataEntry = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		int valDataEntry = -1;		
		
		LoadDatabase.loadData(controller);
				
		ShowData.getInitialProducts(controller);
		
		Console.showConsole();
		
		while(valDataEntry != 0) {
			
			valDataEntry = dataEntry.nextInt();
			
			switch(valDataEntry) {
				case 0:		
					valDataEntry = 0;
					break;
				case 1:
					// 1 Add Tree	    			
	    			addTree();	  
	    			ShowData.getLastProduct(controller);
					break;
				case 2:
					// 2 Add Flower
	    			addFlower();	  
	    			ShowData.getLastProduct(controller);
					break;
				case 3:
					// 3 Add Deco
	    			addDeco();	  
	    			ShowData.getLastProduct(controller);
					break;
				case 4:
					// 4 Show Stock
					ShowData.getAllProducts(controller);
					Console.showConsole();
					break;
				case 5:
					// 5 Show Ordered Stock
					ShowData.getAllProductsByClass(controller);
					Console.showConsole();
					break;	
				default:
					System.out.println("Option not valid.");
			}
			
		}
		
		dataEntry.close();
		
		goodBye();
		
	}
	
	public static void addTree() throws Exception {
		
		String name;
		double price;
		double height;
		
		System.out.println("++ Add Tree: ");
		System.out.println("Tree name: ");
			name = dataEntry.next();	    			
		System.out.println("Tree price: ");	    				
			price = dataEntry.nextDouble();
		System.out.println("Tree height: ");	    				
			height = dataEntry.nextDouble();			
			
		controller.addTree(name, price, height);
			
	}
	
	public static void addFlower() throws Exception {
		
		String name;
		double price;
		String color;
		
		System.out.println("++ Add Flower: ");
		System.out.println("Flower name: ");
			name = dataEntry.next();	    			
		System.out.println("Flower price: ");	    				
			price = dataEntry.nextDouble();
		System.out.println("Flower color: ");	    				
			color = dataEntry.next();			
			
		controller.addFlower(name, price, color);
			
	}
	
	public static void addDeco() throws Exception {
		
		String name;
		double price;
		Material material;
		
		System.out.println("++ Add Deco: ");
		System.out.println("Deco name: ");
			name = dataEntry.next();	    			
		System.out.println("Deco price: ");	    				
			price = dataEntry.nextDouble();
		System.out.println("Deco material ('fusta' or 'plàstic'): ");	    				
			material = Material.valueOf(dataEntry.next());		
			
		controller.addDecorAccessories(name, price, material);
			
	}
	
	public static void goodBye() {
    	
    	System.out.println("Exit.");
          
    }
	
}
