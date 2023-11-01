package Peer;

public class Cabbage {
	private double weight; 
	private double costPerKg;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCostPerKg() {
		return costPerKg;
	}
	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	} 
	public Cabbage() {
		this(0,0);
	}
	public Cabbage(double weight, double costPerKg) {
		this.weight = weight;
		this.costPerKg = costPerKg;
	}
	public double calcPrice() {
		return weight * costPerKg; 
	}
	
}
