package Calendar;

public class Month {
	private int year;
	private String name; 
	private int tot_dates;
	private int start_date; 
	private Date dates[]; 
	
	public Month(String name, int tot_dates, int start_date) {
		this.name = name; 
		this.tot_dates = tot_dates; 
		dates = new Date[tot_dates]; 
		year = 2023; 
		this.start_date = start_date; 
		set_dates();
	}
	
	public void set_dates() {
		for(int i = 0; i < tot_dates; i++) {
			dates[i] = new Date(i+1);
		}
	}
	
	public int get_dig_num(int num) {
		for(int i = 1; i < 3; i++) {
			if(num / (int)Math.pow(10, i) == 0)
				return i;
		}
		return 0;
	}

	@Override
	public String toString() {
		String[] day_names = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 
		int width = 5;
		String res ="";
		int weekly = 1; 
		
		res += String.format("%s %d\n", name, year);
		for(String s: day_names)
			res += String.format("%-" +(width-1) +"s ", s);
		res+= "\n";
		for(int i = 0; i < tot_dates; ) {
			res += String.format("%-" + (width) +"s%s",start_date-- > 0?" ":dates[i++], weekly%7==0?"\n":"");
			weekly++;
		}
		res += get_reminder();
		return res; 
	}
	
	public void setReminder(int date, String msg) {
		if(date < 1 || date > 31) {
			System.out.println("Invalid Date, cannont set reminder.");; 
			return;
		}
		dates[date-1].setReminder(msg); 
	}
	
	public String get_reminder() {
		String res = "\n\nReminders: \n";
		
		for(Date date : dates) {
			res += date.get_reminder();
		}
		return res;
	}
	
	
}
