import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public static void main(String[] args) {
    String lowercase = "abcdefghijklmnopqrstuvwxyz";
    String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "0123456789";
    String special = "!@#$%^&*()_+-=[]{};:,.<>?";
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String password = "";
    System.out.print("Enter pass length : ");
    int passlength = scanner.nextInt();
    ArrayList<String> selectedPool = new ArrayList<>();
    while (selectedPool.isEmpty())
    {
        System.out.println("Select your vareities that to be included");
    System.out.println("lowercase y/n  ");
    boolean low = scanner.next().equalsIgnoreCase("y");
    System.out.println("uppercase y/n  ");
    boolean up = scanner.next().equalsIgnoreCase("y");
    System.out.println("numbers y/n  ");
    boolean num = scanner.next().equalsIgnoreCase("y");
    System.out.println("special y/n  ");
    boolean spe = scanner.next().equalsIgnoreCase("y");

    if (low) {
        selectedPool.add(lowercase);
    }

    if (up) {
        selectedPool.add(uppercase);
    }

    if (num) {
        selectedPool.add(numbers);
    }

    if (spe) {
        selectedPool.add(special);
    }
    if (selectedPool.isEmpty()) {
        System.out.println("INVALID operation");
    }
}

    for (int i = 0; i < passlength; i++)
    {
        int randomvarselection = random.nextInt(selectedPool.size());
        String selectedmodule = selectedPool.get(randomvarselection);
        int randomcharselection = random.nextInt(selectedmodule.length());
        char selectedchar = selectedmodule.charAt(randomcharselection);
        password += selectedchar;
    }
    System.out.println(password);
}
