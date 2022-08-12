let fluidData;

let getData =async ()=>{
    try{
        let url = `https://grocery-masai.herokuapp.com/items`;
        let res = await fetch(url)
        let data = await res.json();
        console.log("data:",data.data)
        fluidData = data.data
        append(fluidData)

    }catch(err){
        console.log("err:",err)
    }
    

}
getData()
let z = (val)=>{
    return document.createElement(val);
}
let append = (fluidData)=>{
    if(!fluidData){
        return
    }
    let cont = document.getElementById("container");
    cont.innerHTML = null;
    let sum =0;
    fluidData.forEach(({image,name,price,updatedAt}) => {
       let el = {image,name,price,updatedAt}
        let img = z("img")
        img.src = image;
        let nam = z("h2")
        nam.innerText = name;
        let pric = z("h3")
        pric.innerText = price
        let updated = z("p")
        updated.innerText = updatedAt
        let btn = document.createElement("button")
        btn.innerText = "add to cart";
        btn.addEventListener("click",()=>{
            flusk(el,sum)
        })
        let div = document.createElement("div")
        div.append(img,nam,pric,updated,btn);
        cont.append(div)
    });
}

let flusk = (el,sum)=>{
    
    sum += el.price
    console.log(sum)
    if(sum<700){
        let gg = JSON.parse(localStorage.getItem("pool"))||[];
    
        gg.push(el);
        localStorage.setItem("pool",JSON.stringify(gg))
    }else{
        alert("wait guy no money")
    }
    wallet();
}
wallet();
function wallet()
{
    let gg = JSON.parse(localStorage.getItem("pool"))||[];

    let sum = 0;
    gg.forEach((el)=>{
        sum += el.price
    });
    
    let amount = 700-sum;
    // if(amount<0){
    //     alert("insufficent balance")
    // }else{
        document.getElementById("wallet").innerText=amount;
    // }
}
