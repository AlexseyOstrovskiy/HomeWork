let btn;
btn = document.getElementById('btn');
let a;
 btn.onclick = function(){
     a = document.getElementById('inputID'.value)
    // alert(document.getElementById('inputID').value)
    return a;
 }

 let b = btn.onclick -5;
 console.log(b);
 alert(b);

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

console.log(getCountry(Albania));