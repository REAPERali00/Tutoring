package peer;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * Exercise
 */
public class Exercise {

  private HashMap<String, Double> history;

  public Exercise() {
    history = new HashMap<>();
    injectToMap();
  }

  public Exercise(HashMap<String, Double> history) {
    this.history = history;
  }

  public void injectToMap() {
    String exerciseList[] = { "Running", "Walking", "Swimming", "Cycling" };
    double calories[] = { 700, 300, 600, 300 };
    for (int i = 0; i < calories.length; i++) {
      history.put(exerciseList[i], calories[i]);
    }
  }

  public double getCalories(String exercise, double hours) throws Exception {
    if (!history.containsKey(exercise))
      throw new Exception("Damn, is that exercise a thing? I have no clue how many calories your burning");
    return history.get(exercise) * hours;
  }

}
