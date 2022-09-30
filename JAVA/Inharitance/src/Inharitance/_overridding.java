package Inharitance;

public class _overridding {
    public static void main(String[] args) {
        Father father = new Father();
//        father.earn();
        You you = new You();
        you.earn();
    }
}
class Father{
    void earn(){
        System.out.println("earn by running the buisness...");
    }
}
class You extends Father{
    /*rules of overriding
    * there should be the is-a relation
    * method name should be the same across the parent and child class
    * arg list of both the method should be the same;
    * */
    @Override //this naming convention is written if any error it will catch the error for the overiding
    void earn(){
        System.out.println("you are refer to father...");
    }
}
