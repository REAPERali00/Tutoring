package Week3.inClass;
public class House extends Building {
	protected int bedRooms;

	@Override
	protected boolean acOn(boolean switchOn)
	{
		System.out.println("House:acOn("+switchOn+")");
		return true;
	}

	protected String cleanBedrooms()
	{
		System.out.println("House:cleanBedrooms()");
		return "Done";
	}
}
