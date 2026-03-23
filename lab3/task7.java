import java.util.ArrayList;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("\n====== Menu ======");
            System.out.println("1.  Create a student");
            System.out.println("2.  List students");
            System.out.println("3.  Quit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt(); 
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                Student s = new Student();
                s.setValues(id, name, age);
                students.add(s);
                //if we have constructor(id,name,age)
                //students.add(new Student(id,name,age));
                System.out.println("A student is added to the list");

            } else if (choice == 2) {
                Student.display(students);
            }
            else if(choice==3){
                System.out.println("Exit Program ...");
                break;    
            }
            else {System.out.println("Invalid choice .");}

        } 
        sc.close();
    }
}
