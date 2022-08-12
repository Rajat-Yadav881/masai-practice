import { navSection } from "../components/navbar.js";

document.getElementById("navbar").innerHTML = navSection();

let PureData = JSON.parse(localStorage.getItem("leap"));

let append = (PureData)=>{
    let cont = document.getElementById("container")
    cont.innerHTML = null;
    PureData.forEach(({name,course,image,unit,batch},i) => {
        let div = document.createElement("div");
        let nam = document.createElement("h2");
        nam.innerText = name;
        let cours = document.createElement("h4");
        cours.innerHTML = course;
        let img = document.createElement("img");
        img.src = image;
        let unt = document.createElement("p");
        unt.innerText = unit;
        let bach = document.createElement("h3")
        bach.innerText = `FT-WEb${batch}`
        let btn = document.createElement("button")
        btn.innerText = "REMOVE";
        btn.addEventListener("click",()=>{
            remove(i)
        })
        div.append(nam,cours,img,unt,bach,btn);
        cont.append(div)
    });
}
let trash = JSON.parse(localStorage.getItem("deleted"))||[];
let remove = (i)=>{
    let flush = JSON.parse(localStorage.getItem("leap"))||[];
    
    trash.push(flush.splice(i,1));
   
    localStorage.setItem("deleted",JSON.stringify(trash))

    localStorage.setItem("leap",JSON.stringify(flush))
    append(flush);
}
append(PureData);