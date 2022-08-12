let data = JSON.parse(localStorage.getItem("signup"))
class students{
    #password
    #username
    constructor(a,b){
        this.username = a;
        this.password = b;
    }
    login(username,password){
        let res = false
        let count = 0;
        data.forEach((el) => {           
            if(username === el.#username && password === el.#password){
                console.log("login Successful");
                res = true;
                count++;                
            }
        });
        if(res === true && count === 1){
            alert("login successful")
            window.location.href = "index.html"
        }else{
            console.log("Aunthentication failed")
        }
    }
}
let innerData = JSON.parse(localStorage.getItem("burette"))||[]
function loginData(e){

    e.preventDefault();

    let form = document.getElementById("init")

    let username = form.username.value;

    let password = form.password.value;

    let us = new students(username,password)

    let nukal =  us.login(username,password)
    innerData.push(nukal)
    localStorage.setItem("burette",JSON.stringify(innerData))

}
