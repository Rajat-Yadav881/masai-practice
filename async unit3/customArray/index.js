// let array = [4,6,3,2,8];
// let reduce = array.reduce(()=>{
//     retur
// })
// array.pop();
// console.log(reduce)

class MyArray {
    constructor() {
        this.length = 0;
        Object.defineProperty(this, "length", {
            value: 0,
            enumerable: false,
            Writable: true,
        });
        
    }
    pusher(elem){
        this[this.length] = elem
        this.length++
        return this.length
    }
    poper() {
        this.length--;
        let popElem = this[this.length-1];
        delete this[this.length]
        return popElem;
    }

    maper(cb){
        let result = new MyArray()
        for(let index in this){
            if(this.hasOwnProperty(index)){
               result.pusher(cb(this[index],index,this))
            }
        }
        return result
    }
    //current,index ,arr
    reducer(ads){
        let y = 0
        let z = this.length-1
        let flush=0
        while(y<this.length && z<this.length){
            flush += this[y]+this[z]
            y++;
            z--;
            
        }
        return flush
    }

}
let arr = new MyArray()
arr.pusher(56)
arr.pusher(65)
arr.pusher(4)
arr.pusher(10)
arr.poper()
let psudo = arr.reducer(function(d){
    return d;
})
console.log(psudo);
// let res = arr.maper(function(val){
//     return val*val
// })
// console.log(res)


