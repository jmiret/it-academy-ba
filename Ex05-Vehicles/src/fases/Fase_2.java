/*
 * Fase_2 
 * Una matrícula ha de tenir 4 números i dues o tres lletres.
 * Un diametre de la roda ha de ser superior a 0.4 i inferior a 4
 *  
 */

package fases;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String matricula = "";
		String marcaCotxe = "";
		String color = "";
		Car cotxe;
		List<Wheel> rodesDavanteres = new ArrayList<Wheel>();
		List<Wheel> rodesPosteriors = new ArrayList<Wheel>();
		String marcaRoda = "";
		double diametre = 0.0;
		
		Pattern pattern = Pattern.compile("^\\d{4}[A-Z]{3}");
		Matcher matcher;
		
		// Validamos matrícula
		do {
			matricula = JOptionPane.showInputDialog("Matrícula del cotxe. Format (1234ABC): ");
			matcher = pattern.matcher(matricula);	
		} while (!matcher.matches());
				
		marcaCotxe = JOptionPane.showInputDialog("Marca del cotxe: ");
		color = JOptionPane.showInputDialog("Color del cotxe: ");		
						
		marcaRoda = JOptionPane.showInputDialog("Marca de la roda: ");
		
		// Validamos diámetro ruedas delanteras		
		do {
			diametre = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda. Format (de 0.4\" a 4.0\"): "));
		} while ((diametre < 0.4 || diametre > 4));
		
		rodesDavanteres.add(new Wheel(marcaRoda, diametre));
		rodesDavanteres.add(new Wheel(marcaRoda, diametre));
						
		marcaRoda = JOptionPane.showInputDialog("Marca de la roda: ");
		
		// Validamos diámetro ruedas traseras		
		do {
			diametre = Float.parseFloat(JOptionPane.showInputDialog("Diàmetre de la roda. Format (de 0.4\" a 4.0\"): "));
		} while ((diametre < 0.4 || diametre > 4));
		
		rodesPosteriors.add(new Wheel(marcaRoda, diametre));
		rodesPosteriors.add(new Wheel(marcaRoda, diametre));	
		
		cotxe = new Car(matricula, marcaCotxe, color);
		try {
			cotxe.addWheels(rodesDavanteres, rodesPosteriors);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
