import java.util.Random;
import java.util.Scanner;
//Java Programming Internship Task 1 at CodSoft. Rahul Rajput	
public class NumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            boolean playGame = true;

            System.out.println("Welcome!!!! I Present CodSoft Task 1:- Number Game");
            System.out.println();

            while (playGame) {
                int secretNumber = random.nextInt(100) + 1;
                int attempts = 0;
                System.out.println("Hello Guys! I'm Rahul. Let's play some Number Game");
                System.out.println();
                System.out.println("I'm thinking of a number between 1 and 100.");
//Java Programming Internship Task 1 at CodSoft. Rahul Rajput	
                while (true) {
                    System.out.print("Your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == secretNumber) {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                        break;
                    } else if (userGuess < secretNumber) {
                        System.out.println("Try a higher number.");
                    } else {
                        System.out.println("Try a lower number.");
                    }
                }
//Java Programming Internship Task 1 at CodSoft. Rahul Rajput	
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next().toLowerCase();
                if (!playAgain.equals("yes")) {
                    System.out.println("Thanks for playing!! See You Soon :)");
                    playGame = false;
                }
            }
        }
    }
}
//Java Programming Internship Task 1 at CodSoft. Rahul Rajput	
