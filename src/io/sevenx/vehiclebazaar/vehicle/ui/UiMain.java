package io.sevenx.vehiclebazaar.vehicle.ui;
import io.sevenx.vehiclebazaar.vehicle.data.*;
import io.sevenx.vehiclebazaar.vehicle.*;
public class UiMain {
	public static void main(String[] args) {
		
		/*Vehicle v[]=new Vehicle();
		for (Vehicle vehicle : v) {*/
		Vehicle vehicle=new Vehicle();
		Bike b=new Bike();
		b.setBrand("Royal Enfild");
		b.setModel("Continental GT");
		b.setColor("Black");
		b.setMileage(35);
		b.setTypeOfFuel("Petrol");
		b.setMaximumSpeed(110);
		
		System.out.println("The Brand of Vehicle is:"+b.getBrand()+" Model of Bike is:"+b.getModel()+"Color is:"+b.getColor());
		System.out.println("The Mileage is"+b.getMileage()+"Maximum Speed"+b.getMaximumSpeed());
		System.out.println("The Type of Fuel is:"+b.getTypeOfFuel());
		System.out.println("----------------------------------------------");
		
		Car c=new Car();
		c.setBrand("Audi");
		c.setModel("A8");
		c.setColor("Red");
		c.setMileage(22);
		c.setTypeOfFuel("Petrol");
		c.setMaximumSpeed(145);
		
		System.out.println("The Brand of Vehicle is :"+c.getBrand()+"Model of Car is:"+c.getModel()+"Color is:"+c.getColor());
		System.out.println("The Milage of Car is "+c.getMileage()+"Maximum Speed is:"+c.getMaximumSpeed());
		System.out.println("The type of Fuel is:"+c.getTypeOfFuel());
		System.out.println("----------------------------------------------");
		if(vehicle instanceof Bike) {
			Bike bike=(Bike)vehicle;
			bike.setNumberOfGear(5);
			bike.setPower(350);
			System.out.println("Bike has "+bike.getNumberOfGear()+" gear");
			System.out.println("Engine is "+bike.getPower()+"cc");
			System.out.println("----------------------------------------------");
		}
		else if (vehicle instanceof Car) {
			Car car=(Car)vehicle;
			car.setHorsePower(740);
			car.setTransmission("Automatic");
			System.out.println("Transmission of Car is"+car.getTransmission());
			System.out.println("Engine has"+car.getHorsePower()+"horsepower");
			System.out.println("----------------------------------------------");
		}
		
		
	}

}
