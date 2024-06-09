package peer;

/*
 * Egg: large, medium
 * large: 5$
 * medium: 2$
 * gets number of large and medium eggs, and calculate the total cost
 * class, get, set, constructor, a method calcCost()
 */

public class Egg {
  // Instance var
  private int largeCount;
  private int mediumCount;

  public static final double LARGE_PRICE = 5.2;
  public static final double MEDIUM_PRICE = 3.89;

  public double getMediumCount() {
    return mediumCount;
  }

  public double getLargeCount() {
    return largeCount;
  }

  public void setMediumCount(int mediumCount) {
    this.mediumCount = mediumCount;
  }

  public void setLargeCount(int largeCount) {
    this.largeCount = largeCount;
  }

  public double calcPrice() {
    return largeCount * LARGE_PRICE + mediumCount * MEDIUM_PRICE;
  }

  @Override
  public String toString() {
    return String.format("Medium Count: %d\nLargeCount: %d\nTotal Cost: $%.2f", mediumCount, largeCount, calcPrice());
  }

}
