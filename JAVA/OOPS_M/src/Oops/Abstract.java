package Oops;

public class Abstract {

    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat();
        babyCat.eatz();
        babyCat.name = "john";
        babyCat.show();
        babyCat.weep();
    }

}
//parent class
class Anima{
    public void eatz(){
        System.out.println("I can eat");
    }
}
//child class inherit from anima
//cat is an Anima
class Cat extends Anima{
    String name;
    public void show(){
        System.out.println("My name is "+name);
    }
}

class BabyCat extends Cat{
    void weep(){
        System.out.println("weeping....");
    }
}

