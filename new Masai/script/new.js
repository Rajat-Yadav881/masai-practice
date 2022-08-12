//https://youtube.googleapis.com/youtube/v3/search?part=snippet&location=IN&maxResults=30&q=&key=AIzaSyBiZgUcAY4GF8N8l50yG1TMiRo03xUVCGw;
const Api_Key = "AIzaSyBiZgUcAY4GF8N8l50yG1TMiRo03xUVCGw";
let q = "";
let search = async ()=>{
    let query = document.getElementById("query").value;
    let data = await getData(query);
    q = query;
    append(data);
};

let getData = async (query)=>{
    let url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=30&q=${query}&key=${Api_Key}`;

    let res = await fetch(url);
    let data = await res.json();
         
    console.log(data);
    return data.items;
};

let append = (data)=>{
    let container = document.getElementById("container");
    container.innerHTML = null;
    data.forEach((elem) => {
        // snippet --> title
        // snippet --> thumbnails --> medium --> url

        let img = document.createElement("img");
        img.src = elem.snippet.thumbnails.medium.url;

        let h3 = document.createElement("h3");
        h3.innerText = elem.snippet.title;

        let div = document.createElement("div");
        div.onclick = ()=>{
            saveVideo(elem);
        };

        div.setAttribute("class","video"); 
        div.append(img,h3);

        container.append(div);
    });    
}

let saveVideo = (data)=>{
    localStorage.setItem("video",JSON.stringify(data));
    window.location.href="video.html"
}

let filter = async ()=>{
    let data = await getData(q);
    data = data.filter((el)=>{
        return el.snippet.channelId === "UCvC4D8onUfXzvjTOM-dBfEA";
    });
    append(data);
}