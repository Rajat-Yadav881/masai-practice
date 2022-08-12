//8d7004ad8ced57e9c56ada80bbddfd99
//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
let data;
let mapper = document.getElementById("gmap_canvas")
let getWeather = async()=>{
    let city = document.getElementById("city").value;
    data = await getData(city)
    console.log("data:",data)
    append(data)
}
let key = "8d7004ad8ced57e9c56ada80bbddfd99"
let getData = async(city)=>{
    try{
        let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${key}&units=metric`
        let res = await fetch(url)
        let data = await res.json()
        return data
    }catch(err){
        console.log("err:",err)
    }    
}
let cont = document.getElementById("container")
function append(data){
    // let url = `https://api.openweathermap.org/data/2.5/weather?q=${data.name}&appid=8d7004ad8ced57e9c56ada80bbddfd99`;
    // let container = document.getElementById("container");
    cont.innerHTML = null;
    let h2 = document.createElement("h2");
    h2.innerText = data.name;

    let temp = document.createElement("h1");
    temp.innerText = `Temp:-${data.main.temp}`;

    let min_temp = document.createElement("p");
    min_temp.innerText = `Min Temp:-${data.main.temp_min}`;

    let max_temp = document.createElement("p");
    max_temp.innerText = `Max Temp:-${data.main.temp_max}`;
    let div  = document.createElement("div")
    div.append(h2,temp,min_temp,max_temp);
    cont.append(div)
   

    //append the map
    mapper.src=`https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`

}

// let x=z("city")
// let y=z("name")
// let c=z("age")

// function z(val){
//     return document.getElementById(val).value
// }