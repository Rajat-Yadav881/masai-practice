package RoomManSystem;

public class Bulb extends ElectricalSystem{
    String color = "white";

    Bulb(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bulb{" +
                "color='" + color + '\'' +
                '}';
    }
}
