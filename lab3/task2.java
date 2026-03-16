
import java.util.Scanner;

public class task2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number to be input ?");
        System.out.print("Number of Input: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print("Value #"+(i+1)+": ");
            num[i] = sc.nextInt();
            sc.nextLine();
        }
        int max = num[0],min = num[0];
        float total = 0;
        for (int i = 0 ; i < n ;i++)
        {
            total += num[i];
            if (num[i]<min)
            {
                min = num[i];
            }
            if(num[i]>max)
            {
                max = num[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("Average : "+(total/n));
        System.out.println("Sum : "+total);
        sc.close();
    }
}
