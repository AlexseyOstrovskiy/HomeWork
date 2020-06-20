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
let messageNoCoffe = "Для приготовления напитка недостаточно коффе в баке.";
let messageAllOk = "Ваш напиток готов";
let messageFillWater = "Бак с водой заполнен";
let messageNoFillWater = "Бак с водой уже/ещё полный!";
let messageFillCoffe = "Бак с коффе заполнен";
let messageNoFillCoffe = "Бак с коффе уже/ещё полный!";
dialog.innerText = messageHi;

/*Кнопка Американо */
class CoffeeMachine{
    constructor (coffeForAmericano, waterForAmericano, 
                coffeForEspresso, waterForEspresso,
                coffeForWEspresso, waterForWEspresso,
                coffeFullGrValue, waterFullMlValue
                // coffeFullGr, waterFullMl
               ){
                    this.coffeForAmericano = coffeForAmericano;
                     this.waterForAmericano = waterForAmericano;
                    this.coffeForEspresso = coffeForEspresso;
                    this.waterForEspresso = waterForEspresso;
                    this.coffeForWEspresso = coffeForWEspresso;
                    this.waterForWEspresso = waterForWEspresso;
                    this.coffeFullGrValue = coffeFullGrValue;
                    this.waterFullMlValue = waterFullMlValue
                    //this.coffeFullGr = coffeFullGr;
                    //this.waterFullMl = waterFullMl;
                }

    

 makeAmericanoClass(){
        if(coffeFullGr > coffeForAmericano && waterFullMl > waterForAmericano){
           // alert("Test");
            //return;}
        waterFullMl = waterFullMl - this.waterForAmericano;
        waterMl.innerText = waterFullMl;
        coffeFullGr = coffeFullGr - this.coffeForAmericano;
        coffeGr.innerText = coffeFullGr;
        dialog.innerText = messageAllOk;
    }    
        else if(coffeFullGr < coffeForAmericano){
        dialog.innerText = messageNoCoffe;
         }
         else if(waterFullMl < waterForAmericano){
            dialog.innerText = messageNoWater;
        }
        else(
            dialog.innerText = "Недостаточно воды и кофе в аппарате."
        )
}

/*кнопка Эспрессо */
 makeEspressoClass(){
    if(coffeFullGr > coffeForEspresso && waterFullMl > waterForEspresso){
    waterFullMl = waterFullMl - this.waterForEspresso;
    waterMl.innerText = waterFullMl;
    coffeFullGr = coffeFullGr - this.coffeForEspresso;
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

 makeWEspressoClass(){
    if(coffeFullGr > coffeForWEspresso && waterFullMl > waterForWEspresso){
    waterFullMl = waterFullMl - this.waterForWEspresso;
    waterMl.innerText = waterFullMl;
    coffeFullGr = coffeFullGr - this.coffeForWEspresso;
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

/*Заполнить бак с водой */
fillTankWaterClass(){
    if(waterFullMl < this.waterFullMlValue){
        waterFullMl = this.waterFullMlValue;
        waterMl.innerText = waterFullMl;
        dialog.innerText = messageFillWater;
    }
    else{
        dialog.innerText = messageNoFillWater;
    }
}

/*Заполнить бак с коффе */
fillTankCoffeClass(){
    if(coffeFullGr < this.coffeFullGrValue){
        coffeFullGr = this.coffeFullGrValue;
        coffeGr.innerText = coffeFullGr;
        dialog.innerText = messageFillCoffe;
    }
    else{
        dialog.innerText = messageNoFillCoffe;
    }
}
}


/*Переменные */
coffeForEspresso =40 ;
waterForEspresso = 185;
coffeForWEspresso =50 ;
waterForWEspresso = 240;
coffeForAmericano = 30;
 waterForAmericano = 90;
 coffeFullGrValue = 500;//Объём бака с коффе
 waterFullMlValue = 1000;//Объём бака с водой


 /*Объект класса коффемашина */
let coffeeMachine = new CoffeeMachine(
                coffeForAmericano, waterForAmericano, 
                coffeForEspresso, waterForEspresso,
                coffeForWEspresso, waterForWEspresso,
                coffeFullGrValue, waterFullMlValue
);

/* Функции привязанные к кнопкам с напитками*/
function makeAmericano(){
    coffeeMachine.makeAmericanoClass();
}

function makeEspresso(){
    coffeeMachine.makeEspressoClass();
}

function makeWEspresso(){
    coffeeMachine.makeWEspressoClass();
}

function fillTankWater(){
    coffeeMachine.fillTankWaterClass();
}

function fillTankCoffe(){
    coffeeMachine.fillTankCoffeClass();
}




/*
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
*/
 