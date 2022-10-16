class Node{
    constructor(elem){
        this.elem = elem;
        this.next = null
    }
}
class LinkedList{
    constructor(){
        this.head = null;
        this.size = 0;

    }
    // methods
    //add
    add(elem){
        let node = new Node(elem) //new node
        //if linked list is empty
        if(!this.head){
            this.head = node
        }else{
            let current = this.head
            while(current.next){
                current = current.next
            }
            current.next = node
        }
        this.size++
    }
    //insert
    inserAt(element,index){
        if(index>this.size || index<0 && this.size){
            return false
        }
        let node = new Node(element)
        let current = this.head
        let prev = null
        let i=0;
        if(index === 0){
            node.next = current
            this.head = node
        }else{
            while(i<index){
                prev = current;
                current = current.next
                i++;
            }
            //insert
            prev.next = node
            //move to the next node
            prev = prev.next
            //add the rest of the current to the inserted node
            prev.next = current
        }
    }
    //delete
    removeElement(element){
        let current = this.head
        let prev = null

        while(current){
            if(current.element === element){
                if(prev === null){
                    this.head = current.next
                }else{
                    prev.next = current.next
                }
                this.size--;
                return true
            }
            prev = current;
            current = current.next
        }
    }
    //print
    printList(){
        let current = this.head
        let index = 0
        while(current){
            console.log("element:",current.element,"index:",index++)

            current = current.next
        }

    }
    isEmpty(){
        return this.size === 0? true:false
    }
    sizeOf(){
        return this.size
    }
}
let list = new LinkedList()

list.add(23)
list.add(2)
list.inserAt(34,2)
list.printList()
console.log(list.sizeOf())
// list.isEmpty()