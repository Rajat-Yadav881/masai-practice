package RoomManSystem;


public class Person {
    String  name;
    String houseNo;
    ElectricalSystem electricalSystem;
    Person(){}

     Person(String name, String houseNo, ElectricalSystem electricalSystem) {
        this.name = name;
        this.houseNo = houseNo;
        this.electricalSystem = electricalSystem;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", electricalSystem=" + electricalSystem +
                '}';
    }
}
