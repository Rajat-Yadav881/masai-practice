import Oops.A;

/*here the Main class will be considered as child class
* and the A class will be the considered as the super/parent class
* now all the element of the A class will be accessable in the Main class*/
public class Main extends A {/*by using the extends keyword we are achieveing the is-A relationship*/
    int x =20;
    void funX(){
        System.out.println("Inside funX of main");
    }
    public static void main(String[] args) {

        Main m1 = new Main();

        System.out.println(m1.x);
        m1.funX();

        m1.funA();
        System.out.println(m1.i);
    }
}