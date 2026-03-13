import java.util.Scanner;

public class task2 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("\tProgram for converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dollar in Riels : ");
        float rate = input.nextFloat();
        System.out.print(" PLease input money to exchange in Riels : " );
        float riel = input.nextFloat();
        System.out.println(riel+"Riels = "+(riel/rate)+"USD");
    }
}
