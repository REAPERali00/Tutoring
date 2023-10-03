package fileIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class TextFileRead {	
	private static Scanner input;	
	TextFileRead(){		
	}	
	public static void openFile() {
		try {
			//input = new Scanner(Paths.get("C:\\Users\\chowdhr\\eclipse-java\\workspace\\CST8132\\Files\\studentInput.txt"));
			input = new Scanner(Paths.get(".\\.\\Files\\studentInput.txt")); //Using relative path for file location		
			
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			System.err.println("Error opening file");			
		}	
		catch (IOException ioe) {
			System.err.println("ioe");					
		} 
	}	
	public static void readInfoFromFile(){
		while (input.hasNext()){
			System.out.println(input.nextInt() + " " + input.next() + " " +input.next() + " " +input.nextDouble());
		}
	}	
	public static void closeFile() {
		if (input !=null)
			input.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile();
		readInfoFromFile();
		closeFile();	
	}

}
