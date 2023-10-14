package Interesting;

public class AutoFunctions {
	public static void runnable() {
		Runnable[] runnableArray = { 
				() -> System.out.println("Function 1 executed"),
				() -> System.out.println("Function 2 executed") };
		runnableArray[0].run();
		for (Runnable runnable : runnableArray) {
			runnable.run();
		}

	}
	
	
	public static void main(String[] args) {
		runnable();
	}

}
