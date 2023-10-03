package Week3.inClass;
public class Factory extends Building{
	protected int amountOfMachinery;
	protected double size;

	protected boolean turnOnAssembly(boolean start)
	{
		System.out.println("Factory:turnOnAssembly("+start+")");
		return true;
	}	
}
