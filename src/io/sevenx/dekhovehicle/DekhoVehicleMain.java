package io.sevenx.dekhovehicle;
import java.util.ArrayList;
import java.util.List;

import io.sevenx.dekhovehicle.data.Bike;
import io.sevenx.dekhovehicle.data.Car;
import io.sevenx.dekhovehicle.data.Vehicle;
import io.sevenx.dekhovehicle.display.VehicleDisplay;

public class DekhoVehicleMain {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setBrand("Royal Enfild");
		bike.setModel("Continental GT");
		bike.setColor("Black");
		bike.setMileage(35);
		bike.setFuel("Petrol");
		bike.setMaximumSpeed(110);
		bike.setTransmission("Manual");
		bike.setBrake("ABS");
		bike.setBodyType("SuperBike");
		
		bike.setNumberOfGear(5);
		
		Car car = new Car();
		car.setBrand("Audi");
		car.setModel("A-8");
		car.setColor("Black");
		car.setFuel("petrol");
		car.setMileage(15);
		car.setBodyType("SUV");
		car.setTransmission("Automatic");
		car.setBrake("Disc");
		car.setMaximumSpeed(150);
		
		car.setPower(2000);
		
		List<Vehicle> vehicle=new ArrayList<Vehicle>();
		vehicle.add(bike);
		vehicle.add(car);
		VehicleDisplay.display(vehicle);
		
		
	
		
		
	}
	
	
	

}
