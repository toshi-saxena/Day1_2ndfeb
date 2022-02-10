package io.sevenx.dekhovehicle;

import java.sql.SQLException;

import java.util.List;


import io.sevenx.dekhovehicle.data.Bike;
import io.sevenx.dekhovehicle.data.Car;
import io.sevenx.dekhovehicle.data.Vehicle;
import io.sevenx.dekhovehicle.database.VehicleDataBase;
import io.sevenx.dekhovehicle.display.VehicleDisplay;
import io.sevenx.dekhovehicle.xml.VehicleXml;


public class DekhoVehicleMain {
	public static void main(String[] args) throws SQLException{
		
	
		String path="file:home\\tushar\\eclipse-workspace\\DekhoVehicle2\\src\\io\\sevenx\\dekhovehicle\\xml\\vehicle.xml";
		List<Vehicle> vehicle=VehicleXml.parser(path);
		VehicleDataBase.valueInDataBase(vehicle);
		List<Vehicle> vehicleList=VehicleDataBase.extractFromDataBase();
		VehicleDisplay.display(vehicleList);
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
		System.out.println("Output Of tostring");
		System.out.println("*********************************************");
		System.out.println(car);
		System.out.println(bike);
		System.out.println("**********************************************");
		/*List<Vehicle> vehicle=new ArrayList<Vehicle>();
		vehicle.add(bike);
		vehicle.add(car);
		VehicleDisplay.display(vehicle);*/
		
	}
	
	
	

}
