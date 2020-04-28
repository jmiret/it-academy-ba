var ciutat1 = "";
var ciutat2 = "";
var ciutat3 = "";
var ciutat4 = "";
var ciutat5 = "";
var ciutat6 = "";

var arrayCiutats = [];

fase_1();
fase_2();
fase_3();
fase_4();

function fase_1() {

    console.log("···· Fase_1 ····");
    console.log("Introdueix el nom de les ciutats: ");

    ciutat1 = prompt("ciutat1: ");
    ciutat2 = prompt("ciutat2: ");
    ciutat3 = prompt("ciutat3: ");
    ciutat4 = prompt("ciutat4: ");
    ciutat5 = prompt("ciutat5: ");
    ciutat6 = prompt("ciutat6: ");   

    console.log(ciutat1);
    console.log(ciutat2);
    console.log(ciutat3);
    console.log(ciutat4);
    console.log(ciutat5);
    console.log(ciutat6);

    console.log("");
}

function fase_2() {
   
    console.log("···· Fase_2 ····");
           
    arrayCiutats.push(ciutat1);
    arrayCiutats.push(ciutat2);
    arrayCiutats.push(ciutat3);
    arrayCiutats.push(ciutat4);
    arrayCiutats.push(ciutat5);
    arrayCiutats.push(ciutat6);  

    arrayCiutats.sort();

    for (let i = 0; i < arrayCiutats.length; i++) {
        console.log(arrayCiutats[i]);
    }
   
    console.log("");

}

function fase_3() {

    let arrayCiutatsModificades = []; 

    console.log("···· Fase_3 ····");

    // Canvi de les vocals "a" per el número "4" de les ciutats
    for (let i = 0; i < arrayCiutats.length; i++) {
        arrayCiutats[i] = arrayCiutats[i].replace(/a/g, "4");
        arrayCiutatsModificades[i] = arrayCiutats[i];
    }

    arrayCiutatsModificades.sort();

    for (let i = 0; i < arrayCiutatsModificades.length; i++) {
        console.log(arrayCiutatsModificades[i]);
    }

    console.log(" ");

}

function fase_4() {

    let arrayCiutat1 = [];
    let arrayCiutat2 = [];
    let arrayCiutat3 = [];
    let arrayCiutat4 = [];
    let arrayCiutat5 = [];
    let arrayCiutat6 = [];

    console.log("···· Fase_4 ····");
    
    arrayCiutat1 = ciutat1.split('');
    arrayCiutat2 = ciutat2.split('');
    arrayCiutat3 = ciutat3.split('');
    arrayCiutat4 = ciutat4.split('');
    arrayCiutat5 = ciutat5.split('');
    arrayCiutat6 = ciutat6.split('');

    for (let i = arrayCiutat1.length - 1; i >= 0; i--) {
        console.log(arrayCiutat1[i]);
    }

    console.log(" ");

    for (let i = arrayCiutat2.length - 1; i >= 0; i--) {
        console.log(arrayCiutat2[i]);
    }

    console.log(" ");

    for (let i = arrayCiutat3.length - 1; i >= 0; i--) {
        console.log(arrayCiutat3[i]);
    }

    console.log(" ");

    for (let i = arrayCiutat4.length - 1; i >= 0; i--) {
        console.log(arrayCiutat4[i]);
    }

    console.log(" ");

    for (let i = arrayCiutat5.length - 1; i >= 0; i--) {
        console.log(arrayCiutat5[i]);
    }

    console.log(" ");

    for (let i = arrayCiutat6.length - 1; i >= 0; i--) {
        console.log(arrayCiutat6[i]);
    }

    console.log(" ");

}