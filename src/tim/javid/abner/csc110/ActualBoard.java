package tim.javid.abner.csc110;

public class ActualBoard {
	
	/**
	 * initialize new array
	 */
	public BoardSpace[] spaces = new BoardSpace[41];
	
	public BoardSpace playerSpace;
	
	/**
	 * assigns indexes to property on the board
	 * @param spaces (array name)
	 * @return spaces (the array)
	 */
	public String[] placeLandOn(String[] spaces) {
		spaces[0] = "Go";
		spaces[1] = "Mediter-Ranean Avenue";
		spaces[2] = "Community Chest";
		spaces[3] = "Baltic Avenue";
		spaces[4] = "Income Tax";
		spaces[5] = "Reading Railroad";
		spaces[6] = "Oriental Avenue";
		spaces[7] = "Chance";
		spaces[8] = "Vermont Avenue";
		spaces[9] = "Connecticut Avenue";
		spaces[10] = "Just visiting";
		spaces[11] = "St. Charles Place";
		spaces[12] = "Electric Company";
		spaces[13] = "States Avenue";
		spaces[14] = "Virginia Avenue";
		spaces[15] = "Pennsylvania Railroad";
		spaces[16] = "St. James Place";
		spaces[17] = "Community Chest";
		spaces[18] = "Tennessee Avenue";
		spaces[19] = "New York Avenue";
		spaces[20] = "Free Parkng";
		spaces[21] = "Kentucky Avenue";
		spaces[22] = "Chance";
		spaces[23] = "Indiana Avenue";
		spaces[24] = "Illinois Avenue";
		spaces[25] = "B. & O. Railroad";
		spaces[26] = "Atlntic Avenue";
		spaces[27] = "Ventnor Avenue";
		spaces[28] = "Water Works";
		spaces[29] = "Marvin Gardens";
		spaces[30] = "Go To Jail";
		spaces[31] = "Pacific Avenue";
		spaces[32] = "North Carolina Avenue";
		spaces[33] = "Community Chest";
		spaces[34] = "Pennsylvania Avenue";
		spaces[35] = "Short Line";
		spaces[36] = "Chance";
		spaces[37] = "Park Place";
		spaces[38] = "Luxury Tax";
		spaces[39] = "Boardwalk";
		spaces[40] = "Actual Jail";
		return spaces;
	}
	
	public void playerIsOn() {
		for (int i = 0; i < 41; i++) {
			if (playerSpace == spaces[i]) {
				System.out.println(spaces[i]);
			}
		}
		
//		if (playerSpace == spaces[0])	{
//			System.out.println(spaces[0]);
//		}
//		if (playerSpace == spaces[1])	{
//			System.out.println(spaces[1]);
//		}
//		if (playerSpace == spaces[2])	{
//			System.out.println(spaces[2]);
//		}
//		if (playerSpace == spaces[3])	{
//			System.out.println(spaces[3]);
//		}
//		if (playerSpace == spaces[4])	{
//			System.out.println(spaces[4]);
//		}
//		if (playerSpace == spaces[5])	{
//			System.out.println(spaces[5]);
//		}
//		if (playerSpace == spaces[6])	{
//			System.out.println(spaces[6]);
//		}
//		if (playerSpace == spaces[7])	{
//			System.out.println(spaces[7]);
//		}
//		if (playerSpace == spaces[8])	{
//			System.out.println(spaces[8]);
//		}
//		if (playerSpace == spaces[9])	{
//			System.out.println(spaces[9]);
//		}
//		if (playerSpace == spaces[10])	{
//			System.out.println(spaces[10]);
//		}
//		if (playerSpace == spaces[11])	{
//			System.out.println(spaces[11]);
//		}
//		if (playerSpace == spaces[12])	{
//			System.out.println(spaces[12]);
//		}
//		if (playerSpace == spaces[13])	{
//			System.out.println(spaces[13]);
//		}
//		if (playerSpace == spaces[14])	{
//			System.out.println(spaces[14]);
//		}
//		if (playerSpace == spaces[15])	{
//			System.out.println(spaces[15]);
//		}
//		if (playerSpace == spaces[16])	{
//			System.out.println(spaces[16]);
//		}
//		if (playerSpace == spaces[17])	{
//			System.out.println(spaces[17]);
//		}
//		if (playerSpace == spaces[18])	{
//			System.out.println(spaces[18]);
//		}
//		if (playerSpace == spaces[19])	{
//			System.out.println(spaces[19]);
//		}
//		if (playerSpace == spaces[20])	{
//			System.out.println(spaces[20]);
//		}
//		if (playerSpace == spaces[21])	{
//			System.out.println(spaces[21]);
//		}
//		if (playerSpace == spaces[22])	{
//			System.out.println(spaces[22]);
//		}
//		if (playerSpace == spaces[23])	{
//			System.out.println(spaces[23]);
//		}
//		if (playerSpace == spaces[24])	{
//			System.out.println(spaces[24]);
//		}
//		if (playerSpace == spaces[25])	{
//			System.out.println(spaces[25]);
//		}
//		if (playerSpace == spaces[26])	{
//			System.out.println(spaces[26]);
//		}
//		if (playerSpace == spaces[27])	{
//			System.out.println(spaces[27]);
//		}
//		if (playerSpace == spaces[28])	{
//			System.out.println(spaces[28]);
//		}
//		if (playerSpace == spaces[29])	{
//			System.out.println(spaces[29]);
//		}
//		if (playerSpace == spaces[30])	{
//			System.out.println(spaces[30]);
//		}
//		if (playerSpace == spaces[31])	{
//			System.out.println(spaces[31]);
//		}
//		if (playerSpace == spaces[32])	{
//			System.out.println(spaces[32]);
//		}
//		if (playerSpace == spaces[33])	{
//			System.out.println(spaces[33]);
//		}
//		if (playerSpace == spaces[34])	{
//			System.out.println(spaces[34]);
//		}
//		if (playerSpace == spaces[35])	{
//			System.out.println(spaces[35]);
//		}
//		if (playerSpace == spaces[36])	{
//			System.out.println(spaces[36]);
//		}
//		if (playerSpace == spaces[37])	{
//			System.out.println(spaces[37]);
//		}
//		if (playerSpace == spaces[38])	{
//			System.out.println(spaces[38]);
//		}
//		if (playerSpace == spaces[39])	{
//			System.out.println(spaces[39]);
//		}
//		if (playerSpace == spaces[40])	{
//			System.out.println(spaces[40]);
//		}
//		if (playerSpace == spaces[41])	{
//			System.out.println(spaces[41]);
//		}
	}
	
}