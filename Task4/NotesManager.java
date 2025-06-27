
import java.io.*;
import java.util.*;

public class NotesManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "note.txt";
        while (true) {
            System.out.println("\n======Notes Manager ======");
            System.out.println("1.Write a Note");
            System.out.println("2.Read Note");
            System.out.println("3.Exit");
            System.out.println("Enter Your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your note");
                    String note = sc.nextLine();

                    try (FileWriter writer = new FileWriter(fileName, true)) {
                        writer.write(note + System.lineSeparator());
                        System.out.println("Note Saved Successfully");
                    } catch (IOException e) {
                        System.out.println("Error writting to the file" + e.getMessage());
                    }
                    break;
                case 2:

                    System.out.println("======= Notes Content=======");
                    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("File Not Found:" + e.getMessage());

                    } catch (IOException e) {
                        System.out.println("Error reading file:" + e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("Exiting Notes Manager......");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice, please try again");

            }
        }
    }
}
