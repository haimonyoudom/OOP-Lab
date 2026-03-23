import java.util.ArrayList;
import java.util.Scanner;

 public class task4{
   
    public static void main(String[] args) {
        Scanner             sc       = new Scanner(System.in);
        ArrayList<Student>  students = new ArrayList<>();
        int count = 1;
 
        while (true) {
            System.out.println("Student #" + count + ":");
 
            System.out.print("  Id: ");
            int id = sc.nextInt();
 
            System.out.print("  Name: ");
            String name = sc.next();
 
            System.out.print("  Age: ");
            int age = sc.nextInt();
 
            students.add(new Student(id, name, age));
 
            System.out.print("Do you want to add more (y/n)?: ");
            String choice = sc.next();
 
            if (choice.equalsIgnoreCase("n")) break;
            count++;
        }
 
        printTable(students);
        sc.close();
    }
    
     static void printTable(ArrayList<Student> students) {
        String line = "===============================================";
        System.out.println(line);
        System.out.printf("| %-4s| %-5s| %-11s| %-5s|%n",
                          "No", "ID", "Name", "Age");
        System.out.println(line);
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("| %-4d| %-5d| %-11s| %-5d|%n",
                              i + 1, s.getId(), s.getName(), s.getAge());
        }
        System.out.println(line);
    }
}