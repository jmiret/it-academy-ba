package com.floristeria.Controller;

import java.util.List;

import com.floristeria.Domain.Tree;
import com.floristeria.Domain.Deco;
import com.floristeria.Domain.Flower;
import com.floristeria.Domain.Material;
import com.floristeria.Domain.Product;
import com.floristeria.Persistence.FlowerShopRepository;

public class FlowerShopController {
	
	private FlowerShopRepository repository;
	
	public FlowerShopController() {
		this.repository = new FlowerShopRepository();
	}
	
	public void addTree(String name, double preu, double alcada) throws Exception {
		Tree tree = new Tree(name, preu, alcada);
		/*
		if (repository.findProduct(arbre) == 0) {
			//System.out.println("Producte NO EXITEIX");
			arbre.setStock(1);
		} else {
			//System.out.println("Producte EXISTEIX");
			arbre.setStock(repository.findProduct(arbre));
		}	
		*/
		tree.setStock(repository.inventory(tree));
		repository.addProduct(tree);
	}
	
	public void addFlower(String name, double preu, String color) throws Exception {
		Flower flower = new Flower(name, preu, color);
		flower.setStock(repository.inventory(flower));
		repository.addProduct(flower);
	}
	
	public void addDecorAccessories(String name, double preu, Material material) throws Exception {
		Deco deco = new Deco(name, preu, material);
		deco.setStock(repository.inventory(deco));
		repository.addProduct(deco);
	}
	
	public List<Product> getAllProducts() {
		return repository.getAllProducts();
	}
	
	public Product getLastProduct() {
		return repository.getLastProduct();
	}
	
}
