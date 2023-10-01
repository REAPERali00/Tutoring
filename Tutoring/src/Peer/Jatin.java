package Peer;

public class Jatin {
	public static void printPatern(int n, int patern ) {
		for(int i = 0 ;i < n; i++) {
			for(int j = 0; j < n; j++) {
				switch(patern) {
				case 1: 
					if(i != 0)
						patern1(j, i, n);
					break;
				case 2:  
					patern2(j,i,n);
					break;	
				}
				
			}
			System.out.println();
		}
	}
	public static void patern1(int j, int i, int n) {
		if(j >= n -i)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	
	public static void patern2(int j, int i, int n) {
		if(j <= i)
			System.out.print(" ");
		else
			System.out.print("*");
	}
	
	/**
	 * Second way: treat each line as a string, and modify it on each print. basically
	 * add the pattern to the method on each loop round! 
	 * @param n
	 */
	public static void newWay(int n) {
		char arr[] = new char[n]; 
		for(int i = 0; i < n; i++)
			arr[i] = ' ';
//		for(int i = 0; i < n; i++) {
//			arr[i] = '*';
//			System.out.println(String.valueOf(arr));
//		}
		int i;
		for(i = 0; i < n/2; i++) {
			arr[i] = '*';
			arr[arr.length-1-i] = '*';
			System.out.println(String.valueOf(arr));
		}
		for(; i > 0; i--) {
			arr[i] = ' ';
			arr[arr.length-1-i] = ' ';
			System.out.println(String.valueOf(arr));
		}
	}
	
	public static void main(String[] args) {
		newWay(100);
	}
}
