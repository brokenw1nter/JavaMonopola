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
			//AB.spaces[24] = player.copyOfSpaces;
		}
	}
	
	/**
	 * Move forward until you land on Illinois Ave.
	 * If you pass Go, collect $200 from the bank
	 */
	public void advanceToIllinoisAve() {
		if(player.playerPosition == AB.spaces[36])
		{
			player.playerPosition = AB.spaces[0];
			player.balance += 200;
			player.playerPosition= AB.spaces[24];
		}
		else
		{
			player.playerPosition = AB.spaces[24];
		}
	}
	
	/**
	 * Move forward until you land on St. Charles Place
	 * If you pass Go, collect $200 from the bank
	 */
	public void advanceToStCharlesPlace() {
		if(player.playerPosition == AB.spaces[36] || player.playerPosition == AB.spaces[22])
		{
			player.playerPosition = AB.spaces[0];
			player.balance += 200;
			player.playerPosition= AB.spaces[11];
		}
		else
		{
			player.playerPosition = AB.spaces[11];
		}
	}
	
	/**
	 * Move forward until you land on the nearest Utility
	 * If not owned, you may buy it from the bank
	 * If owned, throw the dice and pay the owner a total of 10 times the amount thrown
	 */
	public void advanceToNearestUtility() {
		if(player.playerPosition == AB.spaces[36] || player.playerPosition == AB.spaces[22])
		{
			player.playerPosition = AB.spaces[0];
			player.balance += 200;
			player.playerPosition= AB.spaces[11];
		}
		else
		{
			player.playerPosition = AB.spaces[11];
		}
	}
	
	/**
	 * Move forward until you land on the nearest Railroad
	 * If not owned, you may buy it from the bank
	 * If owned, pay the owner a total of twice the amount of rental
	 */
	public void advanceToNearestRailroad() {
		if(player.playerPosition == AB.spaces[36] || player.playerPosition == AB.spaces[7])
		{
			if(player.playerPosition == AB.spaces[36])
			{
				player.playerPosition = AB.spaces[0];
				player.balance += 200;
				
			}
			player.playerPosition= AB.spaces[12];
		}
		else
		{
			player.playerPosition = AB.spaces[28];
		}
	}
	
	/**
	 * The bank pays you a dividend of $50
	 */
	public void bankPaysYouDividend() {
		player.balance += 50;
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
		if(player.playerPosition == AB.spaces[36])
		{
			player.playerPosition = AB.spaces[33];
		}
		if(player.playerPosition == AB.spaces[7] )
		{
			player.playerPosition = AB.spaces[4];
		}
		if(player.playerPosition == AB.spaces[22])
		{
			player.playerPosition = AB.spaces[19];
		}	
	}
	
	/**
	 * Sent directly to jail
	 * You do not pass Go or collect $200 from the bank
	 */
	public void goToJail() {
		player.playerPosition = AB.spaces[40];
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