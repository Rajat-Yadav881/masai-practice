package _1Inter;

public interface InterIt {
    void nasty();
    default void deep(){
        System.out.println("get him here");
    }
    static void nose(){
        System.out.println("all of the sudden it raised");
    }
}
class Body implements InterIt{
    public void nasty(){
        System.out.println("here i am able to access the interface class abstract method");
    }

}
class Main{
    public static void main(String[] args) {

        InterIt interIt = new Body();
        interIt.nasty();
        interIt.deep();

    }
}
