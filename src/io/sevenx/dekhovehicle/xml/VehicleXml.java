package io.sevenx.dekhovehicle.xml;
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import io.sevenx.dekhovehicle.data.*;

public class VehicleXml {
	public static List<Vehicle> parser(String path){
		File file=new File(path);
		JAXBContext jaxbContext;
		try {
			jaxbContext=JAXBContext.newInstance(Vehicle.class);
			
			Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
			Vehicles vehicles=(Vehicles)jaxbUnmarshaller.unmarshal(file);
			List<Vehicle> vehicle=vehicles.getVehicle();
			
			return vehicle;
		}catch (JAXBException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
		
	}
	

}
