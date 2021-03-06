/* Реализация ES6 в JavaScript */
// Let, const 
//лямбда выражения (стрелочные функции)
//аргументы со значением по умолчанию
//function some(a, b = 12, c = "hello"){...}
// оператор ...
function test1(a,b,c){
    console.log(a, b, c);
}

let arr = [10, 30, 40];
test1(...arr);// = 10,30,40

function test2(... arr){
    console.log(arr)
}
test2(1,3,54,7,8,54,23,21);//=[1,3,54,7,8,54,23,21]

//упрощение синтексиса при работе с объектами

function createCar(name, color, weight){
    return{
        name, // = name: name
        color,// = color:color
        weight,// = weight:weight
        drive(){}, // = drive: function(){}
        //вычисляемое свойство
        [color + '_color' ]:'test'
    }
}

let car = createCar('BMW', 'red', 1500);
console.log(car);

//восьмиричная и двоичная форма записи числа
let a = 0o23;//8
console.log(a);
let b = 0b0101010;
console.log(b);

//деструктуризация массивов и объектов

function test3(){
    return[1,2,3];
}
let d =test3();
console.log(d);

//деструктуризация массива
let[x,y,z] = test3();
console.log(x,y,z);


function test4(){
    return{
        color:'red',
        name: 'Vasya',
        age: 13
    }
}

//деструктуризация объекта
let {color: a1, age: b1, name: c1} = test4();
console.log(a1,b1,c1);

//ключевое слово super
let parent = {
    say(){
        console.log('hello fromparent');
    }
}
let child = {
say(){
    super.say();
    console.log('hello from child');
}
}

child.__proto__=parent;
child.say();

//форматирование строк
let name = 'Vasya';
let str = `My name is ${name}`;
console.log(str);

//классы
class Animal{

    constructor(age){
        this.age = age;
    }

    setColor(color){
        this.color = color;
    }

    getColor(){
        return this.color;
    }

    static info(){
        console.log('This class is Animal');
    }
}

let animal =new Animal(10);
animal.setColor('yellow');
console.log(animal.getColor());
Animal.info();

//наследование классов

class Dog extends Animal {
    constructor(age, weight){
        //вызов конструктора родителя обязателен в переопределённом конструкторе 
        //потомка
        super(age);
        this.weight = weight;

    }
}
let dog = new Dog(10,30);
console.log(dog);

//typeOf- оператор, который возвращает тип объекта
console.log(typeof Animal);

//итераторы
let arr2 = [10, 20, 30];
//объявим итератор для прохождения по всем элементам массива
//arr2
 let it = arr2[Symbol.iterator]();
console.log(it.next());
console.log(it.next());
console.log(it.next());
console.log(it.next());


//генераторы
//* - нужна для того что бы обозначить функцию в качестве генератора
function* gen(){
let i  = 0;
while(i < 5){
    yield i++;
}
}

//создаём объект - генератор
let g = gen();
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());
console.log(g.next());


// промисы (promise)
let p = new Promise(function(resolve, reject){
    if(false){
        resolve('all ok');
    }else {
        reject('error');
    }
});
p.then(
    //сработает в том случае, если была вызвана функция resolve
    (val)=> console.log(val),
//сработает в том случае, если была вызвана функция reject
    (err) => alert(err)
    );
///////////////////////////////////////////////////
//событийная система    
function startTimer(interval){
setTimeout(() => alert('Time is finished'), interval);


    }


