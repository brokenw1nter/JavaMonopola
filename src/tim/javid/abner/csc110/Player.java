package tim.javid.abner.csc110;

import tim.javid.abner.csc110.Piece.Token;

public class Player {
	
	String name;
	Token token;
	int balance;
	int playerPosition;
	int numberOfHouses;
	int numberOfHotels;
	int jailCards;
	boolean jailed;
	final int startMoney = 1500;
	public int[] copyOfSpaces;
	
	public void playerDefault(String playerName, Token piece)	{
		name = playerName;
		token = piece;
		balance = startMoney;
		playerPosition = 0;
		numberOfHouses = 0;
		numberOfHotels = 0;
		jailCards = 0;
		jailed = false;
	}
	
	public String callName()	{
		return name;
	}
	
	public int callMoney() {
		return balance;
	}
	
	public int callLocation()	{
		return playerPosition;
	}
	
	public int callNumberOfHouses() {
		return numberOfHouses;
	}
	
	public int callNumberOfHotels()	{
		return numberOfHotels;
	}
	
	public int callNumberOfJailCards()	{
		return jailCards;
	}
	
	public String playerInfo()	{
		return "Player: " + name + ", Money: " + balance + " Location: " + playerPosition;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}