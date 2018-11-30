package tim.javid.abner.csc110;

import java.util.Random;

public class Die {

	Random rand = new Random();
	int dice = rand.nextInt(6) + 1;
	int dice2 = rand.nextInt(6) + 1;
}
