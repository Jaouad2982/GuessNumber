import java.util.Scanner;
import java.util.Random;

public class GuessClass {
	public static void main(String[] args) {
		int guess;
		String trye;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = 1 + random.nextInt(10);
		
		do {
			System.out.println("Enter your guess");
			guess = input.nextInt();
			input.nextLine();
			if (guess != randomNumber) {
				System.out.println("nope that is not right ");
				if (guess > randomNumber) {
					System.out.println("You guessed too high");
				} else if (guess < randomNumber && guess > 0) {
					System.out.println("Your guessed too low");
				}
			} else {
				System.out.println("Wrong");
			}
			System.out.println("You guessed too low, or too high, try again? (Y/N)");
			trye = input.nextLine();
			if (trye.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing have a good day");
			}
		} while (trye.equalsIgnoreCase("y"));

	}
}
