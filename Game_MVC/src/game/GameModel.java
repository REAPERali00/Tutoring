package game;

/**
 * The model(Data) of the game
 * @author Alireza Jadidi
 *
 */
public class GameModel {
	
	/**
	 * Contains the solution to the puzzle
	 */
	private String solution; 
	
	/**
	 * Contains the dimension (size) of the board
	 */
	private int dim;
	
	/**
	 * Default constructor
	 */
	public GameModel(){
		solution = "";
		dim = 3; 
		for(int i = 1; i < dim*dim; i++)
			solution += i;
	}
	
	/**
	 * returns solution
	 * @return solution
	 */
	public String getAnswer() {
		return solution;
	}
	
	/**
	 * change solution 
	 * @param solution: changes it 
	 */
	public void setAnswer (String solution) {
		this.solution = solution;
	}
	
	/**
	 * returns dimensions
	 * @return dim
	 */
	public int getDim() {
		return dim; 
	}
	
	/**
	 * changes the dimension
	 * @param dim: sets dimension
	 */
	public void setDim(int dim) {
		this.dim = dim;
	}
}
