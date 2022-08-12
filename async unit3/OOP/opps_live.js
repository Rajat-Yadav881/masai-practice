//for both the user what funcanalities we need...
let users = []
class User{
    #password
    #username
    constructor(){
        this.organization = 'masai';
        
    }
    #validateusername(username){
        // let isValid = false;

        //we need to check two things: 1.username 2.password
        
      let value = username.includes('@')? false : true;
      
      return value;
    }
    #validatePassword(password){

        let value = password.includes("123")? false:true;

        return value;

    }

    login(username,password){
        if(username === this.#username && password === this.#password){
            console.log("login Successful")
        }else{
            console.log("Aunthentication failed")
        }
    }
    signUp(username,password){
        let isValidated = false;

        isValidated = this.#validateusername(username) && this.#validatePassword(password)


        if(isValidated){
            //store data and show success message
            this.#username = username
            this.#password = password

            console.log("Register successful")
            users.push(this)
        }else{
            console.log("failed"); 
        }


    }
}
let u2 = new User()
let u1 = new User()
//how to encapsulate methods?
//how to encasulate properties

// u1.signUp("rajat","hexa142")
// u2.signUp("janish","hexa178")

// console.log("u1:",u2.password)
// console.log("u1:",u2.username)

// u1.login("rajat","hexa142")

class student extends User{
    constructor(){
        super()
        this.numberOfAssignment = 0

    }

    submitAssignment(){

        this.numberOfAssignment++;
        console.log("%c Accepted" ,'color:lime')
    }

}

class admin extends User{
    constructor(){
        super()
        
    }

    removeUser(username){
        //remove person with given name
        users = users.filter((el)=>{
            return el.username!=username
        });
    }
}
// let student1 = new student()
let student2 = new student()
// // let student3 = new student()
// student1.signUp("pappu","golu")
// student1.login("pappu","golu")
student2.signUp("pappurr","golurr")
student2.login("pappurr","golurr")
// student1.submitAssignment()
// student1.submitAssignment()
// student1.submitAssignment()



// console.log(student1.numberOfAssignment)

let Admin = new admin()





Admin.signUp("popghfer","cobfdglur")

Admin.login("popghfer","cobfdglur")




Admin.removeUser("pappurr")
console.log(users)


// function SignUp(){
//     let username = document.getElementById("username").value;
//     let password = document.getElementById("password").value;

//     let s1 = new student();

//     s1.signUp(username,password)
//     console.log(users)
// }

// function login(){
//     let username = document.getElementById("username").value;
//     let password = document.getElementById("password").value;

//     let s1 = new student();
// }