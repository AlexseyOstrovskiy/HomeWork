
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

/*function flagImg(id){
    var img =document.createElement("img");
    img.id = id;
    img.style.width  = '240px';
    img.style.height = '100px';
}
*/

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
    //document.body.appendChild(mainCard('card' +i));
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
 3000);

 //input
let btn;
btn = document.getElementById('btn');
let search;
btn.onclick = function(){
    search = document.getElementById('inputID').value;
    alert(search);
    cardHolder.style.display = "none";
/*
    let x;
    for(let i = 0; i <arr.length; i++){
        if(arr[i].name = search){
        x = i;
        }
    }
    */
   // console.log(arr[x].name + arr[x].population + arr[x].flag);

/*
    let NAME1;
    let POPULATION1;
    let FLAG1;
    let FLAG_FLAG1;

document.body.appendChild(mainCard('card'));
document.getElementById("card").appendChild(name('name'));
document.getElementById("card").appendChild(flag('flag'));
document.getElementById("card").appendChild(population('population'));

NAME1 = document.getElementById('name');
NAME1.innerText = arr[x].name;

POPULATION1 = document.getElementById('population');
POPULATION1.innerText = "Население = " + arr[x].population + "человек.";


FLAG1 = document.getElementById('flag');
FLAG_FLAG1 = document.createElement("img");

FLAG_FLAG1.src = arr[x].flag;
FLAG_FLAG1.height = 100;
FLAG_FLAG1.width = 240;
FLAG1.appendChild(FLAG_FLAG1);
   */
  
   function getCountry(countryName) {
    return new Promise((resolve,reject) => {
        $.ajax({
               url: 'https://restcountries.eu/rest/v2/name/' + countryName,
           success(data) {
               resolve(data);
           },
           error(err) {
               reject(err);
           }
       });   
   });
} 

    //requestURL2 = 'https://restcountries.eu/rest/v2/name/' + a
    //sendRequest('GET', requestURL2)
    //return a;
 }
 

//let b = btn.onclick -5;
//console.log(b);
//alert(b);

/*console.log("*****************");

let arr2 = [];
const requestURL3 = 'https://restcountries.eu/rest/v2/currency/cop'
function sendRequest(){   
    return new Promise((resolve, reject)=>{
const xhr = new XMLHttpRequest();
xhr.open('GET', requestURL3)
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


console.log("*****************");
*/