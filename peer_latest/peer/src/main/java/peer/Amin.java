package peer;

import java.util.Scanner;

/**
 * Amin
 */
public class Amin {

  private static Scanner input = new Scanner(System.in);

  /**
   * 0. Eclipse, and how to work 1. variables
   *
   */
  /*
   * Exercise project: asks the user for the hours worked out
   * calculates the calories burnt
   */
  public void studentBasics() {
    Student student = new Student();
    Student student2 = new Student();
    student2.setId(13);
    System.out.println();
  }

  public void run() {
    exerciseRunner();
  }

  public void exerciseRunner() {
    Exercise exercise = new Exercise();
    String exerciseName = "";
    double hours = 0;
    System.out.print("Hey there! please enter the name of your exercise: ");
    exerciseName = input.nextLine();
    System.out.print("How many hours did you work out? ");
    hours = input.nextDouble();
    try {
      System.out.printf("you burned %.2f calories! good job!", exercise.getCalories(exerciseName, hours));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    input.close();
  }
}
