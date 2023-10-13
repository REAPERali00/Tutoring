package LabExam;

public class Vehicle {
	
	private String make; 
	private String model; 
	private int year; 
	private String vehicleType;
	 
	public Vehicle() {
		this("Not Implemented", "Not Implemented",0,"Not Implemented");
	}
	
	public Vehicle(String make, String model, int year, String vehicleType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.vehicleType = vehicleType;
	} 
	
	public void printDetails() {
		System.out.printf("%6s|%6s|%6s|%6d|", vehicleType, make, model, year);
	}
	

}
