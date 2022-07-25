// the tool :-Fetch
//adress :- URL
//Destination :- Server

//API :- application programing interface
//tool that provede certain data is API

// let x = fetch("https://reqres.in/api/users?page=2")  //function

// // Takes time
// // Rejected or Fullfilled or pending(process to getting the data)


// console.log(x);


// Promise {<rejected>: TypeError: Failed to execute 'fetch' on 'Window': 1 argument required, but only 0 present.
// //     at h…}
// // [[Prototype]]: Promise
// // [[PromiseState]]: "rejected"
// // [[PromiseResult]]: TypeError: Failed to execute 'fetch' on 'Window': 1 argument required, but only 0 present. at http://127.0.0.1:5500/home.js:8:9
// // message: "Failed to execute 'fetch' on 'Window': 1 argument required, but only 0 present."
// // stack: "TypeError: Failed to execute 'fetch' on 'Window': 1 argument required, but only 0 present.\n    at http://127.0.0.1:5500/home.js:8:9"
// // [[Prototype]]: Error

// // function sum(){
// //     return 5+2;
// // }
// // let s = sum();
// // console.log(s);

const url = "https://reqres.in/api/users?page=2";

fetch(url)
    .then(function(res){
        return res.json();//collect()
    })
    .then(function(res){
        console.log(res);
        append(res.data);
    })
    .catch(function(err){
        console.log(err);
    });
    

// appending on DOM
function append(data){
    let container = document.getElementById("container");
    data.forEach(function(el) {
        let img = document.createElement("img");
        img.src = el.avatar;
        let p = document.createElement("p");
        p.innerText = `${el.first_name} ${el.last_name}`;

        let div = document.createElement("div");
        div.append(img,p);
        container.append(div);
    });
}
// // ReadableStream
// // readable +

// //server send you data in form of small chunks or pa

// //ReadableStream---> in chunks
// const url = 'https://fakestoreapi.com/products';
// // const url = "http://www.omdbapi.com/?t=thor";
// async function getData(){
//     try{
//         let res = await fetch(url);
//         let data = await res.json(); //beacuse the data from api was not in form of json in readablestream so we are using json
//         console.log(data);
//         append(data);
//     }catch(err){
//         console.log(err);
//     }
    
// }
// getData();

// function append(data){
//     let container = document.getElementById("container");
//     //sorting;
//     // data.sort(function(a,b){
//     //     return a.price-b.price;
//     // })

//     //filtering;
//     // data = data.filter(function(el){
//     //     return el.category === "jewelery";
//     // })
//     data.forEach(function(el) {
//         let img = document.createElement("img");
//         img.src = el.image;
//         let title = document.createElement("h2");
//         title.innerText = el.title;
//         let p = document.createElement("h1");
//         p.innerText = `$${el.price}`;

//         let div = document.createElement("div");
//         div.append(img,title,p);
//         container.append(div);
//     });
// }


//what is client server model?
//what is api??
// what is the different kinds of requests you can make to server??


//yesterday homework  28-06-2022
// function hello(){
//     return new Promise(function(res,rej){
//         setTimeout(function(){
//             res("hello")
//         },5000);
//     });
// }
// async function print(){
//     let res = await hello();
//     console.log(res);
//     console.log("world");
// }

// print();