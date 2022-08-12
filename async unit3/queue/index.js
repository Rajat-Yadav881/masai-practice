let input = [["E",1,1],["E",2,1],["E",1,2],["D"],["D"]]
function runProgram(input){
    let tc = input.length;
    for(let i=0;i<tc;i++){
        let str = input[line++].trim().split(" ");
        if(str[0]==="E"){
            let club = +str[1];
            let member = +str[2];
            master(club,member);
        }else{
            dequeue();
        }    
    }
}
let q1 = []
let q2 = []
let q3 = []
let q4 = []
let masterQueue = []
function master(club,member){
    let flag = false;
    for(let i=0;i<masterQueue.length;i++){
        if(masterQueue[i]===club){
            flag=true;
        }
    }

    if(flag===false){
        masterQueue.push(club);
    }
    enqueue(club,member)
}
function enqueue(club,member){
    if(club===1){
        q1.push(member);
    }else if(club===2){
        q2.push(member);
    }else if(club===3){
        q3.push(member)
    }else{
        q4.push(member)
    }
}
function dequeue(){
    let front = masterQueue[0];
    if(front===1){
        console.log(1,q1.shift());
        if(q1.length===0){
            masterQueue.shift()
        }
    }else if(front===2){
        console.log(2,q2.shift())
        if(q2.length===0){
            masterQueue.shift()
        }
    }else if(front===3){
        console.log(3,q3.shift())
        if(q3.length===0){
            masterQueue.shift()
        }
    }else{
        console.log(4,q4.shift())
        if(q4.length===0){
            masterQueue.shift()
        }
    }
}