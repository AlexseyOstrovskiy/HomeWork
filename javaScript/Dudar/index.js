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

let graffCoffe =  document.getElementById("graffCoffe");//для графф.колич.коффе
graffCoffe.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"

let graffWater =  document.getElementById("graffWater");//для графф.колич.воды
graffWater.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"

/*Кнопка Американо */
class CoffeeMachine{

    /* Метод граффика коффе*/
    paintGraffCoffe(){
    if(coffeFullGr > 400){
       graffCoffe.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"
   }
   else if(coffeFullGr >300 && coffeFullGr < 400){
       graffCoffe.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9898;"
   }
   else if(coffeFullGr >200 && coffeFullGr <300){
       graffCoffe.innerHTML = "&#9899;&#9899;&#9899;&#9898;&#9898;"
   }
   else if (coffeFullGr > 100 && coffeFullGr < 200){
       graffCoffe.innerHTML = "&#9899;&#9899;&#9898;&#9898;&#9898;"
   }
   else if( coffeFullGr > 30 && coffeFullGr < 100){
       graffCoffe.innerHTML = "&#9899;&#9898;&#9898;&#9898;&#9898;"}
       else if(coffeFullGr < 30){
           graffCoffe.innerHTML = "&#9898;&#9898;&#9898;&#9898;&#9898;"
       }
   }
/* конец Метод граффика коффе*/

/* Метод граффика воды*/
paintGraffWater(){
    if(waterFullMl > 800){
        graffWater.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"
   }
   else if(waterFullMl >600 && waterFullMl < 800){
    graffWater.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9898;"
   }
   else if(waterFullMl >400 && waterFullMl <600){
    graffWater.innerHTML = "&#9899;&#9899;&#9899;&#9898;&#9898;"
   }
   else if (waterFullMl > 200 && waterFullMl < 400){
    graffWater.innerHTML = "&#9899;&#9899;&#9898;&#9898;&#9898;"
   }
   else if( waterFullMl > 90 && waterFullMl < 200){
    graffWater.innerHTML = "&#9899;&#9898;&#9898;&#9898;&#9898;"}
       else if(waterFullMl < 90){
        graffWater.innerHTML = "&#9898;&#9898;&#9898;&#9898;&#9898;"
       }
   }
/* конец Метод граффика воды*/



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

        this.paintGraffCoffe();      
        this.paintGraffWater(); 
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

    this.paintGraffCoffe();
    this.paintGraffWater();
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

    this.paintGraffCoffe();
    this.paintGraffWater();
}

/*Заполнить бак с водой */
fillTankWaterClass(){
    if(waterFullMl < this.waterFullMlValue){
        waterFullMl = this.waterFullMlValue;
        waterMl.innerText = waterFullMl;
        dialog.innerText = messageFillWater;
        graffWater.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"
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
        graffCoffe.innerHTML = "&#9899;&#9899;&#9899;&#9899;&#9899;"
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




 