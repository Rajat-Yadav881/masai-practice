let key = `AIzaSyBiZgUcAY4GF8N8l50yG1TMiRo03xUVCGw`
let mod;
async function dataSection(){
 
    let x = document.getElementById("query").value
    let url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=30&q=${x}&key=${key}`;
    
    let res = await fetch(url)
    let data = await res.json();
    mod = data.items;
    if(data!==undefined){
        append(mod)
    }
   
}
// dataSection()
let append = (mod)=>{
    if(!mod){
        return
    }
    let cont = document.getElementById("flux");
    cont.innerHTML = null;
    mod.forEach((element) => {
        let img = document.createElement("img");
        img.src = element.snippet.thumbnails.medium.url;
        let title = document.createElement("h5");
        title.innerText = element.snippet.title
        let div = document.createElement("div");
        div.setAttribute("class","videoPlay");
        div.onclick=()=>{
            PlayVideo(element);
        }
        div.append(img,title);
        cont.append(div); 
    });
}

let PlayVideo = (mod)=>{

    localStorage.setItem("video",JSON.stringify(mod));
    window.location.href = "video.html";
}

let filter = async()=>{
  
    
    mod = mod.filter((el)=>{
        return el.snippet.publishedAt === "2022-05-24T01:46:47Z";
    })
    append(mod)
}

let channelFilter = async()=>{
  
    mod = mod.filter((el)=>{
        return el.snippet.channelId === "UCvC4D8onUfXzvjTOM-dBfEA"
    })
    append(mod)
}

let id;

function debounce(dataSection,delay){
    if(id){
        clearTimeout(id);
    }
    id = setTimeout(()=>{
        dataSection()
    },delay);
}
let model
async function Section(){
    try{
        
        let url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&chart=mostPopular&maxResults=30&key=${key}`;
        let res = await fetch(url)
        let data = await res.json();
        model = data.items;
        if(data!==undefined){
            show(model)
        }
    }catch(err){"err:",err}
    
   
}
Section()
let show = (model)=>{
    if(!model){
        return;
    }
    let cont = document.getElementById("container");
    cont.innerHTML = null;
    model.forEach((element) => {
        let img = document.createElement("img");
        img.src = element.snippet.thumbnails.medium.url;
        let title = document.createElement("h5");
        title.innerText = element.snippet.title
        let div = document.createElement("div");
        div.setAttribute("class","videoPlay");
        div.onclick=()=>{
            PlayVideo(element);
        }
        div.append(img,title);
       
            cont.append(div)
      
        // cont.append(div); 
    });
}