package tim.javid.abner.csc110;

import java.io.IOException;
import java.util.Random;

import interfaces.ConsoleUI;

public class GameBoard {
	
	public int turn;
	public Player[] players;
	public boolean gameOver = false;
	public BoardSpace boardSpace;
	public Player player;

	Die die1 = new Die();
	Die die2 = new Die();
	
	/**
	 * Prompts the players for total # of player, their name, and token - calls the play() method
	 * @throws IOException
	 */
	public void init() throws IOException {
		System.out.println("Welcome to JavaMonopola!");
		int numberOfPlayers = ConsoleUI.promptForInt("Enter Amount of Players between 2 and 8:", 2, 8);
		players = new Player[numberOfPlayers];
		
		for (int i = 0; i < players.length; i++) {
			String playerName = ConsoleUI.promptForInput("Enter Player " + (i + 1) + "'s Name:", false);
			System.out.println("Tokens: Top Hat, Battleship, Racecar, Scottie Dog, T-Rex, Rubber Ducky, Penguin");
			String playerToken = ConsoleUI.promptForInput("Choose a Token for Player " + (i + 1) + ":", false);
			Player player = new Player();
			player.name = playerName;
			players[i] = player;
			this.turn = 0;
		}
		
		play();
	}
	
	/**
	 * prompts the menu with two options - boolean because of main method loop
	 * @return false - if true, does not prompt menu again and ends game
	 */
	public boolean play() {
		final int COUNT_OPTONS = 2;
		String[] options = new String[COUNT_OPTONS];
		populateString(options);
		
		while(!gameOver) {
			System.out.println("It is " + players[turn].name + "'s turn.");
			System.out.println(players[turn].name + ", your balance is " + players[turn].balance);
			int selection = ConsoleUI.promptForMenuSelection(options, false);
			
			switch (selection) {
			case 0:
				rollTheDice();
				switchTurn();
				break;
			case 1:
                System.out.println("Thank You for Playing JavaMonopola!");
                gameOver = true;
                break;
            default:
            	throw new IllegalArgumentException("Error, Your Selection '" + selection + "' is Invalid.");
			}
		}
		
		return false;
	}
	
	/**
	 * rolls the dice and checks for doubles
	 * the next three methods are for the dice
	 */
	private void rollTheDice() {
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		System.out.println(dice + dice2);
		
		if(dice == dice2)	{
			System.out.println("Doubles! Roll again.");
			rolledDoubleTwice();
		}
		else	{
			gameOver = false;
		}
	}
	
	private void rolledDoubleTwice()	{
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		System.out.println(dice + dice2);
		
		if(dice == dice2)	{
			System.out.println("Another Double! Roll again!");
			rolledDoubleThird();
		}
		else	{
			gameOver = false;
		}
	}
	
	private void rolledDoubleThird()	{
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		System.out.println(dice + dice2);
		
		if(dice == dice2)	{
			System.out.println("oof. You rolled another double. Go to Jail scrub");
			boardSpace.goToJail();
		}
		else	{
			gameOver = false;
		}
	}
	
	/////////////////////////end of dice methods/////////////////////////
	
	private void switchTurn() {
		turn = (turn>= (players.length - 1) ? 0 : turn + 1);
	}
	
	private void populateString(String[] options)	{
		options[1] = "Roll the Dice";
		options[2] = "Quit";
	}
	
}