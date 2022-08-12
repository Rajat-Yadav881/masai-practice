let counter=0;
let id;
let start = ()=>{
    let delay = document.getElementById("timer").value;
    
    let images = JSON.parse(localStorage.getItem("images"))
    if(images===null){
        alert("sorry Images are not excess to show")
    }else{       
        let cont = document.getElementById("container")
        cont.innerHTML = null;
        let img = document.createElement("img")
        img.src = images[counter]
        cont.append(img)
        let x = delay*1000
        id = setInterval(function(){
            if(counter===images.length){
                counter=0;
            }
            img.src = images[counter]
            cont.append(img)
            counter++;
            console.table("counter:",counter)
        },x)
    }
}
let end =()=>{
    let images = JSON.parse(localStorage.getItem("images"))
    console.log("paused:",counter)

    clearInterval(id)
    if(images[counter]){
        let v = document.getElementById("fav_img")
        v.innerHTML=null
        let img = document.createElement("img")
        img.src = images[counter]
        v.append(img)
    }
    id = null;
    
}
document.getElementById("start").addEventListener("click",start)
document.getElementById("pause").addEventListener("click",end)

