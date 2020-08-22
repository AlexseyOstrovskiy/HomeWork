let btn;
btn = document.getElementById('btn');
let inp1;
let inp2;
let inp3;
let sum;
let inp4
btn.onclick = function(){
   inp1 = document.getElementById('inp1').value;
   inp2 = document.getElementById('inp2').value;
   inp3 = document.getElementById('inp3').value;
   
   alert(inp1 +" "+ inp2 +" "+inp3);
   sum = Number(inp1) + Number(inp2) + Number(inp3);
   document.getElementById('inp4').value = sum;


}