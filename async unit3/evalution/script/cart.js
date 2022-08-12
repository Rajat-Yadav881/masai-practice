let data = JSON.parse(localStorage.getItem("pool"));

let z = (val)=>{
    return document.createElement(val);
}
let showData = (data)=>{
    let cont=document.getElementById("fr")
    cont.innerHTML=null;
    data.map((el,i)=>{
        let img = z("img")
        img.src = el.image;
        let nam = z("h2")
        nam.innerText = el.name;
        let pric = z("h3")
        pric.innerText = el.price
        let btn2 = document.createElement("button");
        btn2.innerText = "Remove";
        btn2.addEventListener("click",()=>{
            remove(i)
        })
        
        let div = document.createElement("div")
        div.append(img,nam,pric,btn2);
        cont.append(div)
    })
}
showData(data)

function remove(i)
{
    data.splice(i,1);
    localStorage.setItem("pool",JSON.stringify(data))
    showData(data)
}

let wallet = ()=>{
    let data = JSON.parse(localStorage.getItem("pool"))||[];

    let sum = 0;
    data.map((el)=>{
        sum += el.price;
    });
    let amount = 700-sum
    document.getElementById("cartTotal").innerText = amount
}
wallet()
// let indata = ()=>{
//     let cont = document.getElementById("total")
//     cont.innerHTML=null;
  
//     data.forEach((e) => {
//         if(data[e]===undefined){
//             data[e] = 1;
//         }else{
//             data[e]++;
//         }
//         console.log(data)
//     });
// }


