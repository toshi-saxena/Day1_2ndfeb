package io.sevenx.dekhovehicle.display;
import java.util.List;

import io.sevenx.dekhovehicle.data.Vehicle;
import io.sevenx.dekhovehicle.data.*;

public class VehicleDisplay{
	public static void display(List<Vehicle> vehicle) {
		for (Vehicle vehicles: vehicle) {
			System.out.println("Brand: "+ vehicles.getBrand());
			System.out.println("Model: "+vehicles.getModel());
			System.out.println("Color: " + vehicles.getColor());
			System.out.println("Mileage: "+vehicles.getMileage());
			System.out.println("Fuel Type: "+vehicles.getFuel());
			System.out.println("Maximum Speed: "+vehicles.getMaximumSpeed());
			System.out.println("Transmission: "+vehicles.getTransmission());
			System.out.println("Brake Type: "+vehicles.getBrake());
			System.out.println("Type of Vehicle: "+vehicles.getBodyType());
			if(vehicles instanceof Bike) {
				Bike bike=(Bike) vehicles;
				System.out.println("Gear: "+bike.getNumberOfGear());
				
			}
			else if(vehicles instanceof Car) {
				Car car=(Car)vehicles;
				System.out.println("Power: "+car.getPower());
			}
			
		}
		
	}
}
