package RoomManSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb("white");
        Fan fan1 = new Fan(3,50.0,50.6,150);
        Bulb bulb2 = new Bulb("white");
        Fan fan2 = new Fan(3,50.0,50.6,150);

        ElectricalSystem electricalSystem = new ElectricalSystem(fan1,fan2,bulb1,bulb2);
        Person person1 = new Person("rajat","45/230",electricalSystem);
        Person person2 = new Person("umesh","56/390",electricalSystem);
        Person person3 = new Person("deepak","04/045",electricalSystem);
        Person person4 = new Person("faruk","40/001",electricalSystem);


        ArrayList<Person> arr = new ArrayList<>();
        arr.add(person1);
        arr.add(person2);
        arr.add(person3);
        arr.add(person4);

        for (Person i:arr){
            System.out.println(i);
        }
    }
}
