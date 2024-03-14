package Peer;

public class Cabbage {
	// Instance variables, attributes:
	private double weight;
	private double costPerKg;
	public static String name;

	// Getter and setter:
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

	// Constructor: set the default values
	// Default constructor.
	public Cabbage() {
		this(0, 0);
	}

	public Cabbage(double weight, double costPerKg) {
		this.weight = weight;
		this.costPerKg = costPerKg;
	}

	// Worker Methods:
	public double calcPrice() {
		return weight * costPerKg;
	}

}
