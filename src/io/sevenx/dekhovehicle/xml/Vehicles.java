package io.sevenx.dekhovehicle.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import io.sevenx.dekhovehicle.data.Vehicle;
@XmlRootElement
public class Vehicles {
	private List<Vehicle> vehicles;
	public List<Vehicle> getVehicle(){
		
		return vehicles;
	}
	public void setVehicle(List<Vehicle> vehicles) {
		this.vehicles=vehicles;
		
	}
	

}
