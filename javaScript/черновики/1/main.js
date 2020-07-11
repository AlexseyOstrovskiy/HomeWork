//функция для динамического создания блоков див для prewiev
function createRed(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '100px';
    div.style.height = '100px';
    div.style.backgroundColor = 'red';
    div.style.margin = '15px';
    return div;
}

//функция для динамического создания блоков див для name
function createGreen(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '100px';
    div.style.height = '30px';
    div.style.backgroundColor = 'green';
    div.style.margin = '15px';
    return div;
}

//функция для динамического создания блоков див для timeVideo
function createYellow(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '50px';
    div.style.height = '30px';
    div.style.backgroundColor = 'yellow';
    div.style.margin = '15px';
    return div;
}

//Массив данных которые будут записываться в динамически созданные Divы
let arr =[];                    //вместо этого массива должен быть массив Data
for(var k =0; k<10; k++){
    arr[k] = k+100;
}

let RED = [];
let GREEN =[];
let YELLOW =[];

//Динамическое создание блоков div
for(var i =0 ; i < 10; i++){
    document.body.appendChild(createRed('red'+i));
    document.body.appendChild(createGreen('green'+i));
    document.body.appendChild(createYellow('yellow'+i));
    }

//Запись значений в динамически созданные блоки
for(var i =0 ; i < 10; i++){

   RED[i] = document.getElementById('red' + i);
   RED[i].innerText = arr[i];

    GREEN[i] =  document.getElementById('green' + i);
    GREEN[i] .innerText = arr[i];

    YELLOW[i] =  document.getElementById('yellow' + i);
    YELLOW[i] .innerText = arr[i];
     }
