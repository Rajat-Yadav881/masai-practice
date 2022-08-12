// let nikeproduct = {
//     brand:"nike",
//     seller:"amazon"
// }
// let p1 = {
//     brand:"nike",
//     seller:"flipkart",
//     price:2000
// }
// let p1 = Object.create(nikeproduct)
// console.log("p1:",p1);
// let p2 = Object.create(nikeproduct)

// let studentProfile = {
//     course:"FWD",
//     code:"FW19_0358",
//     unit:"unit2",
//     coding:"JS201"
// }

// let s1 = Object.create(studentProfile)
// s1.name = "rajat";
// let s2 = Object.create(studentProfile)
// s2.name = "raja";
// let s3 = Object.create(studentProfile)
// s3.name = "raj";
// let s4 = Object.create(studentProfile)
// s4.name = "rajanadra";
// console.log("s1:",s1)
// console.log("s2:",s2)
// console.log("s3:",s3)
// console.log("s4:",s4)

//create custom method
// let arr = [1,2,3] // expexctation

// let array2 = new Array(1,2,3);//reality

// // Array.prototype.map
// Array.prototype.lalSinghchadda = function(){
//     console.log("copied--ForestGumup")
// }
// array2.lalSinghchadda();

// Array// blueprint
// lalSinghchadda//customization

// //add own method on all array that print your name
// let arr1 = [2,3,5,6,8]


//

Array.prototype.mymapping=function(func){
    let arr = this;
    let newArr = [];
    for(let i=0;i<arr.length;i++){
        let elem = arr[i];
        let x = func(elem);

        newArr.push(x)
        
    }
    return newArr;
};
let arr1 = [1,2,3,4]

let x = arr1.mymapping(function(x){
    return x*2;
});
console.log("x:",x);

//create our own forEach,.filter()