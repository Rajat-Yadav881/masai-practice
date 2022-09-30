package Day9;

public class SuperClass {
    // this points to the current object
    //point to super class , super class constructor we use "super" keyword
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}

//super can be used to refer to the immediate parent class instance varible
//super can be used to invoke the immediate parent class method. super.method()
//super() can be used to invoke immediate parent class constructor. super()
class Animal{
    String  name;
    String breed;
    public void getit(String name,String bred){
        this.name = name;
        this.breed = bred;
    }
    String color = "white";
    Animal(){
        System.out.println("Animal constructor");
    }
    void Legs(){
        System.out.println("these set of animals has 4 legs and ");
    }
}
class Dog extends Animal{
    String color = "black";
    @Override
    void Legs(){
        System.out.println("dog has 4 legs small");
    }
    Dog(){
//        super();
        System.out.println("Dog constructor");
    }
    void printColor(){
        System.out.println(color);//black
        //now useing the super
        System.out.println(super.color);
      Legs();
      super.Legs();

//        super.getit("sheela","hybrid");
    }
}

//complier does 2 things
//it gives the default constructor
//the first lune each constructor is call to
//the super constructor super()
//constructor chaining

