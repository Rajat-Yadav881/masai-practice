let arr = [100,80,60,70,60,75,85]
let res = [];
let stk = [];
for(let i=0;i<arr.length;i++){
    if(stk.length === 0){
        res.push(-1)
    }else if(stk.length>0 && arr[i]<arr[stk[stk.length-1]]){
        res.push(stk[stk.length-1])
    }else if(stk.length>0 && arr[i]>=arr[stk[stk.length-1]]){
        while(stk.length>0 && arr[i]>=arr[stk[stk.length-1]]){
            stk.pop()
        }
        if(stk.length === 0){
            res.push(-1)
        }else{
            res.push(stk[stk.length-1])
        }
    }
    stk.push(i)
}
let rest = []
for(let i=0;i<arr.length;i++){
    rest.push(i-res[i])
}
console.log(rest.join(" "))


