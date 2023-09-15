package A2;

public class MetalRod {
	private static final double EPSILON = 0.002;
	private static final double TARGET_LENGTH = 5.55;
	private int totalRods; 
	private int successCount;
	private String[] print = {"This rod is within tolerance", "This rod is not within tolerance"};
	
	public void checkValidity(double rod) {
		int ind = 0;
		totalRods++;
		if(Math.abs(rod-TARGET_LENGTH) >EPSILON)
			ind++;
		else
			successCount++;
		System.out.println(print[ind]);
	}
	public void printSuccessRate() {
		System.out.printf("%.0f Percent of the rods entered so far has been within the tolerance\n", (successCount * 1.0/totalRods)*100);
	}
}
