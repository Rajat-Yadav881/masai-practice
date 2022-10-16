let lecData = JSON.parse(localStorage.getItem("bost"))
let append = (lecData)=>{
    let cont = document.getElementById("cont")
    cont.innerHTML = null;
    lecData.map((el,i)=>{
        let div = document.createElement("div")
        let top = document.createElement("h3")
        top.innerText = el.topic
        let date = document.createElement("h3")
        date.innerText = el.date
        let btn = document.createElement("button")
        btn.innerText = "Remove"
        btn.addEventListener("click",()=>{
            remove(i)
        })
        div.append(top,date,btn);
        cont.append(div)

    })
}

function remove(i){
    let gsum = JSON.parse(localStorage.getItem("bost"))
    gsum.splice(i,1)
    localStorage.setItem("bost",JSON.stringify(gsum))
    append(gsum)
}
append(lecData)