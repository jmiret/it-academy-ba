/*
 * 
 * Fase_1 
 * Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
 * Crear el cotxe amb les dades anteriors.
 * Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
 * Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
 * 
 */

package fases;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Fase_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String matricula = "";
		String marcaCotxe = "";
		String color = "";
		Car cotxe;
		List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
		List<Wheel> rodesPosteriors = new ArrayList<Wheel>();
		String brand = "";
		double diameter = 0.0;
		
		matricula = JOptionPane.showInputDialog("Matrícula del cotxe: ");
		marcaCotxe = JOptionPane.showInputDialog("Marca del cotxe: ");
		color = JOptionPane.showInputDialog("Color del cotxe: ");		
						
		brand = JOptionPane.showInputDialog("Marca de la roda: ");
		diameter = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda: "));		
		
		rodesDavanteres.add(new Wheel(brand, diameter));
		rodesDavanteres.add(new Wheel(brand, diameter));
						
		brand = JOptionPane.showInputDialog("Marca de la roda: ");
		diameter = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda: "));
		
		rodesPosteriors.add(new Wheel(brand, diameter));
		rodesPosteriors.add(new Wheel(brand, diameter));			
		
		cotxe = new Car(matricula, marcaCotxe, color);
		try {
			cotxe.addWheels(rodesDavanteres, rodesPosteriors);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}	
	
}
