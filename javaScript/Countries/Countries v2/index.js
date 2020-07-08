let countries;

fetch("https://restcountries.eu/rest/v2/all")
.then(res=>  res.json())
.then(data=> initialize(data))
.catch(err =>console.log("Error: ", err));

setTimeout(()=>{
console.log(countries);
console.log(countries[1].capital);
},500);

function initialize(countriesData){
    countries= countriesData;
    console.log(countries[0].name + countries[0].capital);
}


/*let countriesJS = document.getElementById("allCountries");
countriesJS.innerText = countries[0].capital;*/

