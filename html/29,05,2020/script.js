let searchField = document.getElementById("search");

let timerID = 0;


function search(text){
    clearInterval(timerID);//clearInterval - останавливает таймер по его индефикатору
    timerID =  setTimeout(()=>{
    sendRequest(text);
    },500);
}

function sendRequest(text){
    console.log(`request: ${text} sended`);

}

nodeJs.org //- скачать