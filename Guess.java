import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("ENTER THE LOWER BOUND: ");
        int low = sc.nextInt();
        System.out.print("ENTER THE UPPER BOUND: ");
        int high = sc.nextInt();
        int num = random.nextInt(high - low + 1) + low;
        int chances = 7;
        int guessesMade = 0;
        boolean guessedCorrectly = false;
        System.out.println("\nYou have " + chances + " chances to guess the number between " + low + " to " + high);
        while (guessesMade < chances) {
            guessesMade++;
            System.out.print("Enter guess #" + guessesMade + ": ");
            int guess = scanner.nextInt();

            if (guess == num) {
                System.out.println("Correct!! You guessed the number in " + guessesMade + " tries!");
                guessedCorrectly = true;
                break;
            } else if (guess > num) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }
        }
        
        if (!guessedCorrectly) {
            System.out.println("\nBetter luck next time! The number was " + num);
        }

        sc.close();
    }
}
