fase_1();
fase_2();
fase_3();
fase_4();

function fase_1() {

    let lletresNom = ['J', 'O', 'R', 'D', 'I'];

    console.log("···· Fase_1 ····");

    for (let i = 0; i < lletresNom.length; i++) {
        console.log(lletresNom[i]);
    }

    console.log("");
}

function fase_2() {

    let lletresNom = ['J', 'O', '7', 'R', 'D', 'I'];

    console.log("···· Fase_2 ····");

    for (let i = 0; i < lletresNom.length; i++) {

        console.log(lletresNom[i]);

        if (!isNaN(lletresNom[i])) {
            console.log(" Els noms de persones no contenen números! ");			
        } else {
            if (lletresNom[i] == 'A' || lletresNom[i] == 'E' || lletresNom[i] == 'I' || lletresNom[i] == 'O' || lletresNom[i] == 'U') {
                console.log(" VOCAL ");
            } else {
                console.log(" CONSONANT ");
            }
        }
       
    }

    console.log("");

}

function fase_3() {

    let lletresNom = ['A', 'R', 'N', 'A', 'U'];
    let mapLletresNom = [[""], [0]];

    let lletra = null;
    let count = 0;

    console.log("···· Fase_3 ····");

    for (let i = 0; i < lletresNom.length; i++) {

        for (let j = 0; j < lletresNom.length; j++) {
            if (lletresNom[i] == lletresNom[j]) {
                count++;
            }
        } 
             
        mapLletresNom.push(lletresNom[i], count);

        count = 0;

    }

    console.log(mapLletresNom);

    console.log(" ");

}

function find_duplicate_in_array(arra1) {
    var object = {};
    var result = [];

    arra1.forEach(function (item) {
      if(!object[item])
          object[item] = 0;
        object[item] += 1;
    })

    for (var prop in object) {
       if(object[prop] >= 2) {
           result.push(prop);
       }
    }

    return result;

}

function fase_4() {

    let name = ['J', 'O', 'R', 'D', 'I'];
    let surname = ['M', 'I', 'R', 'E', 'T'];
    let fullName = [];
    
    console.log("···· Fase_4 ····");

    for (let i = 0; i < name.length; i++) {
        fullName.push(name[i]);
    }
    
    fullName.push(' ');
    
    for (let i = 0; i < surname.length; i++) {
        fullName.push(surname[i]);
    }
    
    console.log(fullName);

    console.log(" ");

}