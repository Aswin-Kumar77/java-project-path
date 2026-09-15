import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int correctpin = 1234;
        int attempts = 3;
        int Balance = 10000;
        while (attempts > 0)
        {
            System.out.print("Please enter your 4 digit pin : ");
            int userpin = scanner.nextInt();
            if (correctpin == userpin)
            {
                int umc = 0;
                while (umc != 4)
                {
                    System.out.println("======ATM======");
                    System.out.println("1. View Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Please enter the Digit next to the option : ");
                    umc = scanner.nextInt();
                    if (umc == 1)
                    {
                        System.out.println(Balance + "₹");
                    }
                    else if (umc == 2)
                    {
                        System.out.println("Enter the amount you want to withdraw");
                        int WA = scanner.nextInt();
                        if (WA > Balance)
                        {
                            System.out.println("Withdrawal amount exceeds balance");
                        } else
                        {
                            Balance -= WA;
                            System.out.println("Withdrawal successful");
                            System.out.println("Remaining balance: " + Balance + "₹");
                        }
                    }
                    else if (umc == 3)
                    {
                        System.out.println("Enter the amount you want to add");
                        int AA = scanner.nextInt();
                        Balance += AA;
                    }
                }
            }
            else
            {
                System.out.println("incorrect pin");
                attempts -= 1;
            }
        }
    }
}
