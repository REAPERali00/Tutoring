package LabExam;

import java.util.ArrayList;
import java.util.List;

public class VehicleDriver {
	private static List<Vehicle> vehicleList = new ArrayList<>();
	
	public static void instantiate () {
		vehicleList.add(new LandVehicle("Toyota", "Camery", 2002, "L/V", 180));
		vehicleList.add(new LandVehicle("Honda", "CRV", 2022, "L/V", 220));
		vehicleList.add(new WaterVehicle("Mitsubishi", "Turbo", 2009, "W/V", 18));
		vehicleList.add(new WaterVehicle("Nissan", "Patrol", 2013, "W/V", 20));
	}
	
	public static void print() {
		for(Vehicle v: vehicleList)
			v.printDetails();
	}
	
	public static void main(String[] args) {
		instantiate(); 
		print();
	}

}
