import java.util.Scanner;

public class task4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Input number of seconds: ");
        int sec = sc.nextInt();
        int secs ,h ,min;
        if (sec < 60)
        {
            h = 00; 
            min = 00;
            secs = sec;
        }
        else if(sec < 3600)
        {
            h = 00;
            min = sec / 60;
            secs = sec % 60;
        }
        else 
        {
            h = sec / 3600;
            min = (sec %3600) / 60;
            secs = (sec%3600)%60;
        }
        System.out.println("Time corresponding to "+sec+" seconds is:: "+h+":"+min+":"+secs);
    }
}
