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
                valIntroValues++; // valIntroValues ahora como contador de platos no existentes en menuList  					
            }
        }		
    }
    
    // Mostramos precio total		
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
        valIntroValues = 0; 			// valIntroValues ahora como variable de unidades de bitllete
            
        orderList = []; 				// orderList ahora como lista de billetes
        orderList.push(billFiveHundred);
        orderList.push(billTwoHundred);
        orderList.push(billOneHundred);
        orderList.push(billFifty);
        orderList.push(billTwenty);
        orderList.push(billTen);
        orderList.push(billFive);
        
        for (let i = 0; i < orderList.length; i++) {
            valIntroValues = Math.trunc(totalPrice / orderList[i]); 			                // obtenemos la parte entera del cociente	
            totalPrice = totalPrice - (orderList[i] * valIntroValues); 		            		// obtenemos el resto de euros
            totalPrice = Math.round(totalPrice * 100) / 100;							        // redondeamos a 2 decimales
            console.log(valIntroValues + " bitllets de " + orderList[i] + " €.");				
        }
        
        console.log("=> " + totalPrice + " € en monedes.");			
			
	}
										
}
