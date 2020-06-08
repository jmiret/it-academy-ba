package com.floristeria.Persistence;

import com.floristeria.Controller.FlowerShopController;
import com.floristeria.Domain.Material;

public class LoadDatabase {
	
	public LoadDatabase() {}
		
	public static void loadData(FlowerShopController controller) throws Exception {
		
		controller.addTree("Garrofer", 750, 1.90);
		controller.addTree("Garrofer", 750, 1.90);
		controller.addTree("Pi", 250, 1.90);
		/*
		controller.addTree("Morera", 345, 2.00);		
		controller.addTree("Plataner", 500, 1.90);
		controller.addTree("Plataner", 500, 1.90);
		controller.addTree("Garrofer", 750, 1.90);
		controller.addTree("Garrofer", 755, 1.95);
		controller.addTree("Garrofer", 750, 1.95);
		controller.addTree("Llimoner", 750, 1.95);
		controller.addTree("Morera", 346, 2.10);
		*/
		controller.addFlower("Petunia", 1.45, "lila");
		controller.addFlower("Mesem", 1.95, "violeta");
		/*
		controller.addFlower("Farigola", 1.30, "blanca");
		controller.addFlower("Mesem", 2.50, "rosa");
		controller.addFlower("Girani", 1.55, "rosa");
		*/
		controller.addDecorAccessories("Cofre", 245.75, Material.fusta);
		controller.addDecorAccessories("Pot", 1.59, Material.plàstic);
		/*
		controller.addDecorAccessories("Cullerot", 4.58, Material.fusta);
		controller.addDecorAccessories("Cullerot", 4.58, Material.fusta);
		*/
		
	}

}
