
public class Cabbage {
	private double weight; 
	private double cost;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Cabbage() {
		this(0,0);
	}
	public Cabbage(double weight, double cost) {
		this.weight = weight;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Cabbage [weight=" + weight + ", cost=" + cost + "]";
	} 
	
}
