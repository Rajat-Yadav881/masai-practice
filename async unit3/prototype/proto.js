//create our own array

function MyArray(){
    this.length = 0;
    Object.defineProperty(this,"length",{
        value:0,
        enumerable:false,
        writable:true
    });

}


MyArray.prototype.pushMy = function(elem){
    this[this.length] = elem;
    this.length++;
    return this.length
}
MyArray.prototype.mapMy = function(){

}
MyArray.prototype.popMy = function(){
    this.length--
    let popElem = this[this.length-1]
    return popElem
}
let arr = new MyArray();
arr.pushMy("masai") 
arr.pushMy("ludo")
arr.pushMy("school") 
arr.popMy();
// console.log(arr);

for(let key in arr){
    console.log(key,arr[key])
}