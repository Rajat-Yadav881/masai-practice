package RoomManSystem;

public class ElectricalSystem extends Person{

   private Fan fan1;

   private Fan fan2;

   private Bulb bulb1;

   private Bulb bulb2;
   ElectricalSystem(){}

   ElectricalSystem(Fan fan1,Fan fan2,Bulb bulb1,Bulb bulb2){

      this.bulb1 = bulb1;
      this.bulb2 = bulb2;
      this.fan1 = fan1;
      this.fan2 = fan2;
   }

   public Fan getFan1() {
      return fan1;
   }

   public void setFan1(Fan fan1) {
      this.fan1 = fan1;
   }

   public Fan getFan2() {
      return fan2;
   }

   public void setFan2(Fan fan2) {
      this.fan2 = fan2;
   }

   public Bulb getBulb1() {
      return bulb1;
   }

   public void setBulb1(Bulb bulb1) {
      this.bulb1 = bulb1;
   }

   public Bulb getBulb2() {
      return bulb2;
   }

   public void setBulb2(Bulb bulb2) {
      this.bulb2 = bulb2;
   }

   @Override
   public String toString() {
      return "ElectricalSystem{" +
              "fan1=" + fan1 +
              ", fan2=" + fan2 +
              ", bulb1=" + bulb1 +
              ", bulb2=" + bulb2 +
              '}';
   }
}
