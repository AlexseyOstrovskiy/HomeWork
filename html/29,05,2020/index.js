/*Массивы */
var arr = [1, 2, 3];

//добавление элемента(-ов) в конец массива
arr.push(4, 5);
console.log(arr);
//удаление последнего элемента массива
let deletedElem = arr.pop();
console.log(deletedElem, arr);
//добавление элемента (-ов) в начало массива.
arr.unshift(-1, 0);
console.log(arr);

//добавление первого элемента массива
let first = arr.shift();
console.log(first, arr);

//получение индекса элемента по его значению
let index = arr.indexOf(3); // 3 -значение искомого элемента
console.log(index);
//в случае если искомый элемент не найден то метод indexOff - вернёт значение = -1
console.log(arr.indexOf(10));
//удаление элемента(-ов) по индексу.
arr.splice(2, 1);// 2 - это индекс элемента, начиная с которого
// необходимо начать удаление
// 1- количество элементов которое необходимо удалить
console.log(arr);
//удаление элемента по значению
let value  = 4;
let i = arr.indexOf(value);
arr.splice(i, 1);
console.log(arr);
//создание копии массива
let arrCopy = arr.slice();//копируется весь массив
let arrPartialCopy = arr.slice(1,3);//1- индекс элемента с которого начинается копирование
//3- количество элементов которое необходимо кскопировать
console.log(arrCopy, arrPartialCopy);
//forEach - перебирает все элементы массива.
arr.forEach(function(item, i, arr){
    //item - значение текущего элемента массива
    //i -индекс текущего элемента массива
    //arr - оригинальный массив
    console.log(item);
});
//filter - фильтрует массив по заданному критерию
arr.push(7,4);
let filteredArr = arr.filter((item)=> item % 2 != 0);//данный фильтр для нечетных значений
console.log(filteredArr);

//map - преобразует массив в соответствии с заданным критерием.
let squaredArr = arr.map((item)=>item * item );
console.log(squaredArr);

//every - возвращает true, если все элементы массива соответствуюют заданному критерию
let isSqaure = (item)=> {
   let sq =  Math.sqrt(item);
    return sq == Math.trunc(sq); //trunc удаляет дробную часть
}
 let res = arr.every(isSqaure);
 console.log(res);
 console.log([1, 49, 81, 256, 10000].every(isSqaure))

 //some - возвращает true,  если хотя бы один из элементов массива соответствует заданному критерию
 console.log(arr.some(isSqaure));

 //reduce - вщзвращает результат, полученный в ходе 
 //обхода массива с лева на право с сохранением промежуточного 
 //результата вычисления
 let result = arr.reduce((prevValue, item, i, arr)=>{
     //prevValue - результат последнего вызова функции callback
     //при первом срабатывании функции callback, 
     //prevValue = initialValue = 0
    //если initialValue не указан, то prevValue =значению првого элемента массива [индекс 0]
     return item + prevValue;
 }, 0);

console.log(result);

//reduceRight- то же что и reduce, но обход начинается с конца или с права на лево
 //если initialValue не указаноб то prevValue = значению последнего элемента массива

 //reverse - изменяет порядок следования массива на противоположный
 arr.reverse();
 console.log(arr);

 //sort - сортирует массив по заданному критерию
 arr.sort((x,y)=>{
//x,y значение элементов массива которые в данный момент
//подвергаются сравнению
//return =0 => x==y
//return >0 => y станет по индексу раньше
//return <0 => x станет по индексу раньше y 
return y - x; // по убываию
 })
 console.log(arr);

 //session и localstorage
 //localStorage.setItem("KEY","JavaScript");
 //sessionStorage.setItem("KEY","JavaScript");

 let local = localStorage.getItem("KEY");
 console.log("local:", local);
 let session = sessionStorage.getItem("KEY");
 console.log("session:", session);