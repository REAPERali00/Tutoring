package game;

/**
 * contains the main method 
 * @author Alireza Jadidi
 *
 */
public class Game {
	
	/**
	 * Main method
	 * @param args: default params 
	 */
	public static void main(String[] args) {
		GameView view = new GameView();
		GameModel model = new GameModel();
		GameController control = new GameController(model,view);
		control.start();
		
	}

}
