package Calendar;

import java.util.Random;

public class Calendar {
	private int year; 
	private Month selected_month; 
	private Month months[]; 
	
	public Calendar(int year){
		months = new Month[12]; 
		this.year = year;
		set_months();
	}
	
	public void set_selected_month(int month_num) {
		if(month_num < 1 || month_num > 12) {
			System.out.println("Invalid month, could not set the month ");
			return;
		}
		selected_month = months[month_num-1]; 
	}
	
	private void set_months() {
		int tot_dates[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String names[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul","Aug","Sept","Oct","Nov","Dec"}; 
		for(int i = 0; i < 12; i++) {
			months[i] = new Month(names[i], tot_dates[i], get_first_date(year, i+1)-1);
		}
	}
	
	public void print_month() {
		System.out.printf("\n%s, %d\n%s", selected_month.get_name(), year, selected_month);
	}
	
	public void add_reminder(int day, String msg) {
		
		if(selected_month!=null) {
			selected_month.setReminder(day, msg);
		}
	}
	
	public int get_first_date(int year, int month) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;      // Year of the century
        int j = year / 100;      // Zero-based century

        return (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    }
	
	public void inject(int month) {
		set_selected_month(month);
		add_reminder(22, "Read a book");
		add_reminder(1, "Mark this day");
		add_reminder(3, "Study for the final exam!");
		print_month();
		set_selected_month(new Random().nextInt(11)+1);
		add_reminder(5, "Different Month");
		print_month();
	}
	

	
}
