package tim.javid.abner.csc110;

import tim.javid.abner.csc110.Piece.Token;

public class Player {

	final int startMoney = 1500;
	String name;
	Token token;
	int money = 0;
	int location = 0;
	int numberOfHouses = 0;
	int numberOfHotels = 0;
	int jailCards = 0;
	boolean jailed = false;
	
	public void playerDefault(String playerName, Token piece)	{
		name = playerName;
		token = piece;
		money = startMoney;
		location = 0;
		numberOfHouses = 0;
		numberOfHotels = 0;
		jailCards = 0;
		jailed = false;
	}
	
	public String callName()	{
		return name;
	}
	
	public int callMoney() {
		return money;
	}
	
	public int callLocation()	{
		return location;
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
		return "Player: " + name + ", Money: " + money + " Location: " + location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}