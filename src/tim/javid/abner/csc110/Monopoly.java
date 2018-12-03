package tim.javid.abner.csc110;

import java.io.IOException;

public class Monopoly {
	
	/**
	 * Starts monopoly and loops to see if game is still running
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		boolean appRunning = true;
		while(appRunning) {
			GameBoard game = new GameBoard();
			game.init();
			appRunning = game.play();
		}
	}
	
}