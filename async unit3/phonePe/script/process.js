let data = JSON.parse(localStorage.getItem("loop"));

class User{
    constructor(a,b,c){
        this.mobile = a;
        this.password = b;
        this.money = c;
    }

    loginSet(mobile,password){
        let res = false;
        let count = 0;
        data.forEach((el) => {
            if(el.number===mobile && el.password===password){
                res = true;
                count++;
            }
        });
        if(res === true && count>=1){
            alert("you can proceed")
            window.location.href="otp.html"
        }else{
            alert("invalid Credentials")
        }
    }

}

let sucPayment = (e)=>{
    e.preventDefault();
    let form = document.getElementById("throttle");
    let mobile = form.mobile.value;
    let password = form.password.value;
    let money = form.money.value;

    let D = new User(mobile,password,money);
    D.loginSet(mobile,password)
}