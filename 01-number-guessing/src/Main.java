import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Random noothulaonnu = new Random();
        int result = noothulaonnu.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your guess : ");
        int guess = scan.nextInt();
        while (guess != result) {
        if (guess > result) {
            System.out.println("You guessed higher than the number");
        } else {
            System.out.println("You guessed lower than the number");
        }
            System.out.println("Enter a new guess : ");
        guess = scan.nextInt();
        if (guess==result)
            System.out.println("*Congrats you guessed right*");
    }
    }
}