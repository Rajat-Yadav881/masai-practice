let arr =[];
let front=0;
let rear=0;
let size=5;
function enqueue(data){
    if(size === rear){
        console.log("overflow")
    }
    arr[rear] = data
    rear++;
    console.log(arr);
}
enqueue(5);
enqueue(4);
enqueue(7);
function dequeue(){
    if(front===rear){
        console.log("underflow");
        return;
    }
    console.log(arr[front])
    front++;
}
dequeue()

let queue=[];
queue.push(4)
queue.push(5)
queue.push(8)
queue.push(2)
console.log(queue)
queue.shift()
console.log(queue)
queue.shift()
console.log(queue)


//double ended queue
//priority queue(heap)

