let st = "adadbc"
function myFunc(st){
    let obj={};
    for(let i=0;i<st.length;i++){
        let x = st[i];
        if(obj[x] === undefined){
            obj[x]=0;
        }
    }
    let que=[];
    let ans="";
    for(let i=0;i<st.length;i++){
        obj[st[i]]++;
        que.push(st[i]);
        
        while(que.length!==0){
            if(obj[que[0]]===1){
                break;
            }
            que.shift();
        }
        if(que.length===0){
            ans+="#";
        }else{
            ans+=que[0];
        }
    }
    console.log(ans);
}