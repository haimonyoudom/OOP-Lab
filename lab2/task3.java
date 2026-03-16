import java.util.Scanner; 

public class task3{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("===Covid-19 Screen Health===");
        System.out.println("Q1. Feeling feveriish and/or having chill ?");
        String[] ans= new String[10];
        ans[0] = input.nextLine();
        System.out.println("Q2. Has thre been any use of fever reducing medication within the last 24hours not due to another health condition?");
        ans[1]=input.nextLine();
        System.out.println("Q3. A new cough that is not due to another health condition?");
        ans[2]=input.nextLine();
        System.out.println("Q4. New chills that are not due to another health consition?");
        ans[3]=input.nextLine();
        System.out.println("Q5. Anew sore throat that is not due to another health condition?");
        ans[4]=input.nextLine();
        System.out.println("Q6. A new loss of taste or smell?");
        ans[5]=input.nextLine();
        System.out.println("Q7. Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days?");
        ans[6] = input.nextLine();
        System.out.println("Q8. In the past 14 days, have you had close contact(within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19?");
        ans[7]=input.nextLine();
        System.out.println("=".repeat(35));
        System.out.printf("| %-15s | %-15s |\n", "Questions", "Answers");
        System.out.println("=".repeat(35));

        for (int i = 0; i < 8; i++) {
            System.out.printf("| %-15s | %-15s |\n", "Q" + (i+1), ans[i]);
            System.out.println("-".repeat(35));
        }
    }
}