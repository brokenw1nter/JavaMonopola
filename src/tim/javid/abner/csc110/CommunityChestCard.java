package tim.javid.abner.csc110;

public class CommunityChestCard {
	
	private void showOutput()
	{
		System.out.println("Your balance is now " + player.balance);
	}
	
//	private BoardSpace boardSpace = new BoardSpace();
	private Player player = new Player();
	
	/**
	 * Move forward until you land on Go
	 * Collect $200 from the bank
	 */
	public void advanceToGo() {
		player.playerSpace = player.copyOfSpaces[0];
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
		showOutput();
	}
	
	/**
	 * Sent directly to jail
	 * You do not pass Go or collect $200 from the bank
	 */
	public void goToJail() {

		player.playerSpace = player.copyOfSpaces[41];
		showOutput();
	}
	
	/**
	 * Collect $50 from every player for opening night seats
	 */
	public void grandOperaNight() {
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