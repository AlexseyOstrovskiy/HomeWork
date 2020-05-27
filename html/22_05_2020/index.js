/* DOM (DOCUMENT OBJECT MODEL) */
//getElementById - выбирает элемент(тег) по его идентификиатору (id)
let obj = document.getElementById('test_id');
console.log(obj);
obj.innerText = "New value";
//innerText - это свойство, в котором храниться текст расположенный между 
//открываиающемся и закрывающимся тегом данного элемента
obj.innerHTML ='<a href = "http://www.google.com">Google</a>';

//работа с атрибутами 
obj.onclick = function(){
    alert('Hello');
}


//работа со стилями (css)
obj.style.fontSize = '42px';
obj.style.background = 'yellow';

//Возвращает список элементов по заданному 
// классу (class)
let elems  = document.getElementsByClassName('test');
for(let obj of elems){
    obj.style.color = 'red';   
}

//getElementsByTagName - возвращает список элементов по названию тега
elems = document.getElementsByTagName('div');
//getElementsByName - возвращает список значений по начению атрибута 
//name
elems = document.getElementsByName('some_name');
//querySelector - возвращает одиг (первый ) элемент который удовлетворяет
//заданной выборке (заданному селектору)
document.querySelector('#id >div.block p');

//querySelectorAll - возвращает все элементы удовлетворяющие заданной выборке
//или заданному селектору
document.querySelectorAll('p >div');


////////////////////
let colorInput  = document.getElementById('color');
function changeColor(){
    colorInput.style.color = colorInput.value;
}

function changeInputColor(elem){
    elem.style.color = elem.value;
}

//Динамическое добавление элементов 
//createElement  создает новый элемент по указанному названию тега
let img = document.createElement('img');
img.src = "https://avatars.mds.yandex.net/get-zen_doc/1537151/pub_5cbf10fa88da1e00b5609c75_5cbf119355863600b3c2c731/scale_1200";
img.width = "320";
img.height = "240";
//appendChild - добавляет дочерний элемент в конец списка элементов родителя4

document.body.appendChild(img);
//insertBefore(newElement, prevElement);- добавляет новый элемент перед существующим

//Удаление элементов
//removeChild - удаляет указанный элемент из html
setTimeout(()=>{document.body.removeChild(img);},3000);



/////////////////////
let table = document.getElementsByTagName('table')[0];
let name = document.getElementById('name');
let age = document.getElementById('age');
let email = document.getElementById('email');

function addUser(){
    createTableRecord(name.value, age.value, email.value);
    name.value = '';
    age.value = '';
    email.value = '';   
}

function createTableRecord(name, age, email){
    let tr = document.createElement('tr');
    let tdName = document.createElement('td');
    let tdAge = document.createElement('td');
    let tdEmail = document.createElement('td');
    let tdButton = document.createElement('td');
    tdName.innerText = name;
    tdAge.innerText = age;
    tdEmail.innerText= email;
    let removeBtn = document.createElement('button');
    removeBtn.innerText= 'Удалить запись';
    tdButton.appendChild(removeBtn);
    removeBtn.onclick = function(){
        let index = tr.rowIndex;
        console.log(index);
        removeTableRecord(index);
    }
    tr.appendChild(tdName);
    tr.appendChild(tdEmail);
    tr.appendChild(tdAge);
    tr.appendChild(tdButton);
    table.tBodies[0].appendChild(tr);  
}

function removeTableRecord(index){
    table.deleteRow(index);
}
