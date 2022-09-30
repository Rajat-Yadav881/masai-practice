package Inharitance;

public class _1Inharitance {

        public static void main(String[] args) {
            Fish fish = new Fish();
            fish.swim();
            Dolphin dolphin = new Dolphin();
            dolphin.swim();
            dolphin.jump();

        }
    }
    //Fish is also called super class,parent class,base class
    class Fish{
        void swim(){
            System.out.println("Fish is swimming...");
        }
    }
    /*extends keyword set's the relation between the two different classes
     *dolphin class is also name as child class,Sub class,derived class*/
    class  Dolphin extends Fish{
        /*Benifit
         * code reusability*/
        void jump(){
            System.out.println("Dolphin is jumping in the ocean...");
        }

}
