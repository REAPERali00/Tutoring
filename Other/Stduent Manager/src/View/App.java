package View;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App extends JFrame {
	private Points_page app_pane; 
	public App() {
		app_pane = new Points_page();
	}
	
	public void add_action(ActionListener listener) {
		app_pane.add_actions(listener);
	}
	public void set_points(String command) {
		String[] parts= command.split(","); 
		app_pane.add_point(Integer.valueOf(parts[0])-1, parts[1]);
	}
	
	public void start() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(400, 400));
		
		this.add(app_pane);
		
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
