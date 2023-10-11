package LabExam;

public class LandVehicle extends Vehicle{
	private int speedLimit; 
	
	public LandVehicle(String make, String model, int year, String vehicleType, int speedLimit) {
		super(make, model, year, vehicleType);
		this.speedLimit = speedLimit; 
	} 
	
	@Override 
	public void printDetails() {
		super.printDetails();
		System.out.printf("%15d km/h|\n", speedLimit);
	}
	
}
