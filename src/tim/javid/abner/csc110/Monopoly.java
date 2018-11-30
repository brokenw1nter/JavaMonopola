package tim.javid.abner.csc110;

import java.io.IOException;

public class Monopoly {
	
	public static void main(String[] args) throws IOException {
		boolean appRunning = true;
		while(appRunning) {
			GameBoard game = new GameBoard();
			game.init();
			appRunning = game.play();
		}
	}
}