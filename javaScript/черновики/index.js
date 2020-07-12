let modWindow = document.getElementById('modWindow');
let btn = document.getElementById('button');
let btnClose = document.querySelector('.close');


btn.onclick=function(){
    modWindow.style.display ="block";
}

btnClose.onclick = function(){
    modWindow.style.display ="none";
}

window.onclick = function(e){
    if(e.target == modWindow){
        modWindow.style.display ="none";
    }
}

/*<video>
        <source src="">
    </video> */