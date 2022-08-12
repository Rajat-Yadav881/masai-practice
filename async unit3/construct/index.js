function Player(n,s){
    this.name = n;
    this.team = s
}

let profile = new Player("neeraj","india");
let profile1 = new Player("dhoni","chennai");
let profile2 = new Player("surya","bangalore");


function myName(m,c){
    this.age = m;
    this.city = c
}

// (call/apply/bind)
// myName.call(profile)
// myName.call(profile1)
// myName.call(profile2,23,"mumbai")
// console.log("profile2:",profile2)
// myName.apply(profile2,[23,"mumbai"])//this->profile2
// console.log("profile2:",profile2)
let myBind = myName.bind(profile2,23,"mumbai")
myBind();
console.log("profile2:",profile2)
