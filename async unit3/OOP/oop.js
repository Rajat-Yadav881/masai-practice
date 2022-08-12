class car{
    constructor(n,b){
        this.name = n;
        this.brand = b;
    }
    showDetails(){
        console.log(`${this.name} ${this.brand}`)
    }
}
class suv extends car{
    constructor(x,y){
        super(x,y);
        this.buyer = "swanand"
    }
}
class miniSUV extends suv {
    constructor(x,y){
        super(x,y);
        this.type = "mini_suv"
    }
}
let car1 = new miniSUV("safari","TATA");
console.log(car1)


let Car = {
    type:"bu",
    brand:"tesla",
    name:"rajat",

    printBrand: function(){
        console.log(this.brand)
    },
}
Car.printBrand()

//encapsulation - create private varible
class car{
    #count; //private varible
    constructor(n,b){
        this.name = n;
        this.brand = b;
        this.#count = 100;
    }
    showDetails(){
        console.log(`${this.name} ${this.brand}`)
    }
}

let f1 = new car("swift","Suzuki");


// abstraction - hiding complexity

class employee {
    constructor(){
        this.type = "engineer";

    }
}

class manager extends employee{
    constructor(){
        super()
        this.subtype = "manager"
    }
    display(){
        console.log(this.subtype);
    }
}

let m1 = new manager();
console.log("m1:",m1)

//polymorphism - one method is available on multiple object
class vehicle{
    run(){
        console.log("vehicle is running")
    }
}
class car extends vehicle{
    run(){
        console.log("car is runing")
    }
    
}
class truck extends vehicle{
    run(){
        console.log("truck is runing")
    }
    
}
let v1 = new vehicle()
v1.run()

let v2 = new car()
v2.run()

let v3 = new truck()
v3.run()