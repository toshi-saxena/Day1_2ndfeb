package io.sevenx.vehicledekho;
import io.sevenx.vehicledekho.vehicle.*;
import io.sevenx.vehicledekho.vehicleinfo.*;


public class VehicleDekhoMain {

	public static void main(String[] args) {
		VehicleInfoBike bike=new VehicleInfoBike();
		bike.twoWheeler("Bullet");
		bike.setGear(4);
		bike.setType("fuel");
		System.out.println("Number of Gear"+bike.getGear());
		System.out.println("Type of Bike is :"+ bike.getType());

		VehicleInfoCar car=new VehicleInfoCar();
		car.fourWheeler("Audi");
		car.setCarBody("Sedan");
		car.setFuel("Petrol/Diesel");
		System.out.println("The type of car is :"+car.getCarBody());
		System.out.println("Types of fuel available:"+car.getFuel());
				
	}
}
