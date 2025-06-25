
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------Enter Your Choice---------");
            System.out.println("1. Adding Students");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. -Exit-");

            int n = sc.nextInt();
            if (n == 5) {
                System.out.println("Exiting Good bye !");
                break;
            }
            switch (n) {
                case 1:
                    System.out.println("Enter Student Name");
                    String name = sc.next();
                    System.out.println("Enter Student Roll Number");
                    int id = sc.nextInt();
                    System.out.println("Enter Student Marks");
                    int marks = sc.nextInt();

                    Student student = new Student(id, marks, name);
                    students.add(student);
                    System.out.println("Student Added Successfully");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("There are no students to view...");
                    } else {
                        for (Student s1 : students) {
                            System.out.println("ID: " + s1.getId());
                            System.out.println("Name: " + s1.getName());
                            System.out.println("Marks: " + s1.getMarks());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Student ID to Update");
                    int id1 = sc.nextInt();
                    for (Student s1 : students) {
                        if (s1.getId() == id1) {
                            System.out.println("Which field do you want to update? ");
                            System.out.println("1. Namw\n2. Marks \n3.Both");
                            int choice = sc.nextInt();
                            if (choice == 1) {
                                System.out.println("Enter the updated student name");
                                String studentname = sc.nextLine();
                                s1.setName(studentname);
                                System.out.println("Student new name updated successfully");
                            } else if (choice == 2) {
                                System.out.println("Enter the updated student marks");
                                int studentmarks = sc.nextInt();
                                s1.setMarks(studentmarks);
                                System.out.println("Student new marks updated successfully");
                            } else {
                                System.out.println("Enter the updated student name");
                                String studentname = sc.nextLine();
                                s1.setName(studentname);
                                System.out.println("Enter the updated student marks");
                                int studentmarks = sc.nextInt();
                                s1.setMarks(studentmarks);
                                System.out.println("Student new name and marks updated successfully");
                            }
                            break;

                        } else {
                            System.out.println("The student with the given " + id1 + "doesnot exist");
                        }

                    }
                    break;
                case 4:
                    System.out.println("Enter Student ID to Delete");
                    int id2 = sc.nextInt();
                    Iterator<Student> it = students.iterator();
                    while (it.hasNext()) {
                        Student s1 = it.next();
                        if (s1.getId() == id2) {
                            it.remove();
                            System.out.println("Student details deleted successfully");

                        } else {
                            System.out.println("Student doesnot exist with ID: " + id2);
                        }
                    }

                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }

        }
        sc.close();
    }

}
