let otp = document.getElementById("otp_section");

let img = document.createElement("img");
let cont = document.getElementById("pending_system");
cont.append(img);

let myPromise = new Promise(function (resolve, reject) {
  // alert("please Wait...")
  // let Data = false;
  let Data = submitZ();
  setTimeout(() => {
    
    if (Data) {
      resolve("great");
    } else {
      reject("woshh");
    }
  }, 1000);
});
console.log(myPromise)
function submitZ(){
  if (otp.value !== "1234") {
    // alert("please wait...")
    return false;    
  }  
};
// myPromise.then(()=>{
//     alert("payment Succesfully")
//     img.src ="https://i.pinimg.com/originals/0d/e4/1a/0de41a3c5953fba1755ebd416ec109dd.gif";
// })
// myPromise.catch(() => {
//     alert("failed..😒");
//     img.src = "https://media3.giphy.com/media/sS8YbjrTzu4KI/200.gif";
//   });
// myPromise.finally(() => {
//   let set = document.getElementById("gen1");
//   set.innerHTML = "Done";
// });

// document.getElementById("button").addEventListener("click", submitZ);
