// Benjamin Lin
// CSCI 145 Project0
// 2021/01/19

package project0;


public class DiceRollem {
// main method to execute the code
	public static void main(String[] args) {
		// five objects of type Dice
		Dice val1 = new Dice();
		Dice val2 = new Dice();
		Dice val3 = new Dice();
		Dice val4 = new Dice();
		Dice val5 = new Dice();
		// a accumulator variable to keep track of the number of the dices that have the same value
		int accumulator = 0;
		// a for loop to repeat the following methods 1000 times
		for (int i = 0; i <= 1000; i++) {
			// invoke roll methods in the Dice class
			int time1 = val1.roll();
			int time2 = val2.roll();
			int time3 = val3.roll();
			int time4 = val4.roll();
			int time5 = val5.roll();
			// check if these five values are the same
			if (time1 == time2 && time1 == time3 && time1 == time4 && time1 == time5 ) {
				// increment "accumulator" by 1 if the condition is true
				accumulator = accumulator + 1;
				// display the roll number and dice number if the condition is true
				System.out.println("Roll number " + i + " all the dice show " + time1 + ".");
			}

		}
		// print out the total number of times that the five values are same
		System.out.println("A total of "+ accumulator + " tosses were the same.");

	}
}
