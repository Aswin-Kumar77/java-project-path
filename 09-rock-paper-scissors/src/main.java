import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        String[] arr = {"stone", "paper", "scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean PA = true;

        while (PA)
        {
            int randchoiceint = random.nextInt(3);
            String randchoice = arr[randchoiceint];

            System.out.print("Please enter your option: ");
            String choice = scanner.next().toLowerCase(Locale.ROOT);

            System.out.println("Computer chose: " + randchoice);

            if (choice.equals("stone") && randchoice.equals("paper"))
            {
                System.out.println("You lose");
            }
            else if (choice.equals("stone") && randchoice.equals("scissors"))
            {
                System.out.println("You win");
            }
            else if (choice.equals("stone") && randchoice.equals("stone"))
            {
                System.out.println("Tie");
            }
            else if (choice.equals("paper") && randchoice.equals("scissors"))
            {
                System.out.println("You lose");
            }
            else if (choice.equals("paper") && randchoice.equals("stone"))
            {
                System.out.println("You win");
            }
            else if (choice.equals("paper") && randchoice.equals("paper"))
            {
                System.out.println("Tie");
            }
            else if (choice.equals("scissors") && randchoice.equals("stone"))
            {
                System.out.println("You lose");
            }
            else if (choice.equals("scissors") && randchoice.equals("paper"))
            {
                System.out.println("You win");
            }
            else if (choice.equals("scissors") && randchoice.equals("scissors"))
            {
                System.out.println("Tie");
            }
            else
            {
                System.out.println("Invalid choice");
            }

            System.out.println("Do you want to play again? : y/n");
            String PAC = scanner.next().toLowerCase(Locale.ROOT);

            if (PAC.equals("n"))
            {
                PA = false;
            }
        }
    }
}