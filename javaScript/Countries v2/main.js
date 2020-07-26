
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
    cardHolder.style.display = "none";

    let x;
    for(let i = 0; i <arr.length; i++){
        if(arr[i].name == search){
        x = i;
        }
    }
    
    let arr2 = [];
            const requestURL2 = 'https://restcountries.eu/rest/v2/name/' + search;
            function sendRequest2(){   
                return new Promise((resolve, reject)=>{
            const xhr = new XMLHttpRequest();
            xhr.open('GET', requestURL2)
            xhr.onload = () =>{
                //console.log(JSON.parse(xhr.response))
                arr2 = JSON.parse(xhr.response);
            }
            xhr.onerror=()=>{
                console.log(xhr.response)
            }
            xhr.send()
            })
            }

            sendRequest2('GET', requestURL2)
            .then(data=> console.log(data)) 
            .catch(err => console.log(err))

            let NAMES;
            let POPULATIONS;
            let FLAGS;
            
    setTimeout(
        ()=>{   
            NAMES = document.getElementById('nameSW');
            NAMES.innerText = arr2[0].name;

            POPULATIONS = document.getElementById('populationSW');
            POPULATIONS.innerText = "Население = " + arr2[0].population + "человек.";
            
            FLAGS = document.getElementById('img');
            FLAGS.src = arr2[0].flag;

            secondWindow.style.display ="block"; 
        },
         300);

         

}