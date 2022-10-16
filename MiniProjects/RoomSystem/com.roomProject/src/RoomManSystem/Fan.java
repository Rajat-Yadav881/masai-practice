package RoomManSystem;

public class Fan extends ElectricalSystem{
    private int baldes;
    private double wattage;
    private double speed;

    int roomArea;
    int vent;

    public Fan(int baldes, double wattage, double speed,int roomArea) {
        this.baldes = baldes;
        this.wattage = wattage;
        this.speed = speed;
        this.roomArea = roomArea;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "baldes=" + baldes +
                ", wattage=" + wattage +
                ", speed=" + speed +
                '}';
    }

    public int getBaldes() {
        return baldes;
    }
    public int Ventilation(){
        vent = (roomArea*8)/60;
        return vent;
    }
    public void setBaldes(int baldes) {
        this.baldes = baldes;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
