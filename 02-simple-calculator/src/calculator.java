import java.util.Scanner;

public class calculator {
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    static int divide(int n1, int n2) {
        return n1 / n2;
    }

    static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "no";

        while (exit.equals("no")) {
            System.out.print("Enter your first number : ");
            int n1 = scanner.nextInt();
            System.out.print("Enter your second number : ");
            int n2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your operator : ");
            String operator = scanner.nextLine();
            int result = 0;
            if (operator.equals("+")) {
                result = add(n1, n2);
            } else if (operator.equals("-")) {
                result = subtract(n1, n2);
            } else if (operator.equals("/")) {
                result = divide(n1, n2);
            } else if(operator.equals("*")){
                result = multiply(n1, n2);
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println(result);
            System.out.println("Do you want to exit the calculator?");
            exit = scanner.nextLine();
        }
    }
}