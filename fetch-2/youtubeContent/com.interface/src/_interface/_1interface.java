package _interface;

public class _1interface {
}
//interface Animal{ //parentType
//    //public abstract
//
//    //public static final
//    int a = 10;
//    void eats();
//
//}
//interface Zoo extends Animal{
//    void domesticFood();
//}
//interface Jungle extends Animal{
//
//    void jungleFood();
//
//
//}
//
//class Dog implements Zoo,Jungle{
//    @Override
//    public void domesticFood(){
//        System.out.println("1");
//    }
//    @Override
//    public void jungleFood(){
//        System.out.println("2");
//    }
//    @Override
//    public void eats(){
//        System.out.println("3");
//    }
//}

//class Tiger implements Animal{
//    @Override
//    public void eats(){
//        System.out.println("tiger is in the jungle");
//    }
//    int display(){
//        System.out.println(a);
//        return a;
//    }
//}

//class Main{
//    public static void main(String[] args) {
////        Dog dog = new Dog();
////        dog.domesticFood();
////        dog.jungleFood();
////        dog.eats();
//
//        Zoo zoo = new Dog();
//        zoo.domesticFood();
//        zoo.eats();
//
//
//
//
//    }
//}


interface Car{
    //public static final
    static int a = 10;
    void bucket();
    default void seat(){
        System.out.println("in the interface");
    }
    static void dashboard(){
        System.out.println("I m static");
    }
}
class Tiago implements Car{
    @Override
    public void bucket(){

    }

}
class Main{
    public static void main(String[] args) {
        Tiago tiago = new Tiago();
        tiago.seat();
        Car car = new Tiago();
        Car.dashboard();

    }
}