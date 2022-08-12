let users = JSON.parse(localStorage.getItem("signup"))||[]
class student{
    #password
    #username
    constructor(a,b,c,d){
        this.name = a;
        this.email = b;
        this.password = c;
        this.username = d;
    }
    
    signUp(username,password){
        let isValid = false;
        isValid = this.#validusername(username) && this.#validpassword

        if(isValid){
            this.#username = username
            this.#password = password

            console.log("register Successful")
            users.push(this)
            localStorage.setItem("signup",JSON.stringify(users))
            window.location.href = "login.html";
        }else{
            console.log("failed")
        }
    }
    #validusername(username){
        let value = username.includes("@")? false:true

        return value;
    }
    #validpassword(password){
        let value = password.includes("123")? false:true

        return value;
    }

}

function dataInfo(e){
    e.preventDefault();
    let form = document.getElementById("init")
    let name = form.name.value;
    let username = form.username.value;
    let password = form.password.value;
    let email = form.email.value;

    let u1 = new student(name,username,password,email);

    u1.signUp(username,password);
}