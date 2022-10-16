let hist = [7,2,8,9,1,3,6,5]
let n = hist.length;
function getMaxArea(hist, n){
        let left = [];
        let stk1 = [];
        for(let i=0;i<n;i++){
            if(stk1.length===0){
                left.push(-1)
            }else if(stk1.length>0 && hist[i]>hist[stk1[stk1.length-1]]){
                left.push(stk1[stk1.length-1])
            }else if(stk1.length>0 && hist[i]<=hist[stk1[stk1.length-1]]){
                while(stk1.length>0 && hist[i]<=hist[stk1[stk1.length-1]]){
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

        let sudo = hist.length
        let right = [];
        let stk = [];
        for(let i=n-1;i>=0;i--){
            if(stk.length===0){
                right.push(sudo)
            }else if(stk.length>0 && hist[i]>hist[stk[stk.length-1]]){
                right.push(stk[stk.length-1])
            }else if(stk.length>0 && hist[i]<=hist[stk[stk.length-1]]){
                while(stk.length>0 && hist[i]<=hist[stk[stk.length-1]]){
                    stk.pop()
                }
                if(stk.length===0){
                    right.push(sudo)
                }else{
                    right.push(stk[stk.length-1])
                } 
            }
            stk.push(i)
        }
        right = right.reverse()
 
        let width = []
        for(let i=0;i<left.length;i++){
            width.push(right[i]-left[i]-1)
        }

        let i=0;
        let max = -Infinity;
        while(i<n){
            let area = hist[i]*width[i]
            if(area>max){
                max = area
            }
            i++;
        }
        console.log(max)
}
getMaxArea(hist, n)