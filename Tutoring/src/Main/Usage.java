package Main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import TicTacToe.TicGUI;
import TicTacToe.TicTacToe;
import Calculator.Calculator;
import Calendar.Calendar;
import Exercise.Exercise;
import Guess_number.Guess;
import HangMan.HangMan;
import Weekly.RPS;
public class Usage {
	
	private String[] options = {"Tic Tac To Game (CommandLine)", "Calculator", "Window", 
			"Print X", "Tic Tac To (GUI)", "Exercise","Guessig game","rock_paper_scissor","Calendar","Hang Man", "Exit"};

	public Scanner scan = new Scanner(System.in);
	
	private Runnable[] exe = {
		()->tic(0), 
		()->calc(),
		()->window(),
		()->printX(),
		()->tic(1),
		()->exercise(),
		()->new Guess().start(),
		()->new RPS().game(),
		()->new Calendar(2023).inject(1),
		()-> new HangMan().start(),
		()->System.exit(0),
		()->System.out.println("Option to be implemented. ")
	};
	
	public void menu() {
		int i = 0;
		System.out.print("Choose an option to run: ");
		for(i = 0; i < options.length; i++) {
			System.out.printf("\n%d.%s", i+1, options[i]);
		}
		System.out.println();
		try {
			execMenu(scan.nextInt());
		}catch(InputMismatchException e) {
			System.out.println("Wrong input type. try again.");
			scan.next();
			menu();
		}
		
	}
	
	public void execMenu(int i) {
		if(i > options.length ||  i < 1) {
			exe[exe.length-1].run();
			menu();
		}
		exe[i-1].run();
		menu();
	}
	
	public void execMenu1(int i) {
		if (i == options.length)
			return;
		switch (i) {
		case 1:
			tic(0);
			break;
		case 2:
			calc();
			break;
		case 3:
			window();
			break;
		case 4:
			printX();
			break;
		case 5: 
			tic(1);
			break;
		case 6: 
			exercise();
			break;
		default:
			System.out.println("Options is yet to be implemented");
		}
		menu();
	}
	
	public void exercise() {
		Exercise exc = new Exercise(); 
		exc.registery("running", 150);
		exc.inquiry(scan);
	}
	
	public void tic(int i) {
		if (i == 0) {
			TicTacToe tic = new TicTacToe();
			tic.dumbyMain(scan);
		}
		else {
			new TicGUI().start();
		}
		
	}
	
	public void calc() {
		new Calculator().startup();
	}
	
	public void window() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Please Enter something: ");
		JButton button = new JButton("Click here");
		JTextField text = new JTextField();
		JTextArea console = new JTextArea();
		console.setEditable(false);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		panel.setLayout(new FlowLayout());
		text.setSize(new Dimension(100, 100));
		text.setText("Enter here...");
		console.setSize(new Dimension(100, 100));

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(text.getText());
			}

		});

		panel.add(label);
		panel.add(text);
		panel.add(button);
		panel.add(console);

		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null);

	}
	

	// write a function, drawX, that takes an int
	// as a parameter and prints a diagonal cross
	// of that height, so if the parameter is 10, it prints:
		
	public void printX() {
		int n = 10;
		for(int i =0; i <= n ;i++) {
			for(int j = 0; j <= n; j++) {
				if(i == n/2)
					i++;
				if(j == i || j == n-i)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

	
}
