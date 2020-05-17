/*Лямбда выражения */

// sum -это переменная, содержащая определение функции
var sum = function(a, b){
    return a+ b ;
}

let s = sum (1,3);
console.log(s);


//пример использования неименнованной функции
setTimeout(
    function(){
        console.log("hello");
    }, 2000
);

//Общий вид лямбда выражения
let div = (a, b) =>{
    return a/b;
} 
let d = div (10,4);
console.log(d);

//если лямбда выражение состоит из единственного действия то {} 
// и ключевое слово return  можно опустить 

let mul = (a, b ) => a*b;
let m = mul(-1, -7);
console.log(m);

//пример использования неименнованного ляьбда выражения
setTimeout(()=> console.log("lambda"), 2500 );


//ООП 
//инкапсуляция (+ свойства, + методы, - модификаторы доступа)
//полиморфизм (-) 
//наследование (+- наследование реализуется через прототипирование )

// создание объекта (без шаблона)

let cat = {
    //свойства
    age: 3,
    color: "black",
    //методы
    say: function(){
        console.log("meow");
    },

    eat: (food) => console.log('cat eats ' + food)
};

console.log(cat.age);
cat.color = "red";
console.log(cat);
cat.say();
cat.eat("Wiskass");

//протитипирование (наследование)
let cat2 = {
    name : "Barsik",

    sleep : function(){
        console.log("z -z -z ");
    }}

cat2.__proto__ = cat;
//cat выступает в качестве родительского объекта для 
// объекта cat2
cat2.sleep();
cat2.eat("meat");
/* поскольку метода eat нее в объекте cat2, то js  
будет искать его реализацию во всех объектах,
которые заданы через свойство __proto__  */

//создание объекта в динамической памяти
//любая функция в js может распологаться в динамической области памяти
function Dog(name, age){
    //функция Dog будет выполнять роль конструктора объекта
    this.name = name;
    this.age = age;
    //в случак, если через this происходит обращение 
    //к несуществующему полю объекта
    // то это поле будет создано автоматитчески для данного обекта
    this.say = function(){
        console.log('haw');

    }
    this.info = function(){
        console.log("name : " + this.name + ", age : " + this.age);
    }
}
//созданиединамического объекта на основе функции
let dog1 = new Dog("Bim", 4 );
dog1.say();
dog1.info();

let dog2 = new Dog ("Raks", 6);
dog2.info();

// объект, созданный наоснове функции может обладать прототипом
dog2.__proto__=cat;


//this и лямбда выражения
function Test(){
    this.value = "test value";

    this.run = function(){
        setTimeout(function(){
            this.value = "new value"
        }, 3000)
    }
  //у лямбда выражений нет ключевого слова this.
  //в случае использования this  внутри лямбда выражения, 
  //js  будет искать ближайший по вложенности объект у кторого присутствует this
    this.runWithLambda = function(){
        setTimeout(() =>{
            this.value = "new value"
        }, 3000)
    }
}

let test = new Test();
test.run;
//делаем задержку в 3,5 секунды что бы функция run()
//успела завершиться
setTimeout(function(){console.log(test.value);test.runWithLambda();
    setTimeout(function(){console.log(test.value)}, 3500);  }, 3500);  

    /*Диалоговые окна в Браузере 
    alert, prompt, confirm
    alert - показывает всплывающее сообщение
    */
   alert("Hello user");
   //prompt - запрашивает у пользователя ввод данных
let answer = prompt("Сколько вам лет?"); // 2 аргумент - значение по умолчанию
//преобразование строки в число 
//parseInt-  преобразует строку в целочисленное значение
//parseFloat - преобразует строку в вещественное значение
answer = parseInt(answer);
console.log(answer);

//confirm - запрашивает у пользователя подтверждения действия
let action = confirm("Все ваши данные будут удалены.Продолжить?")
console.log(action);




