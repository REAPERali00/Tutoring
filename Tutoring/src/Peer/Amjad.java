package Peer;

public class Amjad implements Starting{
	
	/**
	 * 1. variables: Primitive, Reference. 
	 * 	  Primitve: 
	 *    byte, short, int, long: 0, 1, 2, -1, ...
	 *    float, double: 12.2, -1.0, 0.0, ... 
	 *    char: '1','a', 'A', '#', ...
	 *    boolean: true, false
	 *    2. Methods? return type, name, parameter. 
	 *    3. Classes (Reference): Instance variables, getters and settrs, constroctures (default and non default) 
	 *    	 worker methods (anything else) 
	 *    
	 *    4. Control statements 
	 *    5. loops 
	 *    6. arrays. 
	 *    
	 */
	@Override
	public void start() {
		//Declaration: type + name. 
		int num = 312312312;
		
		System.out.println(num);
		some_name(modify_string("Ali"));
		Cabbage cabbage = new Cabbage(12,12); 
		//cabbage.setWeight(13); 
		System.out.println(cabbage.calcPrice());
	}
	
	public String modify_string(String name) {
		return name + " added value"; 
	}
	public void some_name (String name) {
		System.out.println("Hello " + name);
	}

}
