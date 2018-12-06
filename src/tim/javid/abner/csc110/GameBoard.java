package tim.javid.abner.csc110;

import java.io.IOException;
import java.util.Random;

import edu.neumont.csc110.Player.PieceNames;
import interfaces.ConsoleUI;

public class GameBoard {
	
	public int turn;
	public Player[] players;
	public boolean gameOver = false;
	public BoardSpace boardSpace;
	public Player player;
	public Random rand = new Random();
	
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
			
			int token = rand.nextInt(7) + 1;
			switch (token) {
			case 1:
				players[i].init(playerName, Piece.Token.Top_Hat);
			case 2:
				players[i].init(playerName, Piece.Token.Battleship);
			case 3:
				players[i].init(playerName, Piece.Token.Racecar);
			case 4:
				players[i].init(playerName, Piece.Token.Scottie_Dog);
			case 5:
				players[i].init(playerName, Piece.Token.Cat);
			case 6:
				players[i].init(playerName, Piece.Token.T_Rex);
			case 7:
				players[i].init(playerName, Piece.Token.Rubber_Ducky);
			case 8:
				players[i].init(playerName, Piece.Token.Penguin);
			default:
				players[i].init(playerName, Piece.Token.Default);
			}
			
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
			case 1:
				rollTheDice();
				switchTurn();
				break;
			case 2:
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
		int dice = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		System.out.println(dice + dice2);
		
		if(dice == dice2)	{
			System.out.println("Doubles! Roll again.");
			//move player forward by number of dice
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
			//move player forward by number of dice
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
			System.out.println("oof. You rolled a third double. Go to Jail scrub");
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
		options[0] = "Roll the Dice";
		options[1] = "Quit";
	}
	
}