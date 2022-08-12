let data = JSON.parse(localStorage.getItem("burette"))||[];
class user{
    constructor(){
        this.numberOfAssignment = 0
    }
    submitAssignment(){
        this.numberOfAssignment++;
        console.log('%c Accepted','color:lime')
    }
}

class admin extends user{
    constructor(){
        super()
    }
    removeUser(username){
        data = data.filter((el)=>{
            return el.username!==username
        });
    }
}

let student = new user()