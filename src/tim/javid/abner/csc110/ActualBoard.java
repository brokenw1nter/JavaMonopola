package tim.javid.abner.csc110;

public class ActualBoard {
	
	/**
	 * initialize new array
	 */
	public BoardSpace[] spaces = new BoardSpace[41];
	public BoardSpace playerPosition;
	
	/**
	 * assigns indexes to property on the board
	 * @param spaces (array name)
	 * @return spaces (the array)
	 */
	public void placeLandOn() {
		spaces[0] = new BoardSpace(0); // Go
		spaces[1] = "Mediter-Ranean Avenue";
		spaces[2] = new BoardSpace(1); // "Community Chest";
		spaces[3] = "Baltic Avenue";
		spaces[4] = new BoardSpace(6); // "Income Tax";
		spaces[5] = "Reading Railroad";
		spaces[6] = "Oriental Avenue";
		spaces[7] = new BoardSpace(2); // "Chance";
		spaces[8] = "Vermont Avenue";
		spaces[9] = "Connecticut Avenue";
		spaces[10] = new BoardSpace(3); // "Just visiting";
		spaces[11] = "St. Charles Place";
		spaces[12] = "Electric Company";
		spaces[13] = "States Avenue";
		spaces[14] = "Virginia Avenue";
		spaces[15] = "Pennsylvania Railroad";
		spaces[16] = "St. James Place";
		spaces[17] = new BoardSpace(1); // "Community Chest";
		spaces[18] = "Tennessee Avenue";
		spaces[19] = "New York Avenue";
		spaces[20] = new BoardSpace(4); // "Free Parkng";
		spaces[21] = "Kentucky Avenue";
		spaces[22] = new BoardSpace(2); // "Chance";
		spaces[23] = "Indiana Avenue";
		spaces[24] = "Illinois Avenue";
		spaces[25] = "B. & O. Railroad";
		spaces[26] = "Atlntic Avenue";
		spaces[27] = "Ventnor Avenue";
		spaces[28] = "Water Works";
		spaces[29] = "Marvin Gardens";
		spaces[30] = new BoardSpace(5); // "Go To Jail";
		spaces[31] = "Pacific Avenue";
		spaces[32] = "North Carolina Avenue";
		spaces[33] = new BoardSpace(1); // "Community Chest";
		spaces[34] = "Pennsylvania Avenue";
		spaces[35] = "Short Line";
		spaces[36] = new BoardSpace(2); // "Chance";
		spaces[37] = "Park Place";
		spaces[38] = new BoardSpace(7); // "Luxury Tax";
		spaces[39] = "Boardwalk";
		spaces[40] = "Actual Jail";
		
//		spaces[1] = "Mediter-Ranean Avenue";
//		spaces[2] = "Community Chest";
//		spaces[3] = "Baltic Avenue";
//		spaces[4] = "Income Tax";
//		spaces[5] = "Reading Railroad";
//		spaces[6] = "Oriental Avenue";
//		spaces[7] = "Chance";
//		spaces[8] = "Vermont Avenue";
//		spaces[9] = "Connecticut Avenue";
//		spaces[10] = "Just visiting";
//		spaces[11] = "St. Charles Place";
//		spaces[12] = "Electric Company";
//		spaces[13] = "States Avenue";
//		spaces[14] = "Virginia Avenue";
//		spaces[15] = "Pennsylvania Railroad";
//		spaces[16] = "St. James Place";
//		spaces[17] = "Community Chest";
//		spaces[18] = "Tennessee Avenue";
//		spaces[19] = "New York Avenue";
//		spaces[20] = "Free Parkng";
//		spaces[21] = "Kentucky Avenue";
//		spaces[22] = "Chance";
//		spaces[23] = "Indiana Avenue";
//		spaces[24] = "Illinois Avenue";
//		spaces[25] = "B. & O. Railroad";
//		spaces[26] = "Atlntic Avenue";
//		spaces[27] = "Ventnor Avenue";
//		spaces[28] = "Water Works";
//		spaces[29] = "Marvin Gardens";
//		spaces[30] = "Go To Jail";
//		spaces[31] = "Pacific Avenue";
//		spaces[32] = "North Carolina Avenue";
//		spaces[33] = "Community Chest";
//		spaces[34] = "Pennsylvania Avenue";
//		spaces[35] = "Short Line";
//		spaces[36] = "Chance";
//		spaces[37] = "Park Place";
//		spaces[38] = "Luxury Tax";
//		spaces[39] = "Boardwalk";
//		spaces[40] = "Actual Jail";
	}
	
