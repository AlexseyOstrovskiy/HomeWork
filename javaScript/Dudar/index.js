/*
var gramm = 1500;
let divId = document.getElementById ("divId");
console.log(gramm);
divId.innerText = gramm;
function more(){
    gramm = gramm + 150;
    divId.innerText = gramm;
}
*/

/* Надпись отображающая текущее количество коффке в баке */
var coffeFullGr =500;
let coffeGr = document.getElementById("coffeGr");
coffeGr.innerText = coffeFullGr;


/*
Диаграмма отображающая количества коффе в баке
let graffCoffeGr = document.getElementById("graffCoffeGr");
graffCoffeGr.innerText = &#9733; */

/* Надпись отображающая текущее количество воды в баке */
var waterFullMl =1000;
let waterMl = document.getElementById("waterMl");
waterMl.innerText = waterFullMl;

/*Диалоговое окно*/
let dialog = document.getElementById("dialogBoxId");
let messageHi = "Добро пожаловать";
let messageNoWater = "Для приготовления напитка недостаточно воды";
let messageNoCoffe = "Для приготовления напитка недостаточно коффе в баке."
let messageAllOk = "Ваш напиток готов";
dialog.innerText = messageHi;

/*Кнопка Американо */
var coffeForAmericano = 30;
var waterForAmericano = 110;

function makeAmericano(){
        if(coffeFullGr > coffeForAmericano && waterFullMl > waterForAmericano){
        waterFullMl = waterFullMl - waterForAmericano;
        waterMl.innerText = waterFullMl;
        coffeFullGr = coffeFullGr - coffeForAmericano;
        coffeGr.innerText = coffeFullGr;
        dialog.innerText = messageAllOk;
    }     
         if(coffeFullGr < coffeForAmericano){
        dialog.innerText = messageNoCoffe;
         }
         if(waterFullMl < waterForAmericano){
            dialog.innerText = messageNoWater;
        }
}

/*кнопка Эспрессо */
var coffeForEspresso =40 ;
var waterForEspresso = 185;

function makeEspresso(){
    if(coffeFullGr > coffeForEspresso && waterFullMl > waterForEspresso){
    waterFullMl = waterFullMl - waterForEspresso;
    waterMl.innerText = waterFullMl;
    coffeFullGr = coffeFullGr - coffeForEspresso;
    coffeGr.innerText = coffeFullGr;
    dialog.innerText = messageAllOk;
}     
     if(coffeFullGr < coffeForEspresso){
    dialog.innerText = messageNoCoffe;
     }
     if(waterFullMl < waterForEspresso){
        dialog.innerText = messageNoWater;
    }
}