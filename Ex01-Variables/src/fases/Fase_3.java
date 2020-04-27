package fases;

public class Fase_3 {
	
	public static void main(String args[]) {
		
		String nom;
		String cognoms1;
		String cognoms2;
		
		int dia;
		int mes;
		int any;
		int anyIni;
		
		String anysTraspas;
		boolean esTraspas;
		
		String msgEsAnyTraspas;
		String msgNoEsAnyTraspas;
				
		nom = "Jordi";
		cognoms1 = "Miret";
		cognoms2 = "Massó";
		
		dia = 19;
		mes = 2;
		any = 1973;
		anysTraspas = "";			
		esTraspas = false;
		
		msgEsAnyTraspas = "El meu any de naixement és de traspàs.";
		msgNoEsAnyTraspas = "El meu any de naixement no és de traspàs.";
		
		for (anyIni = 1948; anyIni <= any; anyIni++) {
			if ((anyIni % 4 == 0) && (anyIni % 100 != 0) || (anyIni % 400) == 0) { // verifiquem si l'any es de traspàs
				anysTraspas += anyIni + " ";
				if ((anyIni == any)) { // verifiquem si l'any de naixement es de traspàs
					esTraspas = true;
				}
			}
		}		
				
		System.out.println(cognoms1 + " " + cognoms2 + " " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		System.out.println("Entre l'any " + anyIni + " i l'any " + any + " aquests anys: " + anysTraspas + "son de traspàs.");
		
		if (esTraspas) {
			System.out.println(msgEsAnyTraspas);		
		} else {
			System.out.println(msgNoEsAnyTraspas);
		}
	}	
}