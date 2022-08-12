document.querySelector("#winner").addEventListener("click",deep);
let x;
let y;
let z;

function deep(event){
    event.preventDefault()
    x = Math.floor(Math.random()*6)+1;
    y = Math.floor(Math.random()*6)+1;
    z = Math.floor(Math.random()*6)+1;

   document.getElementById("member-1").innerHTML= x;
   document.getElementById("member-2").innerHTML= y;
   document.getElementById("member-3").innerHTML= z;

   let a = document.querySelector("#A");
   let b = document.querySelector("#B");
   let c = document.querySelector("#C");

   if(x===y && y===z && x===z){
    a.style.backgroundColor="blue";
    b.style.backgroundColor="blue";
    c.style.backgroundColor="blue";
   }else if(x>y && x>z){
    a.style.backgroundColor="green";
    if(y>z){
        b.style.backgroundColor="yellow";
        c.style.backgroundColor="red";
    }else if(z>y){
       c.style.backgroundColor="yellow";
       b.style.backgroundColor="red"; 
    }else{
        b.style.backgroundColor="blue";
        c.style.backgroundColor="blue";
    }
   }else if(y>z && y>x){
    b.style.backgroundColor="green";
    if(z>x){
        c.style.backgroundColor="yellow";
        a.style.backgroundColor="red";
    }else if(x>z){
        a.style.backgroundColor="yellow";
        c.style.backgroundColor="red";
    }else{
        a.style.backgroundColor="blue";
        c.style.backgroundColor="blue";
    }
   }else if(z>x && z>y){
        c.style.backgroundColor="green";
        if(x>y){
            a.style.backgroundColor="yellow";
            b.style.backgroundColor="red";
        }else if(y>x){
            b.style.backgroundColor="yellow";
            a.style.backgroundColor="red";
        }else{
            a.style.backgroundColor="blue";
            b.style.backgroundColor="blue";
        }
   }

}
