package tim.javid.abner.csc110;

public class Player {
	
	public String name;
	public double balance;
	public Piece.Token token;
	public BoardSpace[] copyOfSpaces = new ActualBoard().spaces;
	public BoardSpace playerSpace;
	
}