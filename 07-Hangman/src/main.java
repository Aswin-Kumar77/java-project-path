import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public static void main(String[] args)
{
    String[] hangwords = {"pen", "book", "shelf", "paper", "note"};
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    boolean playAgain = true;

    while (playAgain)
    {
        String word = hangwords[random.nextInt(hangwords.length)];

        StringBuilder hiddenword = new StringBuilder();

        for (int i = 0; i < word.length(); i++)
        {
            hiddenword.append("_");
        }

        int attempts = word.length();
        ArrayList<Character> guessedLetters = new ArrayList<>();

        while (attempts != 0)
        {
            boolean guessfound = false;

            System.out.print("Guess a letter : ");
            String input = scanner.nextLine();

            // Input validation
            if (input.length() != 1 || !Character.isLetter(input.charAt(0)))
            {
                System.out.println("Please enter a single letter.");
                continue;
            }

            // Uppercase/lowercase handling
            char guess = Character.toLowerCase(input.charAt(0));

            // Repeated guess checking
            if (guessedLetters.contains(guess))
            {
                System.out.println("You already guessed that letter.");
                continue;
            }

            guessedLetters.add(guess);

            for (int i = 0; i < word.length(); i++)
            {
                char letter = word.charAt(i);

                if (letter == guess)
                {
                    hiddenword.setCharAt(i, guess);
                    guessfound = true;
                }
            }

            if (!guessfound)
            {
                System.out.println("Incorrect guess");
                attempts -= 1;
                System.out.println("Remaining attempts: " + attempts);
            }

            System.out.println(hiddenword);

            if (!hiddenword.toString().contains("_"))
            {
                System.out.println("YOU WIN");
                break;
            }

            if (attempts == 0)
            {
                System.out.println("YOU LOST");
                System.out.println("The word was: " + word);
                break;
            }
        }

        System.out.print("Play again? (y/n): ");
        char choice = Character.toLowerCase(scanner.nextLine().charAt(0));

        if (choice != 'y')
        {
            playAgain = false;
        }
    }

    scanner.close();
}