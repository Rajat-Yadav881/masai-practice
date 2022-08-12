// new Promise(function(resolve, reject) {
// let result = "koon"
//   setTimeout(() => resolve(result), 3000); // (*)

// }).then(function(result) { // (**)

//   alert(result); // 1
//   return result ;

// })
// new Promise(function(resolve, reject) {
// let result2 = "kookloop"
//   setTimeout(() => resolve(result2), 8000); // (*)

// }).then(function(result2) { // (***)

//   alert(result2); // 2
//   return result2 ;

// })
// new Promise(function(resolve, reject) {
// let result3 = "koonhook"
//   setTimeout(() => resolve(result3), 12000); // (*)

// }).then(function(result3) {

//   alert(result3); // 4
//   return result3 ;

// });
// new Promise(function(resolve, reject) {
//     let result3 = "koonhook"
//       setTimeout(() => resolve(result3), 12000); // (*)
    
//     }).then(function(result3) {
    
//       alert(result3); // 4
//       return result3 ;
    
//     });
// new Promise(function(resolve, reject) {
//         let result3 = "koonhook"
//           setTimeout(() => resolve(result3), 12000); // (*)
        
//         }).then(function(result3) {
        
//           alert(result3); // 4
//           return result3 ;
        
// });
let shadow = ()=>{
  leap()
}
function leap(){
  let x = document.getElementById("innerImg")
      x.innerHTML=null
      let img = document.createElement("img");
      img.src = "https://upload.wikimedia.org/wikipedia/commons/c/c7/Loading_2.gif?20170503175831"
      x.append(img) 
  for(let i=0;i<14;i++){
    
    if(i===0){
      setTimeout(()=>{
        alert("hello")
      },1000)
    }
    if(i===3){
      setTimeout(()=>{
        alert("india")
      },i*1000)
    }
    if(i===6){
      setTimeout(()=>{
        alert("how")
      },i*1000)
    }
    if(i===9){
      setTimeout(()=>{
        alert("are")
      },i*1000)
    }
    if(i===12){
      setTimeout(()=>{
        alert("You All")
      },i*1000)
    }
    if(i===13){
      setTimeout(()=>{
        let x = document.getElementById("innerImg")
        x.innerHTML=null
        let img = document.createElement("img");
        img.src = "https://cdn.dribbble.com/users/1751799/screenshots/5512482/check02.gif"
        x.append(img)
      },i*1000)
    }
  }
}

document.getElementById("complete").addEventListener("click",shadow)
