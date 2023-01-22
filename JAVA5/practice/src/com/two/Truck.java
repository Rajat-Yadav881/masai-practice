package com.two;

public final class Truck {
	 private final String brand;
	 private final String model;

	 public Truck(final String brand, final String model) {
	   this.brand = brand;
	   this.model = model;
	 }

	  
}
public class TruckService {

	 public void createRenaultTruck() {
	   final Truck truck = new Truck();

	   truck.setBrand("Renault");
	   truck.setModel("K380");
	   truck.putKeyInContact();
	   truck.start();

	   return truck;
	 }
	 
	 public void doSomething() {
		   final Truck truck = new Truck();
		   truck.setBrand("Renault");
		   truck.setModel("K380");

		   final Map<Truck, String> map = new HashMap<>();
		   map.put(truck, "Hello world");

		   truck.setModel("K520");

		   assert map.containsKey(truck); // returns false
	}
	  
}