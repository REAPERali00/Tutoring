package game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Viewer class, displays the GUI elements 
 * @author Alireza Jadidi
 * Date: 9/11/2022
 * 
 *
 */
public class GameView extends JFrame{
	
	/**
	 * Panels of the frame
	 * pane: main panel 
	 * board: the game pad(grid)
	 * field: used for the CardLayout design 
	 * pad: contains the design options 
	 */
	private JPanel pane, board, field, pad;
	
	/**
	 * buttons for the board
	 */
	private JButton[] button;
	
	/**
	 * buttons to set the text and randomize the order 
	 */
	private JButton random, set;
	
	/**
	 * Menu bar of the frame, contains settings and store 
	 */
	private JMenuBar menu;
	/**
	 * Menu Item, switch between Play mode and Design mode by selecting it 
	 */
	private JMenuItem gameMode = new JMenuItem("Play/Design");
	/**
	 * checks which mode is currently selected 
	 */
	private boolean checkMode = false; 
	
	/**
	 * options for the dimension
	 */
	Integer[] dimOptions = {3,4,5};

	/**
	 * Combo box used to dynamically update the Board size 
	 */
	private JComboBox<Integer> dimension = new JComboBox<Integer>(dimOptions);
	
	/**
	 * used to switch between numeric and text entry in design mode 
	 */
	private JComboBox<String>cb;
	/**
	 * the text field used to receive text from user 
	 */
	private JTextField setAns;
	/**
	 * the indexes of blank box and the clicked box in board 
	 */
	private int blackIndex, clicked;
	
	/**
	 * Default constructor, will create the basic game interface 
	 */
	public GameView(){
		
		pane = new JPanel();
		pane.setLayout(new BorderLayout());
		board = new JPanel();
		pad = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel name = new JLabel("Num_Puz");
		name.setFont(new Font("MV Boli", Font.BOLD, 25));
		name.setHorizontalAlignment(JLabel.CENTER);
		
		menu();
		Design(pad);
		
		pane.add(name, BorderLayout.NORTH);
		pane.add(pad, BorderLayout.SOUTH);
		
		this.setJMenuBar(menu);
		this.add(pane);
		this.setLocationByPlatform(true);
		
	}

	
	/**
	 * Finds which switch had been clicked on the board 
	 * @param e: receive the action of the button 
	 */
	public void getClickedButton(ActionEvent e) {
		for (int i = 0; i < button.length; i++)
			if(e.getSource() == button[i])
				clicked = i;	
	}
	
	/**
	 * checks if movement is possible, if not doesn't do anything. 
	 * Possible Future Update: add error message in case of wrong click 
	 * @return
	 */
	private boolean playerMove() {
		int possibility = Math.abs(blackIndex - clicked), dim = (Integer)dimension.getSelectedItem();
		
		if (possibility > dim || ((clicked+1) % dim == 0 && blackIndex == clicked+1))
			return false;
		if(possibility == 1 || possibility % dim ==0)
			return true;

		return false; 
	}
	
	/**
	 * swaps the clicked button and the blank one 
	 */
	private void swapButtons() {
		button[blackIndex].setText(button[clicked].getText());
		button[blackIndex].setEnabled(true);
		button[blackIndex].setBackground(Color.LIGHT_GRAY);
		setBlack(button[clicked]);
		blackIndex = clicked;
		
	}
	
	//use in model 
	/**
	 * checks the win condition: if text is same as button values (last value in board must be the blank button)
	 * @param answer: the correct saved solution in GameModel 
	 * @return returns true if win condition is met 
	 */
	public boolean winCheck(String answer) {
		
		if(blackIndex != button.length-1)
			return false; 
		
		String[] entry = answer.split("");
		
		for(int i = 0, j = 0; i < entry.length; i++, j++) 
			if(!entry[j].equals(button[i].getText()))
				return false;
		
		return true;
	}
	
	/**
	 * play mode, enables board actions 
	 * @param listener from controller
	 */
	public void Play(ActionListener listener) {
		
		if( button[button.length - 1].getAction() == null)
			setBoardAction(listener);
		
		if(!playerMove())
			return;
		
		swapButtons();
		
		
	}
	
	
	/**
	 * sets up the board buttons and entry 
	 * @param dim: sets the size of the board 
	 * @param answer: sets the values in the board, default: "12345678"
	 */
	public void setUpBoard(int dim, String answer) {
		
		//if previous board exists, remove it
		if(board.getComponentCount() != 0)
			board.removeAll();
		board.revalidate();
		board.repaint();
		
		board.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		board.setLayout(new GridLayout(dim,dim,5,5));
		button = new JButton[dim*dim];
		boardEntry(answer);	
		pane.add(board, BorderLayout.CENTER);

	}
	
