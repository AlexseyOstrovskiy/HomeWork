
let arr = [];
const requestURL = 'https://restcountries.eu/rest/v2/all'
function sendRequest(){   
    return new Promise((resolve, reject)=>{
const xhr = new XMLHttpRequest();
xhr.open('GET', requestURL)
xhr.onload = () =>{
    console.log(JSON.parse(xhr.response))
    arr = JSON.parse(xhr.response);
}
xhr.onerror=()=>{
    console.log(xhr.response)
}
xhr.send()
})
}

sendRequest('GET', requestURL)
.then(data=> console.log(data)) 
.catch(err => console.log(err))



function mainCard(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '300px';
    div.style.height = '180px';
    div.style.backgroundColor = 'green';
    div.style.margin = '15px';
    div.style.display = 'flex';
    div.style.flexDirection = 'column';
   div.style.alignItems = 'center';
    return div;
}

function name(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '300px';
    div.style.height = '25px';
    div.style.backgroundColor = 'gray';
    div.style.margin = '3px';
    return div;
}

function flag(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '240px';
    div.style.height = '100px';
    div.style.backgroundColor = 'pink';
   div.style.margin = '3px' ; 
    return div;
}

function population(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '300px';
    div.style.height = '25px';
    div.style.backgroundColor = 'red';
   div.style.margin = '3px' ; 
    return div;
}


let NAME = [];
let POPULATION = [];
let FLAG = [];
let FLAG_FLAG = [];

setTimeout(
    ()=>{
for(let i = 0; i <arr.length; i++){
    document.getElementById("cardHolder").appendChild(mainCard('card' +i));
}

for(let i = 0; i <arr.length; i++){
document.getElementById("card"+i).appendChild(name('name' + i));
document.getElementById("card"+i).appendChild(flag('flag' + i));
document.getElementById("card"+i).appendChild(population('population' + i));
}

for(let i = 0; i <arr.length; i++){
NAME[i] = document.getElementById('name' + i);
NAME[i].innerText = arr[i].name;

POPULATION[i] = document.getElementById('population' + i);
POPULATION[i].innerText = "Население = " + arr[i].population + "человек.";


FLAG[i] = document.getElementById('flag' + i);
FLAG_FLAG[i] = document.createElement("img");

FLAG_FLAG[i].src = arr[i].flag;
FLAG_FLAG[i].height = 100;
FLAG_FLAG[i].width = 240;
FLAG[i].appendChild(FLAG_FLAG[i]);

}
},
 100);

 //input
let btn;
btn = document.getElementById('btn');
let search;
btn.onclick = function(){
    search = document.getElementById('inputID').value;
    alert(search);
    cardHolder.style.display = "none";

    let x;
    for(let i = 0; i <arr.length; i++){
        if(arr[i].name == search){
        x = i;
        }
    }

    let NAMES;
    let POPULATIONS;
    let FLAGS;
    let FLAG_FLAGS;

    document.getElementById("secondWindow").appendChild(mainCard('cardS'));
    document.getElementById("cardS").appendChild(name('nameS'));
    document.getElementById("cardS").appendChild(flag('flagS'));
    document.getElementById("cardS").appendChild(population('populationS'));
    
    NAMES = document.getElementById('nameS');
    NAMES.innerText = arr[x].name;

    POPULATIONS = document.getElementById('populationS');
    POPULATIONS.innerText = "Население = " + arr[x].population + "человек.";


    FLAGS = document.getElementById('flagS');
    FLAG_FLAGS = document.createElement("img");

    FLAG_FLAGS.src = arr[x].flag;
    FLAG_FLAGS.height = 100;
    FLAG_FLAGS.width = 240;
    FLAGS.appendChild(FLAG_FLAGS);

    secondWindow.style.display ="block";
    console.log(arr[x].name + arr[x].population + arr[x].flag)


}