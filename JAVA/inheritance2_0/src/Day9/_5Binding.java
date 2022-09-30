package Day9;

public class _5Binding { // aka==as known ass
    //2 types of polymorphism
    ///overloading is the complile time polymor aka static method binding
    //overriding aka runtime polymor binding
    void one(String a){

    }
    void one(int s){

    }

    public static void main(String[] args) {
        _5Binding bind = new _5Binding();
        bind.one("rajat");//it will know at complite time
    }
}
