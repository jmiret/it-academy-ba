fase_1();
fase_2();
fase_3();
fase_4();

function fase_1() {
	
    let nom;
    let cognoms1;
    let cognoms2;
    
    let dia;
    let mes;
    let any;
    
    nom = "Jordi";
    cognoms1 = "Miret";
    cognoms2 = "Massó";
    
    dia = 23;
    mes = 4;
    any = 2020;
    
    console.log("···· Fase_1 ····");
    console.log(cognoms1 + " " + cognoms2 + " " + nom);
    console.log(dia + "/" + mes + "/" + any);
    console.log("");
	
}


function fase_2() {
	
    let nom;
    let cognoms1;
    let cognoms2;
    
    let dia;
    let mes;
    let any;
    const anyIni = 1948;
    
    let anyTemp;
    let totalAnysTraspas;
            
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
    
    console.log("···· Fase_2 ····");
    console.log(cognoms1 + " " + cognoms2 + " " + nom);
    console.log(dia + "/" + mes + "/" + any);
    console.log("Entre l'any " + anyIni + " i l'any " + any + " hi ha " + totalAnysTraspas + " anys de traspàs.");
    console.log("");
	
}

function fase_3() {
	
    let nom;
    let cognoms1;
    let cognoms2;
    
    let dia;
    let mes;
    let any;
    let anyIni;
    
    let anysTraspas;
    let esTraspas;
    
    let msgEsAnyTraspas;
    let msgNoEsAnyTraspas;
            
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
     
    console.log("···· Fase_3 ····");
    console.log(cognoms1 + " " + cognoms2 + " " + nom);
    console.log(dia + "/" + mes + "/" + any);
    console.log("Entre l'any " + anyIni + " i l'any " + any + " aquests anys: " + anysTraspas + "son de traspàs.");
    
    if (esTraspas) {
        console.log(msgEsAnyTraspas);		
    } else {
        console.log(msgNoEsAnyTraspas);
    }
    console.log("");	
}

function fase_4() {
	
    let nom;
    let cognoms1;
    let cognoms2;
    let nomComplet;
    
    let dia;
    let mes;
    let any;
    let dataNaixement;
    let anyIni;
    
    let anysTraspas;
    let esTraspas;
    
    let msgEsAnyTraspas;
    let msgNoEsAnyTraspas;
            
    nom = "Jordi";
    cognoms1 = "Miret";
    cognoms2 = "Massó";
    nomComplet = nom + " " + cognoms1 + " " + cognoms2;
    
    dia = 19;
    mes = 2;
    any = 1973;
    dataNaixement = dia + "/" + mes + "/" + any;
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
    
    console.log("···· Fase_4 ····");
    console.log("El meu nom és: " + nomComplet);
    console.log("Vaig néixer el: "+ dataNaixement);
    console.log("Entre l'any " + anyIni + " i l'any " + any + " aquests anys: " + anysTraspas + "son de traspàs.");
    
    if (esTraspas) {
        console.log(msgEsAnyTraspas);		
    } else {
        console.log(msgNoEsAnyTraspas);
    }
	console.log("");
}