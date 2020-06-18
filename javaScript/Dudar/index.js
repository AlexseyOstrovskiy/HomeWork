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
var coffeFullGr =505;
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



class CoffeeMachine{
    constructor (//coffeForAmericano, waterForAmericano, 
                //coffeForEspresso, waterForEspresso,
               // coffeForWEspresso, waterForWEspresso,
                coffeFullGr, waterFullMl){
                   // this.coffeForAmericano = coffeForAmericano;
                   // this.waterForAmericano = waterForAmericano;
                   // this.coffeForEspresso = coffeForEspresso;
                   // this.waterForEspresso = waterForEspresso;
                   // this.coffeForWEspresso = coffeForWEspresso;
                   // this.waterForWEspresso = waterForWEspresso;
                    this.coffeFullGr = coffeFullGr;
                    this.waterFullMl = waterFullMl;
                }

    /*Переменные */
 
 coffeForEspresso =40 ;
 waterForEspresso = 185;

 coffeForWEspresso =50 ;
 waterForWEspresso = 240;

 makeAmericanoClass(){
    coffeForAmericano = 30;
    waterForAmericano = 90;
   
        if(coffeFullGr > coffeForAmericano && waterFullMl > waterForAmericano){
            alert("Test");
            return;}

        this.waterFullMl = this.waterFullMl - waterForAmericano;
        waterMl.innerText = this.waterFullMl;
        this.coffeFullGr = this.coffeFullGr - coffeForAmericano;
        coffeGr.innerText = this.coffeFullGr;
        dialog.innerText = messageAllOk;
    }     
  /*      else if(coffeFullGr < coffeForAmericano){
        dialog.innerText = messageNoCoffe;
         }
         else if(waterFullMl < waterForAmericano){
            dialog.innerText = messageNoWater;
        }
        else(
            dialog.innerText = "Недостаточно воды и кофе в аппарате."
        )
}
*/
/*кнопка Эспрессо */


 makeEspresso(){
    if(coffeFullGr > coffeForEspresso && waterFullMl > waterForEspresso){
    waterFullMl = waterFullMl - waterForEspresso;
    waterMl.innerText = waterFullMl;
    coffeFullGr = coffeFullGr - coffeForEspresso;
    coffeGr.innerText = coffeFullGr;
    dialog.innerText = messageAllOk;
}     
    else if(coffeFullGr < coffeForEspresso){
    dialog.innerText = messageNoCoffe;
     }
     if(waterFullMl < waterForEspresso){
        dialog.innerText = messageNoWater;
    }
}

/*Кнопка Двойной эспрессо */

 makeWEspresso(){
    if(coffeFullGr > coffeForWEspresso && waterFullMl > waterForWEspresso){
    waterFullMl = waterFullMl - waterForWEspresso;
    waterMl.innerText = waterFullMl;
    coffeFullGr = coffeFullGr - coffeForWEspresso;
    coffeGr.innerText = coffeFullGr;
    dialog.innerText = messageAllOk;
}     
    else if(coffeFullGr < coffeForWEspresso){
    dialog.innerText = messageNoCoffe;
     }
     if(waterFullMl < waterForWEspresso){
        dialog.innerText = messageNoWater;
    }
}
}

let coffeeMachine = new CoffeeMachine(505,);
function makeAmericano(){
    coffeeMachine.makeAmericanoClass;
}

//Test
class Test{
    constructor(text){
        this.text = text;
    } 
     testMehtod(){
         alert(this.text);
     }
}
 let test = new Test("Hello");
 test.testMehtod();

 function btnTest(){
    test.testMehtod();
 }

 