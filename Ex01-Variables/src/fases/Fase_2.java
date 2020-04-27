package fases;

public class Fase_2 {
	
	public static void main(String args[]) {
		
		String nom;
		String cognoms1;
		String cognoms2;
		
		int dia;
		int mes;
		int any;
		final int anyIni = 1948;
		
		int anyTemp;
		int totalAnysTraspas;
				
		nom = "Jordi";
		cognoms1 = "Miret";
		cognoms2 = "Massó";
		
		dia = 19;
		mes = 2;
		any = 1973;
		anyTemp = 0;
		totalAnysTraspas = 0;				
		
		for (anyTemp = anyIni; anyTemp <= any; anyTemp++) { 
			if ((anyTemp % 4 == 0) && (anyTemp % 100 != 0) || (anyTemp % 400) == 0) { // verifiquem si l'any es de traspàs
				totalAnysTraspas++;
			}
		}
		
		System.out.println(cognoms1 + " " + cognoms2 + " " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		System.out.println("Entre l'any " + anyIni + " i l'any " + any + " hi ha " + totalAnysTraspas + " anys de traspàs.");
	}

}
