import java.util.Scanner;

public class task5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Program for calculating equation 1/x = 1/y +1/z to find value of x");
        System.out.print("Please input Y: ");
        float y = sc.nextFloat();
        System.out.print("Please input Z: ");
        float z = sc.nextFloat();
        System.out.println("Result x = "+(y*z/(y+z)));
    }


}
