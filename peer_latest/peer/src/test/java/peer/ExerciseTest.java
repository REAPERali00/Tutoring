package peer;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ExerciseTest {

  private Exercise exercise;
  private HashMap<String, Double> customHistory;

  @Before
  public void setUp() {
    exercise = new Exercise();
    customHistory = new HashMap<>();
    customHistory.put("Yoga", 200.0);
    customHistory.put("Pilates", 250.0);
  }

  @Test
  public void testGetCaloriesValidExercise() throws Exception {
    double caloriesBurned = exercise.getCalories("Running", 2);
    assertEquals(1400, caloriesBurned, 0);
  }

  @Test
  public void testGetCaloriesInvalidExercise() {
    try {
      exercise.getCalories("Dancing", 1);
      fail("Expected an Exception to be thrown");
    } catch (Exception e) {
      assertEquals("Damn, is that exercise a thing? I have no clue how many calories your burning", e.getMessage());
    }
  }
}
