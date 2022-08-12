let logData = JSON.parse(localStorage.getItem("load"))||[];

class User{
  
    constructor(a,b){
        this.usrname = a;
        this.password = b;
    }
    Login(usrname,pass){
        let res = false;
        let count = 0;
        logData.filter((el)=>{
            if(el.usrname === usrname && el.password===pass){
                res = true;
                count++;
            }
           
        });
        
        if(res === true && count>0){
            alert("login succesfull");
            window.location.href = "index.html";
        }else{
            alert("invalid Credential")
        }
    }
}

let getlog = (event)=>{
    event.preventDefault();
    let form = document.getElementById("Food");
    let usrname = form.username.value;
    let pass = form.password.value;

    let dData = new User(usrname,pass);

    dData.Login(usrname,pass)
    localStorage.setItem("key101",JSON.stringify(dData))
}