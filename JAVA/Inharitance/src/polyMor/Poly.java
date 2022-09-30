package polyMor;

public class Poly {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Poly{
    @Override
    void eat(){
        System.out.println("eating bread...");
    }
    //specific method of child class
    void bark(){
        System.out.println("barking...");
    }
}
class Main{
    void doSomething(Poly a){
        a.eat();
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.bark();
            d.eat();
        }
    }
    public static void main(String args[]){
        Main main = new Main();
        main.doSomething(new Poly());
        main.doSomething(new Dog());
    }
}
