import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = String.valueOf(scanner.next());
        System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");
        game.guessNumber(name);
    }
}