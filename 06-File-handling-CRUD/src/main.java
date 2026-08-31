import java.io.*;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    static File file = new File("Data.txt");

    public static void main(String[] args) throws IOException {

        if (!file.exists()) {
            file.createNewFile();
        }

        while (true) {

            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                create();
            }
            else if (choice == 2) {
                read();
            }
            else if (choice == 3) {
                update();
            }
            else if (choice == 4) {
                delete();
            }
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }

    // CREATE
    static void create() throws IOException {

        System.out.print("Enter your data: ");
        String data = scanner.nextLine();

        FileWriter writer = new FileWriter(file, true);

        writer.write(data + "\n");

        writer.close();

        System.out.println("Data saved.");
    }

    // READ
    static void read() throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(file)
        );

        String line;

        System.out.println("\n===== DATA =====");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    // UPDATE
    static void update() throws IOException {

        System.out.print("Enter the data you want to update: ");
        String oldData = scanner.nextLine();

        System.out.print("Enter the new data: ");
        String newData = scanner.nextLine();

        BufferedReader reader = new BufferedReader(
                new FileReader(file)
        );

        StringBuilder content = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {

            if (line.equals(oldData)) {
                content.append(newData).append("\n");
            }
            else {
                content.append(line).append("\n");
            }
        }

        reader.close();

        FileWriter writer = new FileWriter(file);

        writer.write(content.toString());

        writer.close();

        System.out.println("Data updated.");
    }

    // DELETE
    static void delete() throws IOException {

        System.out.print("Enter the data you want to delete: ");
        String dataToDelete = scanner.nextLine();

        BufferedReader reader = new BufferedReader(
                new FileReader(file)
        );

        StringBuilder content = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {

            if (!line.equals(dataToDelete)) {
                content.append(line).append("\n");
            }
        }

        reader.close();

        FileWriter writer = new FileWriter(file);

        writer.write(content.toString());

        writer.close();

        System.out.println("Data deleted.");
    }
}