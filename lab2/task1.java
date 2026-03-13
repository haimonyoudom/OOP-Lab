import java.util.Scanner;

public class task1
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print(" Input your name : ");
        String name = input.nextLine();
        System.out.println(" Hello , "+name);
    }
}