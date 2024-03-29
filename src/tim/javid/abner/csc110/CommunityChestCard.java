package tim.javid.abner.csc110;

public class CommunityChestCard {
	
//	private BoardSpace boardSpace = new BoardSpace();
	private Player player = new Player();
	public GameBoard numberOfPlayers;
	
	/**
	 * Prints out the player's balance
	 */
	private void showOutput() {
		System.out.println("Your Balance is Now: " + player.balance);
	}
	
	/**
	 * Move forward until you land on Go
	 * Collect $200 from the bank
	 */
	public void advanceToGo() {
		player.playerPosition = player.copyOfSpaces[0];
		showOutput();
	}
	
	/**
	 * Collect $200 from the bank
	 */
	public void bankErrorInYourFavor() {
		player.balance += 200;
		showOutput();
	}
	
	/**
	 * Pay the bank $50 for Doctor's Fees
	 */
	public void doctorsFee() {
		player.balance -= 50;
		showOutput();
	}
	
	/**
	 * Collect $50 from the bank
	 */
	public void fromSaleOfStock() {
		player.balance += 50;
		showOutput();
	}
	
	/**
	 * Get out of jail for free
	 * Card may be kept until needed, traded, or sold
	 */
	public void getOutOfJail() {
	}
	
	/**
	 * Sent directly to jail
	 * You do not pass Go or collect $200 from the bank
	 */
	public void goToJail() {
		player.playerPosition = player.copyOfSpaces[41];
		showOutput();
	}
	
	/**
	 * Collect $50 from every player for opening night seats
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void grandOperaNight() {
		if(numberOfPlayers.equals(2))	{
			player.balance += 50;
		}
		if(numberOfPlayers.equals(3))	{
			player.balance += 100;
		}
		if(numberOfPlayers.equals(4))	{
			player.balance += 150;
		}
		if(numberOfPlayers.equals(5))	{
			player.balance += 200;
		}
		if(numberOfPlayers.equals(6))	{
			player.balance += 250;
		}
		if(numberOfPlayers.equals(7))	{
			player.balance += 300;
		}
		if(numberOfPlayers.equals(8))	{
			player.balance += 350;
		}
		showOutput();
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void holidayFundMatures() {
		player.balance += 100;
		showOutput();
	}
	
	/**
	 * Collect $20 from the bank
	 */
	public void incomeTaxRefund() {
		player.balance += 20;
		showOutput();
	}
	
	/**
	 * Collect $10 from every player
	 */
	public void itsYourBirthday() {
		showOutput();
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void lifeInsuranceMatures() {
		player.balance += 100;
		showOutput();
	}
	
	/**
	 * Pay the bank $50 for Hospital Fees
	 */
	public void payHospitalFees() {
		player.balance -= 50;
		showOutput();
	}
	
	/**
	 * Pay the bank $50 for School Fees
	 */
	public void paySchoolFees() {
		player.balance -= 50;
		showOutput();
	}
	
	/**
	 * Collect $25 from the bank
	 */
	public void receiveConsultancyFee() {
		player.balance += 25;
		showOutput();
	}
	
	/**
	 * Pay the bank $40 for each house you own
	 * Pay the bank $115 for each hotel you own
	 */
	public void assessedForStreetRepairs() {
		showOutput();
	}
	
	/**
	 * Collect $10 from the bank
	 */
	public void wonSecondPrizeInBeautyContest() {
		player.balance += 10;
		showOutput();
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void inheritMoney() {
		player.balance += 100;
		showOutput();
	}
	
}