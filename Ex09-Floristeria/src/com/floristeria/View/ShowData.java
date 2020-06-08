package com.floristeria.View;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.floristeria.Controller.FlowerShopController;
import com.floristeria.Domain.Product;

public class ShowData {
	
	public ShowData() {
		super();
	}
		
	public static void getInitialProducts(FlowerShopController controller) {

		List<Product> products = controller.getAllProducts();
	
		System.out.println("********** Floristeria **********");
		System.out.println("");
		System.out.println("++ Initial stock...\n");
		
		for (Product product : products) {
			System.out.println(" - " + product.toString());
		}	
		
		System.out.println("");
		
	}
	
	public static void getAllProducts(FlowerShopController controller) {

		List<Product> products = controller.getAllProducts();
	
		System.out.println("********** Floristeria **********");
		System.out.println("");
		System.out.println("++ Stock...\n");
		
		for (Product product : products) {
			System.out.println(" - " + product.toString());
		}	
		
		System.out.println("");
		
	}
	
	public static void getAllProductsByClass(FlowerShopController controller) {

		List<Product> products = controller.getAllProducts();

		// Order by Class Type
		//Collections.sort(products, (object1, object2) -> object1.getClass().getName().compareTo(object2.getClass().getName()));
		
		
		Collections.sort(products, new Comparator<Product>() {
			
			// Order by Class Type
			@Override
			public int compare(Product object1, Product object2) {
			    return object2.getClass().getName().compareTo(object1.getClass().getName());
			}
						
			/*
			// Order by Name Product
			@Override
			public int compare(Product object1, Product object2) {
			    return object1.getNom().compareTo(object2.getNom());
			}
			*/
			
			/*
			// Order by Stock
			@Override
			public int compare(Product object1, Product object2) {
			  if (object1.getStock() > object2.getStock()) return -1; 	// by DESC
			  if (object1.getStock() < object2.getStock()) return 1; 	// by ASC
			   return 0;
			}
			*/
			
		});
		
		/*
		Collections.sort(products, new Comparator<Product>() {
						
			// Order by Name Product
			@Override
			public int compare(Product object1, Product object2) {
			    return object1.getNom().compareTo(object2.getNom());
			}
		
			
		});	
		*/
		System.out.println("********** Floristeria **********");
		System.out.println("");
		System.out.println("++ Ordered Stock...\n");
		
		for (Product product : products) {
			System.out.println(" - " + product.toString());
		}	
		
		System.out.println("");
		
	}
	
	public static void getLastProduct(FlowerShopController controller) {

		Product product = controller.getLastProduct();
	
		System.out.println("Product added: ");
		System.out.println(" - " + product.toString());
				
		System.out.println("");
		
	}
	
	public static List<Product> getUnitsByClass(Class<? extends Product> specificClass, List<? extends Product> units) {
	     return units.stream()
	                 .filter(e -> e.getClass().equals(specificClass))
	                 .collect(Collectors.toList());
	}
	
}
