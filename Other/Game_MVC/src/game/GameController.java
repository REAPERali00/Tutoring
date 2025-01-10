package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Controls all the actions in game, and interactions between model and view 
 * @author Alireza Jadidi
 *
 */
public class GameController {
	/**
	 * the model of game
	 */
	private GameModel model;
	
	/**
	 * the view(interface) of game
	 */
	private GameView view;
	
	/**
	 * Constructor, sets model and view 
	 * @param model: the model
	 * @param view: the view
	 */
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * sets of the game
	 */
	public void start() {
		
		view.setUpBoard(model.getDim(), model.getAnswer());
		view.setVisible(true);
		view.pack();
		view.addAction(new Listener());
		view.addItem(new Listener());
	}
	
	/**
	 * Class controls all actions
	 * @author Alireza Jadidi
	 *
	 */
	class Listener implements ActionListener, ItemListener{

		@Override
		/**
		 * Performs actions of elements by checking the present action command 
		 */
		public void actionPerformed(ActionEvent e) {
			
			String command = e.getActionCommand();
			
			switch(command) {
			//Please Note: in order to set the dimension again, press the Rand button 
			case "dim":
				model.setDim(view.getDimension());
				view.changeDim(model.getDim(), model.getAnswer());
				break;
			case "rand": 
				view.randomBoard();
				break;
			case "set": 
				model.setAnswer(view.getText());
				view.setAnswer(model.getAnswer());
				break;
			case "board": 
				view.getClickedButton(e);
				view.Play(this);
				
				if (view.winCheck(model.getAnswer())) {
					System.out.println("Congrats! you won!");
				}
				
				break;
			case "mode":
				view.Play(this);
				view.changeMode();
				break;
			}
			
		}

		@Override
		/**
		 * Used to switch between text and number entry 
		 */
		public void itemStateChanged(ItemEvent e) {
			view.switchCards(e);
			
			
		}
		
	}
}
