package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.App;

public class Controller {
	private App app; 
	
	public Controller() {
		app = new App();
	}
	
	public void start() {
		app.start();
		app.add_action(new Listener());
	}

	class Listener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			app.set_points(e.getActionCommand());
			
		}
		
	}
}
