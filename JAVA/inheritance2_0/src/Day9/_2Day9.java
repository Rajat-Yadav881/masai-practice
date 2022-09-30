package Day9;

public class _2Day9 {
    public static void main(String[] args) {
        Object object;
        Myclass myclass = new Myclass();
        System.out.println(myclass);
        //what heppens when we print object
        //toString method is used.
    }
}
class Myclass extends Object{
    String message = "How have you bean?";
    @Override
    public String toString(){
        return message;
    }
}

