// Java program for the above approach
import java.util.Scanner;
public class game {
    public static void guessNumber(String name) {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(20 * Math.random());

        // K = Guesses
        int K = 7;

        int i, guess;

        for (i = 1; i < K; i++) {
            System.out.println("Take a guess");
//            System.out.println("Random number: " + number);
            guess = sc.nextInt();

            // If the number is guessed correctly
            if (number == guess) {
                System.out.println(
                        "Congratulations!\n " +
                                "You beat the game in "+ i + " guesses!"
                );
                playAgain(name);
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You're out of guesses " +
                    "The answer was: " + number
            );
            playAgain(name);
        }

    }
    public static void playAgain(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play again " + name +"? <y/n>");
        String answer = sc.next();
        if (answer.equals("y")){
            guessNumber(name);
        } else {
            return;
        }
    }
}