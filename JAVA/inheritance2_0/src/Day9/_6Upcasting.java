package Day9;

public class _6Upcasting {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Daughter daughter = new Daughter();
        //base class can have subclass refrence

        Mother mother1 = new Daughter();//upCasting
        String s = "fakulke";
        Object o = "kala";//upcasting
        Object o1;
        o1 = new Mother();//upcasting
    }
}


class Mother{

}
class Daughter extends Mother{

}