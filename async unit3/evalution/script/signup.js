let sinData = JSON.parse(localStorage.getItem("load"))||[];
class ads{
    constructor(a,b,c,d){
        this.name =a;
        this.usrname = b;
        this.password = c;
        this.email = d;
    }

    signUP(email,password){
        let isValid = false;
        isValid = this.#username(email) && this.#userpassword(password);
        if(isValid){
            sinData.push(this);
            localStorage.setItem("load",JSON.stringify(sinData));
            alert("signup Successfully");
            window.location.href = "login.html";
        }else{
            alert("invalid")
        }
    }

    #username(email){
        let filtered = sinData.filter(el=>{
            return el.email === email
        })
        if(filtered.length>0){
            return false;
        }else{
            return true;
        }
    }

    #userpassword(password){
        return true;
    }
}

let getData = (e)=>{
    e.preventDefault();
    let form = document.getElementById("foodSign");
    let name = form.name.value;
    let usrname = form.username.value;
    let password = form.password.value;
    let email = form.email.value;
    
    let X = new ads(name,usrname,password,email);
    X.signUP(email,password)
    
}