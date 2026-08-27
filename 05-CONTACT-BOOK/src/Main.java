import java.util.Scanner;

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("ADD A CONTACT");
    System.out.println("VIEW ALL CONTACTS");
    System.out.println("SEARCH FOR A CONTACT");
    System.out.println("DELETE A CONTACT");
    System.out.println("EXIT");
    ArrayList<Contact> contacts = new ArrayList<>();

    System.out.print("Please enter an Option : ");
    int choice = scanner.nextInt();
    scanner.nextLine();

    while (choice != 5)
    {
        if (choice == 1)
        {
            System.out.print("Enter the Name of the Contact : ");
            String UI_name = scanner.nextLine();
            System.out.print("Enter the phone number of the contact : ");
            String UI_phno = scanner.nextLine();
            System.out.print("Enter the email of the contact : ");
            String UI_email = scanner.nextLine();
            contacts.add(new Contact(UI_name, UI_phno, UI_email));
            System.out.print("Enter your new choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        else if (choice == 2)
        {
            for (int i = 0; i < contacts.size(); i++)
            {
                System.out.println(contacts.get(i));
            }
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        else if (choice == 3)
        {
            System.out.println("Enter the name of the contact");
            String SC = scanner.nextLine();
            for (int i = 0; i < contacts.size(); i++)
            {
                if(contacts.get(i).name.equals(SC))
                {
                    System.out.println(contacts.get(i));
                }
            }
            System.out.print("Enter your new choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        else if (choice == 4)
        {
            for (int i = 0; i < contacts.size(); i++)
            {
                System.out.println(i + " " + contacts.get(i));
            }
            System.out.println("Enter the number before the contact to delete it");
            int DC = scanner.nextInt();
            scanner.nextLine();
            contacts.remove(DC);
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
    System.out.println("Goodbye");
}
static class Contact
{
    String name;
    String phno;
    String email;

    @Override
    public String toString()
    {
        return name + " " + phno + " " + email;
    }
    Contact(String name,String phno,String email)
    {
        this.name = name;
        this.phno = phno;
        this.email = email;
    }
}