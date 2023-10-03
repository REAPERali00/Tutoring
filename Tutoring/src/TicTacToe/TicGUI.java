package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TicGUI extends JFrame{
	private JPanel pane, game; 
	private JButton buttons[]; 
	private JLabel label; 
	private int dim;
	private int counter;
	Font font = new Font("Monaco", Font.BOLD, 16); 

	private String[] player = {"X", "O"};
	private Color[] colors = {Color.darkGray, Color.LIGHT_GRAY};
	private int turn;
	private String[] board; 

	public TicGUI(){
		dim = 3;
		turn = 0;
		counter = 0;
		board = new String[dim*dim];
		pane = new JPanel(new BorderLayout());
		game = new JPanel(new GridLayout(dim,dim));
		label = new JLabel("Tic Tac To");
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(300,300));

		setInterface();

		this.add(pane);
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}
	private void setInterface() {
		label.setFont(font);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		pane.add(label, BorderLayout.NORTH);
		setGame();
		addAction(new Listener());
		pane.add(game, BorderLayout.CENTER);
	}

	private void setGame() {
		buttons = new JButton[dim*dim];
		for(int i = 0; i < dim*dim; i++) {
			board[i] = "";
			buttons[i] = new JButton();
			buttons[i].setFocusable(false);
			game.add(buttons[i]);
		}
	}

	private void addAction(ActionListener listener) {
		for(int i = 0; i < dim*dim; i++) {
			buttons[i].setActionCommand(Integer.toString(i));
			buttons[i].addActionListener(listener);
		}
	}

	private void playerMove(int ind) {
		if(ind < 0 || ind >= dim*dim)
			return;
		if(buttons[ind].getText() == "") {
			board[ind] = player[turn];
			buttons[ind].setBackground(colors[turn]);
			buttons[ind].setText(player[turn++]);
			turn %= 2;
			counter++;
		}
	}
	public boolean checkTie() {
		return counter  >= 9;
	}	
	private boolean checkWin() {

		for (int i = 0; i < dim; i++) {
			if (board[i * dim].equals(board[i * dim + 1]) && board[i * dim + 1].equals(board[i * dim + 2])
					&& !board[i * dim].isEmpty()) {
				return true;
			}
			if (board[i].equals(board[i + dim]) && board[i + dim].equals(board[i + 2 * dim]) && !board[i].isEmpty()) {
				return true;
			}

		}
		if (board[0].equals(board[4]) && board[4].equals(board[8]) && !board[0].isEmpty()) {
			return true;
		}
		if (board[2].equals(board[4]) && board[4].equals(board[6]) && !board[2].isEmpty()) {
			return true;
		}
		return false;
	}

	private void reset() {
		for (int i = 0; i < dim * dim; i++) {
			board[i] = "";
			buttons[i].setText("");
			buttons[i].setBackground(null);
			buttons[i].setEnabled(true);
		}
		turn = 0;
		counter = 0;
	}

	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int actionInd = Integer.parseInt(e.getActionCommand());
			playerMove(actionInd);		
			if(checkWin()) {
				turn++;
				turn %= 2;
				int result = JOptionPane.showConfirmDialog(TicGUI.this,
						"Player " + player[turn] + " wins!\nDo you want to play again?", "Game Over",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					reset();
				}
				else {
					System.exit(0);
				}
			}
			else if(checkTie()) {
				int result = JOptionPane.showConfirmDialog(TicGUI.this,
						"Its a Tie!\nDo you want to play again?", "Game Over",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					reset();
				}
				else {
					System.exit(0);
				}
			}

		}

	}
}
