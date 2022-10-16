let matrix = [[0,1,1,0],[1,1,1,1],[1,1,1,1],[1,1,0,0]];
let n = matrix.length;
let m = matrix[0].length;
function myFunc(matrix,n,m){
    let res = []
    for(let j=0;j<m;j++){
        res.push(matrix[0][j])
    }
    let array=[]
    let mx = MAH(res)
    for(let i=1;i<n;i++){
        for(let j=0;j<m;j++){
            if(matrix[i][j] === 0){
                res[i] = 0
            }else{
                res[j] = res[j]+matrix[i][j]
            }
        }
        mx = maximum(mx,MAH(res))
         
        array.push(mx)
    }
    return array
   
}
function maximum(mx,ace){
    if(ace>mx){
        mx = ace
    }
    return mx;
}

function MAH(arr){
    let left1 = left(arr)
    let right1 = right(arr)
    let width = []
    for(let i=0;i<arr.length;i++){
        width.push(right1[i]-left1[i]-1)
    }
    let i=0;
    let max = -Infinity;
    while(i<arr.length){
        let area = arr[i]*width[i]
        if(area>max){
            max = area;
        }
        i++;
    }
    return max

}

function left(arr){
    let left = []
    let stk1=[];
    for(let i=0;i<arr.length;i++){
        if(stk1.length===0){
            left.push(-1)
        }else if(stk1.length>0 && arr[i]<arr[stk1[stk1.length-1]]){
            left.push(stk1[stk1.length-1])
        }else if(stk1.length>0 && arr[i]>=arr[stk1[stk1.length-1]]){
            while(stk1.length>0 && arr[i]>=arr[stk1[stk1.length-1]]){
                stk1.pop()
            }
            if(stk1.length===0){
                left.push(-1)
            }else{
                left.push(stk1[stk1.length-1])
            }
        }
        stk1.push(i)
    }
    
   
    return left
}

function right(arr){
    let right = []
    let stk2=[];
    let sudo = arr.length
    for(let i=n-1;i>=0;i--){
        if(stk2.length===0){
            right.push(sudo)
        }else if(stk2.length>0 && arr[i]<arr[stk2[stk2.length-1]]){
            right.push(stk2[stk2.length-1])
        }else if(stk2.length>0 && arr[i]>=arr[stk2[stk2.length-1]]){
            while(stk2.length>0 && arr[i]>=arr[stk2[stk2.length-1]]){
                stk2.pop()
            }
            if(stk2.length===0){
                right.push(sudo)
            }else{
                right.push(stk2[stk2.length-1])
            }
        }
        stk2.push(i)
    }
    let x = right.reverse()
  
    return x
}

myFunc(matrix,n,m)