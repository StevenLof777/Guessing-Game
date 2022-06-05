import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name?");


        String name = "";

        try {
            name = String.valueOf(sc.next());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };


        System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");
        game.guessNumber(name);
    }
}