console.log("***Задача 1***");
//генератор случайного целого числа
function getRAndomInt (min, max){
    min = Math.ceil(min);
    max = Math.floor(max)
    return Math.floor(Math.random() * (max-min +1))+min;
}
 //console.log(getRAndomInt(1, 100));

// создание массива
var myArr = [];
var i;
for (i=0; i < 10; ) {
let arrNum = getRAndomInt(1,100);
myArr.push(arrNum);
i++
}
console.log("Массив из десяти случайных чисел: ")
console.log(myArr);

//Вычисление среднего значения массива
    var sum = 0;
    for(var i =0; i < myArr.length; i++ ){
        sum += myArr[i];
    }
    console.log(sum);

//вычисляем среднее значение
let medium = sum / myArr.length; 
console.log("Среднее значение массива: ")
console.log(medium);

//***************************************************************************

console.log("***Задача 2***");
let valueMemory;
let value1 = prompt('Введите первое целое число');
if(value1 == null){
    alert('Завершение работы программы')
}
else{
let value1int = parseInt(value1);
let value2 = prompt('Введите второе целое число');
if (value2 == null){
    alert('Завершение работы программы');
}
else{
let value2int = parseInt(value2);
let value3 = prompt('Введите третье целое число');
if(value3 == null){
    alert('Завершение работы программы');
}
else{
let value3int = parseInt(value3);

if(value1int > value2int){
    valueMemory = value1int;
}
else{
    valueMemory = value2int;
}

if(value3int > valueMemory){
    valueMemory = value3int;
}

alert('Наибольшее число из введённых ' + valueMemory);
}}}

//******************************************************************************

console.log("***Задача 3***");

function getRAndomInt (min, max){
    min = Math.ceil(min);
    max = Math.floor(max)
    return Math.floor(Math.random() * (max-min +1))+min;
}
let randomNum = getRAndomInt(1,101);
console.log(randomNum);
alert('Игра. Тебе нужно угадать число.');

let userNum = prompt('Введите число от 1 до 100');
if(userNum == null){
    alert('Завершение работы программы');
}
else{
let meter = 1;

if(userNum < 1 || userNum >100){
    alert('Число должно быть в передах 1 -100!')
} 

while(userNum != randomNum){
 if(userNum > randomNum){
     meter++;
     userNum = prompt('Меньше!',0)
}
if(userNum < randomNum){
    meter++;
    userNum = prompt('Больше!',0)
}
}
alert('Поздравляю, Вы угадали! Вам потребовалось ' + meter + ' попыток.' );
}


