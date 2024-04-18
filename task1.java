import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum 5 Attempt Limit");
        while (attempts < 5) {
            System.out.println("Enter  a Guess number between " + minRange + " and " + maxRange + ".");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("OOhOO!,Your Number is Correct.You Win the Game!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your Guess Number is Smaller.");
            } else {
                System.out.println("Your Guess Number is Greater.");
            }
        }
        
        if (attempts == 5) {
            System.out.println("Sorry, you've used up all your attempts. The correct number was: " + secretNumber);
        }
        
        scanner.close();
    }
}
