import javax.swing.JOptionPane;

public class GuessMyNumber {
	public static void main(String[] args) {
		int secretNumber = 88;
		int userNum;
		boolean didTheyGuessRight;
		String response;

		do {
			// ask the user to guess a number
			response = JOptionPane.showInputDialog("Guess a number");
			userNum = Integer.parseInt(response);

			if (userNum == secretNumber) {
				System.out.println("You got it!!");
			}

			if (userNum != secretNumber) {
				System.out.println("NOPE.");

				if (userNum > secretNumber) {
					System.out.println("Your guess is too big.");
				}

				if (userNum < secretNumber) {
					System.out.println("Your guess is too small.");
				}

			}

		} while (userNum != secretNumber);

	}
}
