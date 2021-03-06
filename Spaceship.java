package systemTest;

public class Spaceship {

	int minions, lasers;
	/**
	 * Default constructor
	 */
	public Spaceship() {
		minions = 0;
		lasers = 0;
	}
	/**
	 * Loaded constructor
	 * @param minions Amount of minions
	 * @param lasers Amount of lasers
	 */
	public Spaceship(int minions, int lasers) {		
		this.minions = minions;						
		this.lasers = lasers;						
	}
	/**
	 * Adds minions
	 * @param amount Number of minions
	 */
	public void addMinions(int amount) {			
		minions = amount;							
	}
	/**
	 * Returns minions variable
	 * @return minions
	 */
	public int getMinions() {						
		return minions;						
	}
	/** 
	 * Adds lasers
	 * @param amount Number of lasers
	 */
	public void addLasers(int amount) {
		lasers = amount;
	}
	/**
	 * Returns lasers variable
	 * @return lasers
	 */
	public int getLasers() {
		return lasers;
	}
	/**
	 * Returns string of variables
	 */
	public String toString() {
		return "# of Minions: "+minions+"\t# of Lasers: "+lasers;
	}
}
