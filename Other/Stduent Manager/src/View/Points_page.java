package View;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Points_page extends JPanel{
	private ArrayList<Student_Display> students = new ArrayList<>(); 
	
	public Points_page() {
		
		inject();
		set_pane();
		
	}
	
	public void set_pane() {
		this.removeAll();
//		int gridDimension = (int) Math.ceil(Math.sqrt(students.size())); // Update grid dimension
		int gridDimension = students.size(); // Update grid dimension

		this.setLayout(new GridLayout(gridDimension, gridDimension, 5,5));
		for(JPanel panel : students)
			this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public void inject() {
		String smt[] = {"John", "Ali", "Sara", "Amir"}; 
		for(String s : smt) add_student(s);
	}
	
	public void add_student(String name) {
		students.add(new Student_Display(name));
	}

	public void add_actions(ActionListener listener) {
		for(Student_Display std : students) {
			std.add_actions(listener);
		}
	}
	
	public void add_point(int ind, String points) {
		students.get(ind).set_points(points);
	}
	
}
