/*
 * Fase_3
 * Modifica el projecte anterior afegint els mètodes necessaris a Bike, de manera que es pugui afegir rodes davanteres i traseres. 
 * Preguntar a l’usuari si vol crear un cotxe o una moto.
 * Demanar a l’usuari la matrícula, la marca i el seu color.
 * Afegir-li les rodes traseres corresponents, demanant a l’usuari la marca i el diametre.
 * Afegir-li les rodes davanteres corresponents, demanant a l’usuari la marca i el diametre.
 *
 */

package fases;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.vehicles.project.Bike;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vehiculo = "";
		String matricula = "";
		String brand = "";
		String color = "";
		Car cotxe;
		Bike bike;
		List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
		List<Wheel> rodesPosteriors = new ArrayList<Wheel>();
		String marcaRoda = "";
		double diametre = 0.0;
		
		Pattern pattern = Pattern.compile("^\\d{4}[A-Z]{3}");
		Matcher matcher;
		
		// Preguntamos vehículo: car o bike
		do {
			vehiculo = JOptionPane.showInputDialog("Vehículo? Format (Car / Bike): ");
		
		} while (!(vehiculo.equals("Car") || vehiculo.equals("Bike")));
		
		// Validamos matrícula
		do {
			matricula = JOptionPane.showInputDialog("Matrícula? Format (1234ABC): ");
			matcher = pattern.matcher(matricula);	
		} while (!matcher.matches());
				
		brand = JOptionPane.showInputDialog("Marca: ");
		color = JOptionPane.showInputDialog("Color: ");		
						
		marcaRoda = JOptionPane.showInputDialog("Marca de la roda: ");
		
		// Validamos diámetro ruedas delanteras		
		do {
			diametre = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda. Format (de 0.4\" a 4.0\"): "));
		} while ((diametre < 0.4 || diametre > 4));
		
		rodesDavanteres.add(new Wheel(marcaRoda, diametre));
		
		if (vehiculo.equals("Car"))
			rodesDavanteres.add(new Wheel(marcaRoda, diametre));
						
		marcaRoda = JOptionPane.showInputDialog("Marca de la roda: ");
		
		// Validamos diámetro ruedas traseras		
		do {
			diametre = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda. Format (de 0.4\" a 4.0\"): "));
		} while ((diametre < 0.4 || diametre > 4));
		
		rodesPosteriors.add(new Wheel(marcaRoda, diametre));
		
		if (vehiculo.equals("Car"))
			rodesPosteriors.add(new Wheel(marcaRoda, diametre));	
		
		try {
			if (vehiculo.equals("Car")) {
				cotxe = new Car(matricula, brand, color);
				cotxe.addWheels(rodesDavanteres, rodesPosteriors);
			} else if (vehiculo.equals("Bike")) {
				bike = new Bike(matricula, brand, color);		
				bike.addWheels(rodesDavanteres, rodesPosteriors);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
