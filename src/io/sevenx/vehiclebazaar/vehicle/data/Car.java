package io.sevenx.vehiclebazaar.vehicle.data;
import io.sevenx.vehiclebazaar.vehicle.*;
public class Car extends Vehicle{
	private int horsePower;
	private String transmission;
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int hoursePower) {
		this.horsePower = hoursePower;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	

}
