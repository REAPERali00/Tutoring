package Calendar;

public class Date {
	private int day; 
	private boolean set_rem; 
	private String msg; 
	private String[] noun = {"st", "nd", "rd"};
	
	public Date(int day) {
		if(day < 1 || day > 31)
			this.day = -1;
		else
			this.day = day;
		set_rem = false;
	}
	
	@Override
	public String toString() {
		return String.format(set_rem ? "[%d]" : "%d", day);
	}
	public int getDay() {
		return day;
	}
	
	public String get_reminder() {
		String res = ""; 
		if(set_rem)
			res += String.format("- %d%s: %s\n", day, day%10 <= 3? noun[day%10-1] : "th", msg);
		return res;
	}
	
	public boolean setReminder(String msg) {
		if(set_rem)
			return false;
		set_rem = true; 
		this.msg =msg; 
		return true;
	}
	
	
}
