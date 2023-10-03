package Week3.inClass;

public class Building {
	protected double size;
	protected String address;

	protected boolean openDoor(boolean key)
	{
		System.out.println("Building:openDoor("+key+")");
		return true;
	}
	
	protected boolean acOn(boolean switchOn)
	{
		System.out.println("Building:acOn("+switchOn+")");
		return true;
	}
}
