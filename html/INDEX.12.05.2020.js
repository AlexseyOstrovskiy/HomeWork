console.log("Hello from js file");
/*
Переменные и константы
Переменные задаются в js  при помощи ключевых слов Let  и var.
Константа задаётся при помощи ключевого слова const.

*/
var a =5;
console.log(a * 5);

const c = 10;
//c = 20; //недопустимо

/*псевдотипы данных
строка : "hello" , 'hello', `hello`
число: 12, 123.25
boolean: true, false
*/
console.log("10" + 2);
var t = 30;
var ts = t + "";
console.log(ts);

/*Массивы
В один массив можно поместить переменные разных типов
var arr = [];
 */
var arr = [10, "hello", true];
console.log(arr[0]); //10
console.log(arr[2]);//true
// в js массивы обладают свойствами коллекции
//добавление элементов в массив
arr.push(78, "JavaScript");
console.log(arr);
/*Коллекция типа MAP */
var map = {
    "454545": "Sidorov",
    "212121": "Ivanov"
};
console.log(map);

//добавление нового элемента в коллекцию
map["585858"] = "Volkov";
console.log(map);
//удаление элемента из коллекции
delete map["212121"];
console.log(map);
/*Условные конструкции
if ....else
switch ... case
 */
if(a > 10){
    console.log("a>10");
}
else{console.log("a<=10");
}
//&& - логическое и
// || -логическое или
// == - сравнение (по значению)
// != - не равно (по значению)
// === - равно (по значению + по типу данных)
// !== - не равно (по значению + по типу данных)
var month= 2;
switch(month){
    case 1:
        console.log("Januare");
        break;
    case 2:
        console.log("February");
        break;
    default:
        console.log("incorrect nmonth");
}

console.log(3 == "3");
console.log(3 === "3");

//переменная, объявленная при помощи ключевого слова let, 
//будет видна только внутри {}, внутри которых 
//она объявлена

if (true){
    var f = 36;
}
console.log(f);

if (true){
    let h = 26;
}
//console.log(h); - h is not defined


/*
Циклы
for(;;)
for ... in (в итерационную переменную записывается индекси элемента. т.е его порядковыйномер)
for ....of (в иттерационную переменную записывается значение элемента)
while
do ...while
*/

for(let i = 0; i <5 ; i++){
    console.log(i);
}

var arr2 =[1, 4, 8, 9];
for(let i in arr2){
    console.log(i);
}

for(let val of arr2){
    console.log(val);
}

/*Функции и лямбда выражения
 */
//объявление функции
 function min(a,b,c,){
     if(a <b && a < c ){
         return a; 
     }
     if(b < c){return b;}
     return c;
 }

console.clear(); // очищает консоль

 let r = min(12,10,25);
 console.log(r);
//необязательные аргументы функции
function average(x,y,z){
   if(x== undefined){
       return 0 ;
   }
   if( y == undefined){
       return x;
   }
   if(z == undefined){
       return(x + y)/2;
   }
   return (x + y + z)/3;
}
console.log(average());
console.log(average(2));
console.log(average(2, 8 ));
console.log(average(2, 8, 5));


//значение аргументов "по умолчанию"
//tips [0;1]
function cheque(sum, tips = 0.15){
    return sum * (1 + tips);
}

console.log(cheque(200, 0.2));
console.log(cheque(100));



















