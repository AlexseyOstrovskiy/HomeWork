/* работа с форматом JSON*/
//преобразование строки (json ) в объект.
let str = `{"name":"Vasya", "age":30}`;
let obj = JSON.parse(str);
obj.name = "Kolya";
console.log(obj);
//преобразование объекта в строку (json).
let cat = {
    color: "black",
    favouriteFood:["milk", "felix", "chicken"],
    name: "Barsik",

    sleep(){
        console.log('z-z-z-z-z-z-z-z');
    }
}
let catStr = JSON.stringify(cat);
console.log(catStr);

/* Асинхронные запросы */
$.ajax( {
    url: 'https://www.google.com',
    method: 'GET',
    data: {},
    succes(resp){
        console.log(resp.data);
     },
    error (err){ 
        console.log(err);
    },
});

//Работа с API национального банка РБ
/*function getRate(curID) {
    return new Promise(function(resolve, reject){
        $.ajax({
            url: 'https://www.nbrb.by/api/exrates/rates/' + curID,
            cuccess(resp){
                resolve(resp);
            },
            error(err){
                reject (err);
            }
        });
    });
}
let usd = document.getElementById("usd");
let eur = document.getElementById("eur");
let rub = document.getElementById("rub");
getRate(145).then((data) => usd.innerText = data.Cur_OfficialRate);
getRate(292).then((data) => eur.innerText = data.Cur_OfficialRate);
getRate(298).then((data) => rub.innerText = `${data.Cur_OfficialRate}(${data.Cur_Scale})`);
*/

function getRate(curID) {
    return new Promise(function (resolve, reject) {
      $.ajax({
        url: 'https://www.nbrb.by/api/exrates/rates/' + curID,
        success(resp) {
          resolve(resp);
        },
        error(err) {
          reject(err);
        }
      });
    });
  }
  let usd = document.getElementById('usd');
  let eur = document.getElementById('eur');
  let rub = document.getElementById('rub');
  
  getRate(145).then((data) => usd.innerText = data.Cur_OfficialRate);
  getRate(292).then((data) => eur.innerText = data.Cur_OfficialRate);
  getRate(298).then((data) => rub.innerText = `${data.Cur_OfficialRate} (${data.Cur_Scale})`);