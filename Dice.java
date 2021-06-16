// Benjamin Lin
// CSCI 145 Project0
// 2021/01/19

package project0;

import java.util.Random;

public class Dice {
	// integer variable "diceVal"
	int diceVal;
	// This is something that I found online for How to generate a random number in a range
	// It produces a random number between 1 to 7, the + 1 indicates that there will be no zero occur
	public int roll() { 
		Random random = new Random();
		int diceVal = random.nextInt(7) + 1;
		return diceVal;
		
	}

}
