import java.util.ArrayList;

public class Student {
 
    int id,age;
    String name;

    public Student(int id, String name, int age) {
        this.id   = id;
        this.name = name;
        this.age  = age;
    }
    public Student()
    {

    }
    public int    getId()   { return id;   }
    public String getName() { return name; }
    public int    getAge()  { return age;  }
    public void setValues(int id , String name , int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    
    static void display(ArrayList<Student> students) {
        System.out.println("=".repeat(56));
        System.out.printf("| %-6s | %-6s | %-25s | %-6s |%n", "No", "ID", "Name", "Age");
        System.out.println("=".repeat(56));
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("| %-6d | %-6d | %-25s | %-6d |%n", (i + 1), s.id, s.name, s.age);
        }
        System.out.println("=".repeat(56));
    }
 
}
