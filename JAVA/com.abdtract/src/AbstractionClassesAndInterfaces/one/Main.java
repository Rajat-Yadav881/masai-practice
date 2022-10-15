package AbstractionClassesAndInterfaces.one;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class shape {
    String color;

    //these are the abstract methods
    abstract double area();
    public abstract String toString();

    public shape(String color){
        System.out.println("shape constructor called");
        this.color = color;
    }

    //this is the concrete class
    public String getColor(){
        return color;
    }
}

class circle extends shape{
    double radius;
    public circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString(){
        return "hello "+super.getColor()+" and "+area();
    }
}
class rectangle extends shape{
    double length;
    double width;

    public rectangle(String color,double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length*width;
    }
    @Override
    public String toString(){
        return "Rectangle color is "+super.getColor()+" and area is : "+area();
    }

}
public class Main {
    public static void main(String[] args) {
        shape s1 = new circle("green",65.45);
        shape s2 = new rectangle("blue",34.675,78.98989);

        List<shape> sc = new ArrayList<>();
        sc.add(s1);
        sc.add(s2);

        Iterator<shape> iter = sc.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}