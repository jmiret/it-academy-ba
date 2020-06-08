package com.floristeria.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.floristeria.Domain.Product;

public class FlowerShopRepository {

	private static List<Product> products = new ArrayList<>();
	
	public FlowerShopRepository() { }
	
	public List<Product> getAllProducts() {
		return new ArrayList<>(products);		
	}
	
	public Product getLastProduct() {
		return new ArrayList<>(products).get(products.size() - 1);		
	}
	
	public void addProduct(Product product) throws Exception {
		if(product == null) throw new Exception();
		products.add(product);
	}

	public int inventory(Product product) {
		int count = product.getStock();
		for (Product producteList : products) {
			if (producteList.getNom().equals(product.getNom())) {
					count++;
			}
		}
		
		return count;
		 
	}
	
	public boolean findProduct_1(Product product) {
		if (products.contains(product)) {
			return true;
		} else {		
			return false;
		} 
	}
	
}
