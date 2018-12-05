package tim.javid.abner.csc110;

public class BoardSpace {
	
	public Player player = new Player();
	public Player owner;
	public double amount;
	
	/**
	 * Prints out the player's balance
	 */
	private void showOutput() {
		System.out.println("Your Balance is Now: " + player.balance);
	}
	
	/**
	 * Game starts here
	 * When passed, player receives $200 from the bank
	 */
	public void go() {
		player.balance += 200;
		showOutput();
	}
	
	/**
	 * When landed on, player receives a Community Chest Card
	 */
	public void communityChest() {
		
	}
	
	/**
	 * When landed on, player has to pay the bank $200
	 */
	public void incomeTax() {
		player.balance -= 200;
		showOutput();
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $200
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void railroad() {
		
	}
	
	/**
	 * When landed on, player receives a Chance Card
	 */
	public void chance() {
		
	}
	
	/**
	 * When landed on, player is just visiting
	 */
	public void jail() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $100/$150
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void utility() {
		
	}
	
	/**
	 * When landed on, nothing happens
	 */
	public void freeParking() {
		
	}
	
	/**
	 * When landed on, player is sent directly to jail
	 */
	public void goToJail() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $60
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void brownProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $100/$120
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void lightBlueProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $140/$160
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void magentaProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $180/$200
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void orangeProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $220/$240
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void redProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $260/$280
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void yellowProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $300/$320
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void greenProperty() {
		
	}
	
	/**
	 * When landed on and it's not owned, player can purchase the property for $350/$400
	 * If it's owned, player has to pay owner an increment of $25
	 */
	public void blueProperty() {
		
	}
	
}