let data = JSON.parse(localStorage.getItem("burette"));
let assignData = JSON.parse(localStorage.getItem("bloom"))
// class user{
//     constructor(){
//         this.numberOfAssignment = 0
//     }
//     submitAssignment(){
//         this.numberOfAssignment++;
//         console.log('%c Accepted','color:lime')
//     }
// }

// class admin extends user{
//     constructor(){
//         super()
//     }
//     removeUser(username){
//         data = data.filter((el)=>{
//             return el.username!==username
//         });
//     }
// }

// let student = new user()

function append(assignData){
    if(!assignData){
        return;
    }
    let cont = document.getElementById("container");
        cont.innerHTML = null;

        assignData.map((el,i)=>{
            let div = document.createElement("div")
            let sub = document.createElement("h3");
            sub.innerText = el.subject
            let top = document.createElement("h3");
            top.innerText = el.topic
            let date =  document.createElement("p");
            date.innerText = el.data
            let btn = document.createElement("button")
            btn.innerText = "Remove";
            btn.addEventListener("click",()=>{
                remove(i)
            })
            div.append(sub,top,date,btn);
            cont.append(div)
        })
}
  append(assignData)     
  
  function remove(i){
    let inData = JSON.parse(localStorage.getItem("bloom"))||[]
    inData.splice(i,1)
    localStorage.setItem("bloom",JSON.stringify(inData))
    append(inData)

  }
    


