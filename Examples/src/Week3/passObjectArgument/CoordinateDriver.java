package Week3.passObjectArgument;

public class CoordinateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coordinate obj1 = new Coordinate(5,5);
		Coordinate obj2 = new Coordinate(10,10);
		Coordinate obj3 = new Coordinate(1,1);
		
		String desc1 = obj1.toString();
		System.out.println("Object 1#" + desc1);
		
		String desc2 = obj2.toString();
		System.out.println("Object 2#" + desc2);
		
		String desc3 = obj3.toString();
		System.out.println("Object 3#" + desc3);
		
		obj3.addCoordinate(obj1, obj2);
		
		String desc4 = obj3.toString();
		System.out.println("Object 3(After Adding Obj1 and Obj2)#" + desc4);

	}

}
