// let obj = {
//     ")":"(",
//     "]":"[",
//     "}":"{"
// }
// let stack=[]
// for(let i=0;i<N;i++){
//     if(str[i]==="("||str[i]=="["||str[i]==="{"){
//         stack.push(str[i])
//     }else if(str[i]===")"||str[i]=="]"||str[i]==="}"){
//         if(obj[str[i]===stack[stack.length-1]]){
//             stack.pop();
//         }else{
//             return "unbalanced"
//         }
//     }
// }
let arr = [100,80,60,70,60,75,85]
let N = arr.length;
let ans=[];
for(let i=0;i<N;i++){
    let count = 1;
    for(let j=i-1;j>=0;j--){
        if(arr[j]>=arr[i]){
            count++;
        }else{
            break;
        }
        
    }
    ans.push(count)
}
console.log(ans)