	public void playerIsOn() {
		for (int i = 0; i < 41; i++) {
			if (playerPosition == spaces[i]) {
				System.out.println(spaces[i]);
			}
		}
		
//		if (playerPosition == spaces[0])	{
//			System.out.println(spaces[0]);
//		}
//		if (playerPosition == spaces[1])	{
//			System.out.println(spaces[1]);
//		}
//		if (playerPosition == spaces[2])	{
//			System.out.println(spaces[2]);
//		}
//		if (playerPosition == spaces[3])	{
//			System.out.println(spaces[3]);
//		}
//		if (playerPosition == spaces[4])	{
//			System.out.println(spaces[4]);
//		}
//		if (playerPosition == spaces[5])	{
//			System.out.println(spaces[5]);
//		}
//		if (playerPosition == spaces[6])	{
//			System.out.println(spaces[6]);
//		}
//		if (playerPosition == spaces[7])	{
//			System.out.println(spaces[7]);
//		}
//		if (playerPosition == spaces[8])	{
//			System.out.println(spaces[8]);
//		}
//		if (playerPosition == spaces[9])	{
//			System.out.println(spaces[9]);
//		}
//		if (playerPosition == spaces[10])	{
//			System.out.println(spaces[10]);
//		}
//		if (playerPosition == spaces[11])	{
//			System.out.println(spaces[11]);
//		}
//		if (playerPosition == spaces[12])	{
//			System.out.println(spaces[12]);
//		}
//		if (playerPosition == spaces[13])	{
//			System.out.println(spaces[13]);
//		}
//		if (playerPosition == spaces[14])	{
//			System.out.println(spaces[14]);
//		}
//		if (playerPosition == spaces[15])	{
//			System.out.println(spaces[15]);
//		}
//		if (playerPosition == spaces[16])	{
//			System.out.println(spaces[16]);
//		}
//		if (playerPosition == spaces[17])	{
//			System.out.println(spaces[17]);
//		}
//		if (playerPosition == spaces[18])	{
//			System.out.println(spaces[18]);
//		}
//		if (playerPosition == spaces[19])	{
//			System.out.println(spaces[19]);
//		}
//		if (playerPosition == spaces[20])	{
//			System.out.println(spaces[20]);
//		}
//		if (playerPosition == spaces[21])	{
//			System.out.println(spaces[21]);
//		}
//		if (playerPosition == spaces[22])	{
//			System.out.println(spaces[22]);
//		}
//		if (playerPosition == spaces[23])	{
//			System.out.println(spaces[23]);
//		}
//		if (playerPosition == spaces[24])	{
//			System.out.println(spaces[24]);
//		}
//		if (playerPosition == spaces[25])	{
//			System.out.println(spaces[25]);
//		}
//		if (playerPosition == spaces[26])	{
//			System.out.println(spaces[26]);
//		}
//		if (playerPosition == spaces[27])	{
//			System.out.println(spaces[27]);
//		}
//		if (playerPosition == spaces[28])	{
//			System.out.println(spaces[28]);
//		}
//		if (playerPosition == spaces[29])	{
//			System.out.println(spaces[29]);
//		}
//		if (playerPosition == spaces[30])	{
//			System.out.println(spaces[30]);
//		}
//		if (playerPosition == spaces[31])	{
//			System.out.println(spaces[31]);
//		}
//		if (playerPosition == spaces[32])	{
//			System.out.println(spaces[32]);
//		}
//		if (playerPosition == spaces[33])	{
//			System.out.println(spaces[33]);
//		}
//		if (playerPosition == spaces[34])	{
//			System.out.println(spaces[34]);
//		}
//		if (playerPosition == spaces[35])	{
//			System.out.println(spaces[35]);
//		}
//		if (playerPosition == spaces[36])	{
//			System.out.println(spaces[36]);
//		}
//		if (playerPosition == spaces[37])	{
//			System.out.println(spaces[37]);
//		}
//		if (playerPosition == spaces[38])	{
//			System.out.println(spaces[38]);
//		}
//		if (playerPosition == spaces[39])	{
//			System.out.println(spaces[39]);
//		}
//		if (playerPosition == spaces[40])	{
//			System.out.println(spaces[40]);
//		}
//		if (playerPosition == spaces[41])	{
//			System.out.println(spaces[41]);
//		}
	}
	
}