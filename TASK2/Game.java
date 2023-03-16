//TASK2 : NUMBER GUESSING GAME 

import javax.swing.JOptionPane; //Needed for Dialog Box

public class Game {

	public static void main(String[] args) {

		int guess = 1 + (int) (100 * Math.random());

		int tries = 10;
		while (tries != 0) {
			String input = JOptionPane.showInputDialog("Guess the Number between 1 and 100");
			int number = Integer.parseInt(input);
			if (number == guess) {
				int tried = 10 - tries + 1;
				int score = tries * 10;
				JOptionPane.showMessageDialog(null, "Congratulations! You have guessed the number correctly in " + tried
						+ " tries \nYour Accuracy is : " + score + "%");

				break;

			} else if (number > guess) {
				JOptionPane.showMessageDialog(null, "Incorrect guess! Your input is greater than the generated number");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect guess! Your input is lesser than the generated number");
			}
			tries--;
		}
		if (tries == 0) {
			JOptionPane.showMessageDialog(null,
					"No more trials left! The generated number was " + guess + " \nYour Accuracy is : 0% ");
		}

	}

}
