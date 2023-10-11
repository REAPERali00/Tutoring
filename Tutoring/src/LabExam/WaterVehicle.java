package LabExam;

public class WaterVehicle extends Vehicle{
	private int boatCapacity; 
	
	public WaterVehicle(String make, String model, int year, String vehicleType, int boatCapacity) {
		super(make, model, year, vehicleType);
		this.boatCapacity = boatCapacity; 
	} 
	
	@Override 
	public void printDetails() {
		super.printDetails();
		/**
		 * int: %d
		 * String: %s
		 * double/float: %f
		 */
		System.out.printf("%6d person limit|\n", boatCapacity);
	}
}
