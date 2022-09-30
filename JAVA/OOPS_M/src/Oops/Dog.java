package Oops;

public class Dog extends Animal {

    void display(){
//        System.out.println("my age is "+age);
//        super.eat(); //super class keyword will represent the parent class eat method it will give the prioratity to parent class eat method
        System.out.println("inside display method of dog");
    }
    @Override
    void eat(){
        //overRiding the method
        System.out.println("Dog can eat...");
        //overRiding method will get th priority
    }
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.age = 2;
//        d.display();
//    }
    public static void main(String[] args) {
        //runtime polymophism
//        Dog d = new Dog();
//        d.display();
//        Animal a = new Animal();
//        a.eat();
        Animal a = new Dog();//super class varible

        a.eat();//give priority to overrided method
        //it is not calling the methods of the Dog class
        //in this senerio we will use downcasting
        //the biggest point to note that we can only use the downcasting when the super class refering to the child class object
        Dog d = (Dog)a;
        d.display();//now we can refer the child class

    }
}

//three possible object creation for this multiple type are--
/*super class reference and child class

* Animal a = new Animal();
* Animal a = new Dog(); //upcasting
* Animal a = null; */