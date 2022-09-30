public class Linked_list {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.isEmpty());
        for (int i=1;i<=5;i++){
            linkedList.insertToTheTail(i);
            System.out.println("head->"+linkedList.getHead()+" Tail-> "+linkedList.getTail());
        }
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getSize());
        linkedList.insertAtHead(8);
        System.out.println(linkedList.getSize());
        System.out.println("head->"+linkedList.getHead()+" Tail-> "+linkedList.getTail());
        linkedList.deleteNode(4);
        System.out.println(linkedList.getSize());
        linkedList.printLinkedList();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){//constructor
        this.data = data;
        this.next = null;
    }
    //method to print the node
    public void printNode(){
        System.out.println(this.data+"->"+this.next);
    }
}
class LinkedList{ //Singly linked-list
    Node head;
    Node tail;
    int size;
    //constructor
    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    //method to get the head of the linked-list
    //getter method
    public int getHead(){
        return head.data;
    }
    //method to get teh tail of the linked-list
    //getter method
    public int getTail(){
        return tail.data;
    }
    //function to add element at the head of the linked-list
    public void insertAtHead(int data){//time complexity==O(1)
        if (head==null){
            head = new Node(data);
            return;
        }
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
        size++;
        return;

    }
    //function to add elements at the tail of the linked list
    public void insertAtTail(int data){//time complexity==>O(N)  N is the size of the linked list
        if(head==null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }
    public void insertToTheTail(int data){//time complexity ==>O(1)
        if (head==null){
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        tail.next = new Node(data);
        tail = tail.next;
        size++;
        return;
    }
    //method to print the linked-list
    public void printLinkedList(){
        if(head==null){
            return;
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
        return;
    }
    //method to delete the node
    public void deleteNode(int data){
        Node current = head;
        while (current.next.data!=data){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
        return;
    }
    //method to get the size of the linked list
    public int getSize(){
        return size;
    }
    //method to check the linkedlist is empty or not;
    public boolean isEmpty(){
        return size==0?true:false;
//        if(size==0){
//            return true;
//        }else {
//            return false;
//        }
    }

}