package Calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.hamcrest.Matcher;

public class Calculator extends JFrame{

	private JPanel pane, calcPane, EntryPane;
	private JLabel label;
	private JButton[] buttons;
	private JTextField display;
	private String[] buttonEntry = { "7", "8", "9", "C", "4", "5", "6","*", "1", "2", "3","-", "0", ".", "+", "="};
	
	public Calculator() {
		pane = new JPanel();
		calcPane = new JPanel();
		EntryPane = new JPanel();
		
		pane.setLayout(new BorderLayout());
		calcPane.setLayout(new GridLayout(4,4));
		EntryPane.setLayout(new BorderLayout());
		
		label = new JLabel("Caclulator");
		buttons = new JButton[buttonEntry.length];
		display = new JTextField();
	}

	public void startup() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(400, 400));
		
		setUpInterface();
		addAction(new Listener());
		
		this.add(pane);
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	private void setUpInterface() {
		setEntry();
		pane.add(EntryPane, BorderLayout.NORTH);
		calcInterface();
		pane.add(calcPane, BorderLayout.CENTER);
		
	}
	
	private void setEntry() {
		label.setPreferredSize(new Dimension(200, 50));
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);

		EntryPane.add(label, BorderLayout.NORTH);
		 display.setEditable(false);
		display.setPreferredSize(new Dimension(100, 50));
		EntryPane.add(display, BorderLayout.SOUTH);
	}

	private void calcInterface() {
		for(int i = 0; i < buttonEntry.length; i++) {
			buttons[i] = new JButton(buttonEntry[i]);
			buttons[i].setPreferredSize(new Dimension(70, 50));
			calcPane.add(buttons[i]);
		}
	}

	private void addAction(ActionListener listener) {
		for(int i = 0; i < buttonEntry.length; i++) {
			buttons[i].setActionCommand(buttonEntry[i]);
			buttons[i].addActionListener(listener);
		}
	}
	
	public static String[] splitByArithmeticOperators(String input) {
		//Pattern pattern = Pattern.compile("\\d+|\\+|\\*|/|-"); this one calculates without the . 
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+|\\+|\\*|/|-");

		java.util.regex.Matcher matcher = pattern.matcher(input);

		List<String> tokens = new ArrayList<>();

		while (matcher.find()) {
			tokens.add(matcher.group());
		}

		return tokens.toArray(new String[0]);
	}

	public String calculate(String expression) {
		String[] arr = splitByArithmeticOperators(expression);
		return Double.toString(calc(arr, 0));
	}
	
	private double calc(String[] arr, int ind) {
		if(ind >= arr.length-1) {
			return Double.parseDouble(arr[arr.length-1]);
		}
		
		switch(arr[ind+1]) {
		case "+": 
			return Double.parseDouble(arr[ind]) + calc(arr, ind+2);
		case "-":
			return Double.parseDouble(arr[ind]) - calc(arr, ind+2);
		case "/": 
			return Double.parseDouble(arr[ind]) / calc(arr, ind+2);
		case "*": 
			return Double.parseDouble(arr[ind]) * calc(arr, ind+2);
		
		}
		return 0;
	}
	
	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			
			switch(action) {
			case "=":
				display.setText(calculate(display.getText()));
				break;
			case "C": 
				display.setText("");
				break;
				default: 
					display.setText(display.getText() + action);
			}
		}
		
	}
}
