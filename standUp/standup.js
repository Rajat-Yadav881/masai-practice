// let arr = new Array(26).fill(0);
// let count = 0;
// for(let i=0;i<str.length;i++){
//     arr = new Array(26).fill(0);
//     for(let j=0;j<n;j++){
//         let m = (str[j].charCodeAt(0))-97;
//         arr[m]++;
//         if(arr[m]<3){
//             count++;
//         }else{
//             break;
//         }
//     }
// }
// console.log(count);

// let arr = "abcdhvdscxzbbvaababxa";
// let array = new Array(26).fill(0);
// for(let i in arr){
//     array[arr[i].charCodeAt()-97]++;

// }
// console.log(array["b".charCodeAt()-97])


// let obj = {};
// for(let i in arr){
//     obj[arr[i]]=(obj[arr[i]]||0)+1
// }
// console.log(obj)

let arr = [1,2,3,4,1,2,3,4,1,2,3,4];
let s =[...new Set(arr)] 
console.log(arr);
console.log(s);