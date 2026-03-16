import java.util.Scanner;

public class task8 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] num = new int[5];
        
        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Input value of "+(char)('A'+i)+":");
            
            num[i] = sc.nextInt();
            
        }
        int min = num[0];
        for (int i = 0 ; i < 5 ; i++)
        {
            if(num[i]<min)
            {
                min = num[i];
            }
        }
        System.out.println("The smallest number among A, B, C, D, E is : "+min);
    }    
}
