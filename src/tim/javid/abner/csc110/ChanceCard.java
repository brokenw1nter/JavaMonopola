package tim.javid.abner.csc110;

public class ChanceCard {
	
	public Player player = new Player();
	
	public ActualBoard AB = new ActualBoard();
	
	/**
	 * Move forward until you land on Go
	 * Collect $200 from the bank
	 */
	public void advanceToGo() {
		boolean boolCheck = true;
		if(boolCheck)
		{
			player.balance += 200;
			
		}
	}
	
	/**
	 * Move forward until you land on Illinois Ave.
	 * If you pass Go, collect $200 from the bank
	 */
	public void advanceToIllinoisAve() {
		
	}
	
	/**
	 * Move forward until you land on St. Charles Place
	 * If you pass Go, collect $200 from the bank
	 */
	public void advanceToStCharlesPlace() {
		
	}
	
	/**
	 * Move forward until you land on the nearest Utility
	 * If not owned, you may buy it from the bank
	 * If owned, throw the dice and pay the owner a total of 10 times the amount thrown
	 */
	public void advanceToNearestUtility() {
		
	}
	
	/**
	 * Move forward until you land on the nearest Railroad
	 * If not owned, you may buy it from the bank
	 * If owned, pay the owner a total of twice the amount of rental
	 */
	public void advanceToNearestRailroad() {
		
	}
	
	/**
	 * The bank pays you a dividend of $50
	 */
	public void bankPaysYouDividend() {
		
	}
	
	/**
	 * Get out of jail for free
	 * Card may be kept until needed, traded, or sold
	 */
	public void getOutOfJail() {
		
	}
	
	/**
	 * Move back 3 spaces
	 */
	public void goBackThreeSpaces() {
		
	}
	
	/**
	 * Sent directly to jail
	 * You do not pass Go or collect $200 from the bank
	 */
	public void goToJail() {
		
	}
	
	/**
	 * Pay the bank $25 for each house you own
	 * Pay the bank $100 for each hotel you own
	 */
	public void makeGeneralRepairs() {
		
	}
	
	/**
	 * Pay the bank $15 for Poor Tax
	 */
	public void payPoorTax() {
		
	}
	
	/**
	 * Move forward until you land on Reading Railroad
	 * Collect $200 from the bank for passing Go
	 */
	public void takeTripToReadingRailroad() {
		
	}
	
	/**
	 * Move forward until you land on Boardwalk
	 */
	public void takeWalkOnTheBoardwalk() {
		
	}
	
	/**
	 * Pay every player $50
	 */
	public void electedChairmanOfTheBoard() {
		
	}
	
	/**
	 * Collect $150 from the bank
	 */
	public void buildingAndLoanMatures() {
		
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void winCrosswordCompetition() {
		
	}
	
}