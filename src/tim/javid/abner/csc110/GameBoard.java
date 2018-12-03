package tim.javid.abner.csc110;

import java.io.IOException;

import interfaces.ConsoleUI;

public class GameBoard {
	
	public Player[] players;
	
	/**
	 * Prompts the players for total # of players and asks for name - calls the play()
	 * @throws IOException
	 */
	public void init() throws IOException	{
		System.out.println("Welcome to JavaMonopola!");
		int numberOfPlayers = ConsoleUI.promptForInt("How many players will there be? This game can only have 2 - 8 players", 2, 8);
		players = new Player[numberOfPlayers];
		for (int i = 0; i < players.length; i++) {
			String playerName = ConsoleUI.promptForInput("Please enter player " + (i + 1) + "'s name.", false);
			Player player = new Player();
			player.name = playerName;
			players[i] = player;
		}
		play();
		
	}
	
	/**
	 * prompts the menu with two options - boolean because of main method loop
	 * @return false - if true, does not prompt menu again and ends game
	 */
	public boolean play()	{		
		int COUNT_OPTONS = 2;
		boolean gameOver = false;
		while(!gameOver)	{
			String[] options = new String[COUNT_OPTONS];
			populateString(options);
		}
		return false;
	}
	
	private void populateString(String[] options)	{
		options[1] = "Roll the Dice";
		options[2] = "Quit";
	}
	
}