	/**
	 * sets in the values into the board
	 * @param value: the answer of puzzle 
	 */
	private void boardEntry(String value) {
		
		int strLength = value.length(), buttonLength = button.length;
		String[] entry = value.split("");

		for(int i = 0, j = 0; i < buttonLength; i++, j++) {
			if(i == 0) {
				button[i] = new JButton();
				button[i].setHideActionText(false);
				setBlack(button[i]);
				j--;
				blackIndex = i;
			}
				
			else if (j < strLength)
				button[i] = new JButton(entry[j]);
			else {
				button[i] = new JButton("");
					
			}
			button[i].setPreferredSize(new Dimension(100,100));
			button[i].setFocusable(false);
			if (i != 0)
				button[i].setBackground(Color.LIGHT_GRAY);
			board.add(button[i]);
		}
	}
	
	/**
	 * randomizes the board 
	 */
	public void randomBoard() {
		int length = button.length, index1, index2;
		String temp;
		for(int i = 0; i < 10; i++) {
			index1 = (int)(Math.random()*(length-1) + 1); 
			index2 = (int)(Math.random()*(length-1) + 1);
			if(index1 != blackIndex && index2 != blackIndex) {
				temp = button[index1].getText();
				button[index1].setText(button[index2].getText());
				button[index2].setText(temp);
			}
		}
		
	}

	/**
	 * adds action listener to the board buttons, action command: "board" 
	 * @param listener: action listener in GameController
	 */
	private void setBoardAction(ActionListener listener) {
		for(int i = 0; i < button.length; i++) {
			button[i].setActionCommand("board");
			button[i].addActionListener(listener);
		}
	}
	
	/**
	 * switches between play mode and design, by hiding the pad panel containing Design 
	 */
	public void changeMode() {
		checkMode = !checkMode;
		if(checkMode)
			pad.hide();
		else
			pad.setVisible(true);
	}


	/**
	 * method adds the number, text and dimension entrance into the GUI
	 * Reference: Lab3, week 3 by Paulo Sousa 
	 * @param pane, modify the pad pane
	 */
	public void Design(Container pane) {
		
        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = {"Number", "Text"};
        cb = new JComboBox<String>(comboBoxItems);
        cb.setEditable(false);
        
        comboBoxPane.add(cb);
         
       
        JPanel num = new JPanel();
        random = new JButton("Rand");
        random.setActionCommand("rand");
        num.add(random);
        
        JLabel dimLabel = new JLabel("Dim: ");
        dimLabel.setFont(new Font("MV Boli", Font.BOLD, 15));
        dimension.setActionCommand("dim");
        num.add(dimLabel);
        num.add(dimension);
        
         
        JPanel text = new JPanel();
        setAns = new JTextField("Text: ", 20);
        text.add(setAns);
        
        set = new JButton("Set");
        set.setActionCommand("set");
        text.add(set);
       
        field = new JPanel(new CardLayout());
        field.add(num, "Number");
        field.add(text, "Text");
         
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(field, BorderLayout.CENTER);
    }

	/**
	 * adds all action listeners to the elements
	 * @param listener: from game controller
	 */
	public void addAction(ActionListener listener) {
		
		dimension.addActionListener(listener);
		if(random != null && set != null) {
			random.addActionListener(listener);
			set.addActionListener(listener);			
		}
		
		gameMode.setActionCommand("mode");
		gameMode.addActionListener(listener);
	}

	/**
	 * add all item listeners to elements 
	 * @param listener: from game controller
	 */
	public void addItem(ItemListener listener) {
		if(cb != null)
			cb.addItemListener(listener);
	}

	
	/**
	 * switches between the text and number entries 
	 * @param e: the Item Event from game controller 
	 */
	public void switchCards(ItemEvent e) {
		 CardLayout cl = (CardLayout)(field.getLayout());
	        cl.show(field, (String)e.getItem());
	}
	
	/**
	 * changes the size of board
	 * @param dim: dim from model 
	 * @param answer: answer form model 
	 */
	public void changeDim (int dim, String answer) {
		setUpBoard(dim, answer);
	}
	
	/**
	 * sets in the answer into board
	 * @param answer: form model
	 */
	public void setAnswer(String answer) {
		setUpBoard((Integer)dimension.getSelectedItem(), answer);
	}
	
	/**
	 * return text from textField 
	 * @return text in setAns 
	 */
	public String getText() {
		if(setAns == null)
			return "12345678";
		return setAns.getText();
	}
	
	/**
	 * returns the selected dimension 
	 * @return from Dimension Combo box 
	 */
	public int getDimension() {
		return (Integer)dimension.getSelectedItem();
	}
	
	/**
	 * turns the button into the blank box 
	 * @param black: the button we want to change to blank box 
	 */
	private void setBlack(JButton black) {
		black.setText(".");
		black.setEnabled(false);
		black.setBackground(Color.black);
	}
	
	
	/**
	 * Sets up the menu options 
	 */
	private void menu() {
		menu = new JMenuBar();
		
		JMenu settings = new JMenu("menu");
		JMenu store = new JMenu("Store");
		settings.add(gameMode);
		menu.add(settings);
		menu.add(store);
		
	}


}
