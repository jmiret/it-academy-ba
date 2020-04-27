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
		cognoms2 = "Mass�";
		
		dia = 19;
		mes = 2;
		any = 1973;
		anysTraspas = "";			
		esTraspas = false;
		
		msgEsAnyTraspas = "El meu any de naixement �s de trasp�s.";
		msgNoEsAnyTraspas = "El meu any de naixement no �s de trasp�s.";
		
		for (anyIni = 1948; anyIni <= any; anyIni++) {
			if ((anyIni % 4 == 0) && (anyIni % 100 != 0) || (anyIni % 400) == 0) { // verifiquem si l'any es de trasp�s
				anysTraspas += anyIni + " ";
				if ((anyIni == any)) { // verifiquem si l'any de naixement es de trasp�s
					esTraspas = true;
				}
			}
		}		
				
		System.out.println(cognoms1 + " " + cognoms2 + " " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		System.out.println("Entre l'any " + anyIni + " i l'any " + any + " aquests anys: " + anysTraspas + "son de trasp�s.");
		
		if (esTraspas) {
			System.out.println(msgEsAnyTraspas);		
		} else {
			System.out.println(msgNoEsAnyTraspas);
		}
	}	
}