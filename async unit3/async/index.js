let storeImage = ()=>{
   
    let url = document.getElementById("text").value;

    let images = JSON.parse(localStorage.getItem("images"))||[];

    images.push(url);

    localStorage.setItem("images",JSON.stringify(images))

    let x = document.querySelector("input")
    x.forEach((el)=>{
        el.value===null
    })
}
