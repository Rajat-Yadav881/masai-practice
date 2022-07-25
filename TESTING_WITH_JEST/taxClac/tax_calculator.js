function tax(a){
    if(a>250000 && a<500000){
        return a * 10/100
    }else if(a>500000 && a<1000000){
        return a*20/100
    }else if(a>1000000){
        return a*30/100
    }
}

function savings(a){
    if(a<500000){
        let x = a*50/100
        if(x>50000){
            x=50000
        }else{
            x = a*50/100
        }
        return a - x
    }else if(a>500000 && a<1000000){
        let y = a*30/100
        if(y>50000){
            y=50000
        }else{
            y = a*30/100
        }
        return a - y
    }else if(a>1000000){
        let z = a*10/100
        if(z>50000){
            z=50000
        }else{
            z = a*10/100
        }
        return a - z
    }
}

export {tax,savings};
