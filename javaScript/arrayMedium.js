console.log("***Задача 1***");
//генератор случайного целого числа
function getRAndomInt (min, max){
    min = Math.ceil(min);
    max = Math.floor(max)
    return Math.floor(Math.random() * (max-min +1))+min;
}
 console.log(getRAndomInt(1, 100));

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

console.log("***Задача 2***");
var value1 = prompt('Введите первое целое число');
var value2 = prompt('Введите второе целое число');
var value3 = prompt('Введите третье целое число');

if(value1 > value2 & value1 >value3){
    alert('Наибольшее число из введённых ' + value1);
}

if(value2 > value1 & value2 >value3){
    alert('Наибольшее число из введённых ' + value2);
}

if(value3 > value2 & value3 >value1){
    alert('Наибольшее число из введённых ' + value3);
}


