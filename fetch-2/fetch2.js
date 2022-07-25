// 8d7004ad8ced57e9c56ada80bbddfd99
// let url = "https://api.openweathermap.org/data/2.5/weather?q=chandigarh&appid=8d7004ad8ced57e9c56ada80bbddfd99";

function getData(){
    let city = document.getElementById("query").value;

    let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=8d7004ad8ced57e9c56ada80bbddfd99`;

    fetch(url)
    .then(function(res){
        return res.json();
    })
    .then(function(res){
        console.log(res);
        append(res);
    })
    .catch(function(err){
    console.log(err)
    });
}

function append(data){
    let url = `https://api.openweathermap.org/data/2.5/weather?q=${data.name}&appid=8d7004ad8ced57e9c56ada80bbddfd99`;
    let container = document.getElementById("container");
    container.innerHTML = null;
    let h2 = document.createElement("h2");
    h2.innerText = data.name;

    let temp = document.createElement("h1");
    temp.innerText = `Temp:-${data.main.temp}`;

    let min_temp = document.createElement("p");
    min_temp.innerText = `Min Temp:-${data.main.temp_min}`;

    let max_temp = document.createElement("p");
    max_temp.innerText = `Max Temp:-${data.main.temp_max}`;

    container.append(h2,temp,min_temp,max_temp);

    let iframe = document.getElementById("gmap_canvas");
    iframe.src = url;
}

function getLocation(){
    navigator.geolocation.getCurrentPosition(success);
    function success(pos) {
        const crd = pos.coords;
      
        console.log('Your current position is:');
        console.log(`Latitude : ${crd.latitude}`);
        console.log(`Longitude: ${crd.longitude}`);
        console.log(`More or less ${crd.accuracy} meters.`);
        getWeatherLocation(crd.latitude,crd.longitude);
      }

     
}
getLocation();

function getWeatherLocation(lat,lon){
    let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=8d7004ad8ced57e9c56ada80bbddfd99`;

    fetch(url).then(function(res){
        return res.json();
    })
    .then(function(res){
        console.log(res);
        append(res);
    })
    .catch(function(err){
    console.log(err)
    });
}

//interview question--:>how many types of datatype??
// --bigint and symbol are two more data typeof
// explore it

//what is different types of "type coercion" in js.