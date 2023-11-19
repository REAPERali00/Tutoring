package View;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

import Models.Student;

public class Student_Display extends JPanel{
	private JButton[] points_button = new JButton[3];
	private JLabel stud_property_display; 
	private Student student;
	
	public Student_Display(String name) {
		student = new Student(name);
		stud_property_display = new JLabel();
		
		stud_property_display.setFont(new Font("Tahoma",Font.PLAIN ,12));
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));
		
		update_label();
		add_toPane();
		
	} 
	
	private void add_toPane() {
		this.add(stud_property_display);
		create_point_buttons();
	}
	
	private void create_point_buttons() {
		String[] point_display = {"+1", "+5", "+10"};
		for(int i = 0; i < points_button.length; i++) {
			points_button[i] = new JButton(point_display[i]);
			this.add(points_button[i]);
		}
	}
	
	private void set_points(int button_ind) {
		double point = Double.valueOf(points_button[button_ind].getText());
		student.increment_points(point);
	}
	
	public void set_points(String command) {
		double point = Double.valueOf(command);
		student.increment_points(point);
		update_label();
	}
	
	private void update_label() {
		stud_property_display.setText(student.toString());
		this.revalidate();
		this.repaint();
	}
	

	public void add_actions(ActionListener listener) {
		for(JButton button : points_button) {
			button.setActionCommand(String.format("%d,%s",student.getId(),button.getText()));
			button.addActionListener(listener);
		}
	}
}
