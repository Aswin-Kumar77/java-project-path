import java.util.Scanner;

public static void main()
{
    Scanner scanner = new Scanner(System.in);

    System.out.println("1.Add a Task");
    System.out.println("2.View tasks");
    System.out.println("3.Mark task as Completed");
    System.out.println("4.Delete task");
    System.out.println("5.exit");
    System.out.print("Enter your option : ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    ArrayList<String> tasks = new ArrayList<>();

    while(choice != 5)
    {
        if (choice == 1)
        {
            System.out.println("Enter your new task");
            String TC = scanner.nextLine();
            tasks.add( TC+" INCOMPLETE ");
        }
        else if (choice == 2)
        {
            System.out.println(tasks);
        }
        else if (choice == 3)
        {
            for (int i= 0; i < tasks.size() ;i++)
            {
                System.out.println(tasks.get(i) + "" + i + "");
            }
            System.out.println("Enter the task number mentioned next to it");
            int TC_choice = scanner.nextInt();
            tasks.set(TC_choice, tasks.get(TC_choice).replace(" INCOMPLETE", " COMPLETED"));
            System.out.println(tasks.get(TC_choice));
        }
        else if (choice == 4)
        {
            for (int i= 0; i < tasks.size() ;i++)
            {
                System.out.println(tasks.get(i) + "" + i + "");
            }
            System.out.println("Enter the task number mentioned next to it to Delete");
            int DEL_Choice = scanner.nextInt();
            tasks.remove(DEL_Choice);
        }
        System.out.println("Enter your new choice for option");
        choice = scanner.nextInt();
        scanner.nextLine();
    }
}