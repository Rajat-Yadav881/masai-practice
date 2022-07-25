const API_key = "AIzaSyBiZgUcAY4GF8N8l50yG1TMiRo03xUVCGw"
// const url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&key=${}`

let q="";

let search = async ()=>{
    let query = document.getElementById("query").value;
    let data = await getData(query);
    q=query;
    append(data);
};



let getData = async (query)=>{

    let url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}&key=${API_key}`;

   let response = await  fetch(url)
   
   let data = await response.json();
   
   return data.items
};

let append=(data)=>{
    let container = document.getElementById("container");
    container.innerHTML = null;
    data.forEach((el) => {

        let img = document.createElement("img");
        img.src = el.snippet.thumbnails.medium.url; 

        let h3 = document.createElement("h3");
        h3.innerText = el.snippet.title;

        let div = document.createElement("div");
        div.onclick = ()=>{
            saveVideo(el);
        }
        div.setAttribute("class","video")
        

        div.append(img,h3);

        container.append(div);
    });
};

let saveVideo = (data)=>{
    localStorage.setItem("video",JSON.stringify(data));
    window.location.href="video.html";
};
// let sort =async ()=>{
//     let data = await getData(query);
//     data.sort((a,b)=>{
//         return a.snippet.title-b.snippet.title; 
//     });
//     append(data);
// }

let filter = async()=>{
    let data = await getData(q);
    data = data.filter((el)=>{
        return el.snippet.channelId === "UCvC4D8onUfXzvjTOM-dBfEA";
    });
    append(data)
}
