document.querySelector("form").addEventListener("submit",myFunc)
function myFunc(event){
   event.preventDefault();
   let name = document.querySelector("#name").value
   let age = document.querySelector("#age").value
   let gender = document.querySelector("#gender").value
   let email = document.querySelector("#email").value
   let mbl = document.querySelector("#mbl").value
   console.log(name,age,gender,email,mbl)
}