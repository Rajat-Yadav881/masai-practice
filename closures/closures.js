//a closure gives you access to an outer function's scope from an inner function.
// function sum(){
//     let a = 25;
//     return function(){
//         console.log(a);
//     }
// }
// let x = sum();
// x();//due to closures
//http://www.omdbapi.com/?apikey=fd6322f2&s=superman
//debouncing

async function main(){
    let query = document.getElementById("query").value;
    let data = await getData(query);
    append(data);
    console.log(data);
}
//no matter what,async function function will always return promise.
async function getData(query){
    const url = `http://www.omdbapi.com/?apikey=fd6322f2&s=${query}`;
    let res = await fetch(url);
    let data = await res.json();
    // console.log(data);
    // append(data.Search);
    return data.Search
}

function append(data){
    if(!data){
        return;
    }
    let container = document.getElementById("movies");
    container.innerHTML = null;
    data.forEach(function(el) {
        let img = document.createElement("img");
        img.src = el.Poster;
        let p = document.createElement("h1");
        p.innerText = el.Title;
        let div = document.createElement("div");
        div.setAttribute("class","movie");
        div.append(img,p);
        container.append(div);
    });
}

let id;
function debounce(func,delay){
    if(id){
        clearTimeout(id);
    }
    id = setTimeout(function(){
        func();
    },delay);
}
//explain closures and debouncing
