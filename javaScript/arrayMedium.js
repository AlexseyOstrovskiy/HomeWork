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

console.log("***Задача 2***");
var value1 = prompt('Введите первое целое число');
var value2 = prompt('Введите второе целое число');
var value3 = prompt('Введите третье целое число');

if(value1 > value2 && value1 >value3){
    alert('Наибольшее число из введённых ' + value1);
}

else if(value2 > value1 && value2 >value3){
    alert('Наибольшее число из введённых ' + value2);
}

//if(value3 > value2 && value3 >value1){
  else(alert('Наибольшее число из введённых ' + value3));
//}

if(value1 == value2 & value2 == value3){
    alert('Все введённые числа равны между собой.')
};

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
let meter = 0;

if(userNum < 1 || userNum >100){
    alert('Число должно быть в передах 1 -100!')
} 

if(userNum == randomNum){
    alert('Поздравляю! вы угадали!')
}

//if(userNum !=0){
while(userNum != randomNum){
 if(userNum > randomNum){
     meter++;
     userNum = prompt('Меньше!',0)
    //alert('Меньше.')

}


if(userNum < randomNum){
    meter++;
    userNum = prompt('Больше!',0)
    //alert('Больше')
}

//if(userNum == 0){
  //  alert('Введите число от 1 до 100!');
//}

}
alert('Поздравляю, Вы угадали! Вам потребовалось ' + meter + 'попыток.' )
//}
//else(
    //alert('Вы ничего не ввели!')
