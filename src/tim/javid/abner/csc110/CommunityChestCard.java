package tim.javid.abner.csc110;

public class CommunityChestCard {
	
//	private BoardSpace boardSpace = new BoardSpace();
	private Player player = new Player();
	
	/**
	 * Move forward until you land on Go
	 * Collect $200 from the bank
	 */
	public void advanceToGo() {
		player.playerSpace = player.copyOfSpaces[0]; 
		
	}
	
	/**
	 * Collect $200 from the bank
	 */
	public void bankErrorInYourFavor() {
		
	}
	
	/**
	 * Pay the bank $50 for Doctor's Fees
	 */
	public void doctorsFee() {
		
	}
	
	/**
	 * Collect $50 from the bank
	 */
	public void fromSaleOfStock() {
		
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

		player.playerSpace = player.copyOfSpaces[41]; 
		
	}
	
	/**
	 * Collect $50 from every player for opening night seats
	 */
	public void grandOperaNight() {
		
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void holidayFundMatures() {
		
	}
	
	/**
	 * Collect $20 from the bank
	 */
	public void incomeTaxRefund() {
		player.balance += 20;
		
	}
	
	/**
	 * Collect $10 from every player
	 */
	public void itsYourBirthday() {
		
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void lifeInsuranceMatures() {
		
	}
	
	/**
	 * Pay the bank $50 for Hospital Fees
	 */
	public void payHospitalFees() {
		
	}
	
	/**
	 * Pay the bank $50 for School Fees
	 */
	public void paySchoolFees() {
		
	}
	
	/**
	 * Collect $25 from the bank
	 */
	public void receiveConsultancyFee() {
		
	}
	
	/**
	 * Pay the bank $40 for each house you own
	 * Pay the bank $115 for each hotel you own
	 */
	public void assessedForStreetRepairs() {
		
	}
	
	/**
	 * Collect $10 from the bank
	 */
	public void wonSecondPrizeInBeautyContest() {
		
	}
	
	/**
	 * Collect $100 from the bank
	 */
	public void inheritMoney() {
		player.balance += 100;
		
	}
	
}