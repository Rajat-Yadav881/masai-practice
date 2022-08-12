import { navSection } from "../components/navbar.js";
document.getElementById("navbar").innerHTML = navSection()
let UserData = JSON.parse(localStorage.getItem("leap"))
let append = (UserData)=>{
    let cont = document.getElementById("container")
    cont.innerHTML = null;
    UserData.forEach(({name,course,image,unit,batch},i) => {
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
        div.append(nam,cours,img,unt,bach);
        cont.append(div)
    });
}
append(UserData)