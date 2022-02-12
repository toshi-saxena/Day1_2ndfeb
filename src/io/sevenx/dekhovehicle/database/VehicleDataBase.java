package io.sevenx.dekhovehicle.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;



import io.sevenx.dekhovehicle.data.Vehicle;


public class VehicleDataBase {
	public static final String url = "jdbc:mysql://127.0.0.1:3306/sevenx";
	public static final String username = "root";
	public static final String password = "Toshi@1099";
	
	
	public static void valueInDataBase(List<Vehicle> vehicleList) {
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement statement =con.createStatement();
			for(Vehicle vehicle:vehicleList) {
				statement.execute("INSERT INTO 'car'.'vehicle'('brand','model','color','fuel','mileage','bodyType','transmission','brake','maximumSpeed') VALUES ('"+
				vehicle.getBrand()+"','"+vehicle.getModel()+"','"+vehicle.getColor()+"', '"+vehicle.getFuel()+"' ,'"+vehicle.getMileage()+"','"+vehicle.getBodyType() +"','"+ vehicle.getMaximumSpeed()+"');");
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Vehicle>extractFromDataBase() throws SQLException{
		Connection con= DriverManager.getConnection(url,username,password);
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("SECELECT * FROM car.vehicle;");
		List<Vehicle> vehicle=new ArrayList<>();
		while(rs.next()) {
			Vehicle v=new Vehicle();
			v.setBrand(rs.getString(1));
			v.setModel(rs.getString(2));
			v.setColor(rs.getString(3));
			v.setFuel(rs.getString(4));
			v.setMileage(rs.getInt(5));
			v.setBodyType(rs.getString(6));
			v.setMaximumSpeed(rs.getInt(7));
			
			vehicle.add(v);
			
		}
		
		return vehicle;
	}

}
