console.log("···· Fase_1 ····");    

var billFive = 5;
var billTen = 10;
var billTwenty = 20;
var billFifty = 50;
var billOneHundred = 100;
var billTwoHundred = 200;
var billFiveHundred = 500;

var totalPrice = 0.0;

var menuList = [];
var menuPrices = [];
var orderList = [];
        
var valIntroValues = 1;

console.log("");

fase_2();
fase_3();

function fase_2() {
   	   
    console.log("···· Fase_2 ····");

    console.log("Introdueix els plats i preu del menú d'avui: ");
		
    // Save intro values in arrays
    for (let i = 0; i < 5; i++) {
        menuList.push(prompt("Nom del plat: ", ""));
        menuPrices.push(parseFloat(prompt("Preu del plat: ", "")));
    }

    // Show menu list
    console.log("");
    console.log("**********");
    console.log("Menu List:");
    console.log("**********");
		
    // Show values in arrays
    for (let i = 0; i < menuPrices.length; i++) {
        console.log((menuList[i]) + " - " + (menuPrices[i]));
    }
    
    // Save intro values in arrays while 1
    while (valIntroValues == 1) {
        if (prompt("Vols demanar menjar (1:Si / 0:No)? ", "") == 1) {            
            orderList.push(prompt("Quins plats vols? "));
        } else {            
            valIntroValues = 0;
        }
    }
    
    // Show orderList
    console.log("");
    console.log("***********");
    console.log("Order List:");
    console.log("***********");
    
    for (let i = 0; i < orderList.length; i++) {
        console.log(orderList[i]);
    }
  
}

function fase_3() {
    
    console.log("");
    console.log("···· Fase_3 ····");   

   // Search list element in array
    for (let i = 0; i < orderList.length; i++) {
        for (let j = 0; j < menuList.length; j++) {				
            if (orderList[i] == (menuList[j])) {	
                totalPrice += menuPrices[j]; // calculem preu total
                valIntroValues++; // valIntroValues como controlador de platos no existentes en menuList 					
            }
        }		
    }
    
    // valIntroValues como controlador de platos no existentes en menuList		
    if (valIntroValues != orderList.length || orderList.length == 0) {
        console.log("");
        console.log("Llista buida o amb algun plat que no està en el menú.");
    } else {
        console.log("");
        console.log("***********");
        console.log("Preu Total:");
        console.log("***********");
        console.log(Math.round(totalPrice * 100) / 100 + " €");	
        console.log("");
        
        // Calculem desglos monedes	
        valIntroValues = 0; // valIntroValues como controlador de unidades de bitllete
            
        valIntroValues = Math.trunc(totalPrice / billFiveHundred); 	        // obtenemos la parte entera del cociente	
        totalPrice = totalPrice - (billFiveHundred * valIntroValues); 		// obtenemos el resto de euros
        totalPrice = Math.round(totalPrice * 100) / 100;			        // redondeamos a 2 decimales
        console.log(valIntroValues + " bitllets de 500 €.");
        
        valIntroValues = Math.trunc(totalPrice / billTwoHundred);	 	
        totalPrice = totalPrice - (billTwoHundred * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 200 €.");
        
        valIntroValues = Math.trunc(totalPrice / billOneHundred);	 	
        totalPrice = totalPrice - (billOneHundred * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 100 €.");
        
        valIntroValues = Math.trunc(totalPrice / billFifty);	 	
        totalPrice = totalPrice - (billFifty * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 50 €.");
        
        valIntroValues = Math.trunc(totalPrice / billTwenty);	 	
        totalPrice = totalPrice - (billTwenty * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 20 €.");
        
        valIntroValues = Math.trunc(totalPrice / billTen);	 	
        totalPrice = totalPrice - (billTen * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 10 €.");
        
        valIntroValues = Math.trunc(totalPrice / billFive);	 	
        totalPrice = totalPrice - (billFive * valIntroValues);
        totalPrice = Math.round(totalPrice * 100) / 100;
        console.log(valIntroValues + " bitllets de 5 €.");
        
        console.log("=> " + totalPrice + " € en monedes.");			
			
	}
										
}

function existsArrayEl() {    
    for (let i = 0; i < orderList.length; i++) {
        for (let j = 0; j < menuList.length; j++) {
            if (orderList[i] == menuList[j]) {
                // Utilizamos la variable existente valIntroValue = 0 para validar elementos que existen
                // si valIntroValue = 0 hay entonces algún elemento de orderList no está en menuList
                valIntroValues = 1; 	
                return true;				
            }
        }		
    }
    return false;    
}

function getCanvi(numEuros) {
    var arrCanvi = [500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01]; // 15 tipos: posiciones 0-6 billetes, posiciones 7-14 monedas
    let unitats = 0;
  
    for (let i = 0; i < arrCanvi.length; i++) {
      unitats = Math.trunc(numEuros / arrCanvi[i]); // obtenemos la parte entera del cociente, unidades de billete o moneda
      numEuros = numEuros - (arrCanvi[i] * unitats); // obtenemos el resto de euros de cada iteración
      numEuros = Math.round(numEuros * 100) / 100; // redondeamos a 2 decimales
      if (unitats != 0) {
        arrCanvi.splice(i, 1, unitats); // reemplaza 1 elemento del índice "i" y añade "unitats"
      } else {
        arrCanvi.splice(i, 1, 0); // reemplaza 1 elemento del índice "i" y añade 0
      }  
    }
   
    return arrCanvi;
  }