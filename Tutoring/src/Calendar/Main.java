package Calendar;

public class Main {

	public static void main(String[] args) {
		Month month =new Month("October", 31, 5);
		month.setReminder(22, "You got to walk today!");
		month.setReminder(4, "Do home work");
		System.out.println(month.toString());

	}

}
