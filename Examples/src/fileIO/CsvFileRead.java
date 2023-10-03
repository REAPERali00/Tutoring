package fileIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class CsvFileRead {	
	private  static Scanner input1, input2;
	
	CsvFileRead(){		
	}	
	public static void openFile() {
		try {
			//input = new Scanner(Paths.get("C:\\Users\\chowdhr\\eclipse-java\\workspace\\CST8132\\Files\\studentInput.txt"));
			input1 = new Scanner(Paths.get(".\\.\\Files\\teacher.csv")); //Using relative path for file location		
			
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			System.err.println("Error opening file");			
		}	
		catch (IOException ioe) {
			System.err.println("ioe");					
		} 
	}	
	
	public static void readInfoFromFile(){		
		
		input1.useDelimiter("\r\n");   //sets the delimiter pattern  
		while (input1.hasNext())  //returns a boolean value  
		{  
			input2 = new Scanner(input1.next());
		    input2.useDelimiter(",");
		    String name = input2.next();
		    double weight = input2.nextDouble();		    
			System.out.println(weight);
		    System.out.println(name);
		    int year = input2.nextInt();
		    System.out.println(year);
		    
	        		
		}		
	}	

		 
	public static void closeFile() {
		if (input1 !=null)
			input1.close();
		if (input2 !=null)
			input2.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile();
		readInfoFromFile();
		closeFile();	
	}

}
