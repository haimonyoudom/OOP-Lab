import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating roots of quadratic equation\nax^2 + bx + c =0");
        System.out.print("Input value of a :");
        int a = sc.nextInt();
        System.out.print("Input value of b : ");
        int b = sc.nextInt();
        System.out.print("Input value of c : ");
        int c = sc.nextInt();
        double theda = (b*b)-(4*a*c);
        double sqTheda = Math.sqrt(theda);
        if (theda < 0 )
        {
            System.out.println("Equation roots are complex!");
        }
        else 
        {
            System.out.println("X1 = "+((-b+sqTheda)/(2*a))+", X2 = "+((-b-sqTheda)/(2*a)));
        }
        sc.close();
    }    
}