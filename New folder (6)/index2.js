// function Student(n){
//     this.name = n;
//     this.batch = "WEB 19";
// }
// let s1 = new Student("rajat");

// //JS Array
// Student.prototype.sayName =function(){
//     console.log(this.name)
// }

// s1.sayName();
//limitation of arrow function
//it is light weight function  it has not the access to
//An arrow function can not be used as constructors

// class student{

//     constructor(n){
//         this.name = n
//         this.batch = "WEB-19";
//     }
//     sayName(){
//         console.log(this.name)
//     }
// }


// // student.prototype.sayName = function(){
// //     console.log(this)
// // }
// let s1 = new student("aman");
// console.log("s1:",s1);
let arr = [1,2,3];

class Stack{
    constructor(){

        this.length = 0
        this.Stack = []

    }

    push(...arr){
        // console.log("arr:",arr)
        //collect all parameters in array via spread operator
        arr.forEach((el)=>{
            //push

            // console.log("el:",el)

            let index = this.length;

            this.Stack[index]=el;

            this.length++;

        });
    }
    remove(){

        let index = this.length-1;
        delete this.Stack[index];
        this.Stack.length--;
        this.length--;
    }
    // puss(elem){
    //     let index = this.length-1;
    //     this.Stack[index].push(elem)
    //     this.Stack.length++;
    //     this.length++;
    // }
    peek(){
        let index = this.length-1
        return this.Stack[index]
    }
    isEmpty(){
        if(this.length===0){
            console.log("stack is empty") 
        }else{
            console.log(`stack is full of length ${this.length}`) 
        }    
    }
}

 

let s1 = new Stack();
s1.isEmpty();
s1.push(1, 2, 3, 4, 5, 6, 8);//arguments into
s1.remove()
let last = s1.peek()
console.log("last:",last)
console.log("s1:",s1);
s1.isEmpty();

//argument into an array

//create a stack and add push method on it