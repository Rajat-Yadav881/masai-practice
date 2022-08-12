let data = JSON.parse(localStorage.getItem("loop"))||[];

class funcData{
    constructor(a,b,c){
        this.email = a
        this.number = b;
        this.password = c;
    }

    leap(num,pass){
        let isVal = false;
        isVal = this.#number(num) && this.#password(pass);
        if(isVal){
            data.push(this)
            localStorage.setItem("loop",JSON.stringify(data))
            alert("signup SuccessFul");
            window.location.href = "process.html"
        }else{
            alert("invalid credentials")
        }

        
    }
    #number(num){
        let filtered = data.filter((el)=>{
            return el.email = email
        })
        if(filtered.length>0){
            return false;
        }else{
            return true;
        }
    }

    #password(pass){
        return true;
    }

}

let GetData = (e)=>{
    e.preventDefault();

    let form = document.getElementById("lue")
    let email = form.email.value;
    let num = form.number.value;
    let pass = form.password.value;
    
    let U1 = new funcData(email,num,pass);
    U1.leap(num,pass)
    // data.push(U1)
    

}
