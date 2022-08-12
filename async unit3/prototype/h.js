let arr = [39,27,11,4,24,32,32,1];
// let arr = [5,4,3,2,1,7]
function smalletElem(arr){
    // ans=[];
    // for(let i=0;i<arr.length;i++){
    //     let curr=-1;
    //     for(let j=i-1;j>=0;j--){
    //         if(arr[j]<arr[i]){
    //             curr = arr[j];
    //             break;
    //         }
    //     }
    //     ans.push(curr)
    // }
    // console.log(ans)

    //stack method
    let stk=[];
    let ans=[];
    for(let i=0;i<arr.length;i++){
        while(stk.length>0 && arr[i]<= stk[stk.length-1]){
            stk.pop();
        }
        if(stk.length === 0){
            ans.push(-1)
        }else{
            ans.push(stk[stk.length-1])
        }
        stk.push(arr[i])
    }
    console.log(ans.join(" "))

}
smalletElem(arr)
 