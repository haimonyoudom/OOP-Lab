import java.util.Scanner;

public class task3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Phone Setting :");
            System.out.printf("%-20s >%n","1.General");
            System.out.printf("%-20s >%n","2.Wi-Fi");
            System.out.printf("%-20s >%n","3.Bluetooth");
            System.out.printf("%-20s >%n","4.Mobile Data");
            System.out.printf("%-20s >%n","5.Hotspot");
            System.out.printf("%-20s >%n","6.Notification");
            System.out.printf("%-20s >%n","0.Quit");
    
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    while(true)
                    {
                    System.out.println("General : ");
                    System.out.printf("%-20s >%n","1.About");
                    System.out.printf("%-20s >%n","2.Software update");
                    System.out.printf("%-20s >%n","3.Storage");
                    System.out.printf("%-20s >%n","0.Back");
                    int n = sc.nextInt();
                    sc.nextLine();
                    if(n==1)
                    {
                        while(true){
                        System.out.println("General > About:");
                        System.out.printf("%-15s %-15s%n","Name","iPhone");
                        System.out.printf("%-15s %-15s%n","Model","IXs");
                        System.out.printf("%-15s %-15s%n","Version","18.5");
                        System.out.println("0.Back");
                        int n1 = sc.nextInt();

                        if(n1 == 0)
                        {
                            break;
                        }
                        }
                    }
                    else if (n == 2)
                    {
                        while (true)
                        {
                            System.out.println("General > Software Update:");
                            System.out.println("=".repeat(22));
                            System.out.println("Software is up date");
                            System.out.println("=".repeat(22));
                             System.out.println("0.Back");
                            int n1 = sc.nextInt();

                            if(n1 == 0)
                            {
                                break;
                            }
                        }
                    }
                    else if (n ==3)
                    {
                        while(true){
                        System.out.println("General > Storage");
                        System.out.printf("%-20s %-20s%n","Storage","256GB");
                        System.out.printf("%-20s %-20s%n","RAM","16GB");
                        System.out.println("0.back");
                        int n1 = sc.nextInt();
                        if(n1 ==0 ){break;}
                        }
                    }
                    else if(n == 0) {   break; }
                    else {System.out.println("INVALID Choice.");}
                    }
                    break;
                case 2 :
                        while (true)
                        {
                            System.out.println("Wi-Fi:");
                            System.out.printf("%-20s %-20s%n","Status","On");
                            System.out.printf("%-20s %-20s%n","Network","I-Coffee");
                            System.out.printf("%-20s %-20s%n","1.Other networks",">");
                            System.out.println("0.back");
                            int n = sc.nextInt();
                            sc.nextLine();
                            if(n == 1)
                            {
                                while(true){
                                System.out.println("Wi-Fi > Other netwroks:");
                                System.out.printf("%-20s %-20s%n","Bayon coffee","*****");
                                System.out.printf("%-20s %-20s%n","Angkor coffee","**");
                                System.out.printf("%-20s %-20s%n","Brown coffee","****");
                                System.out.printf("%-20s %-20s%n","Koi","*");
                                System.out.println("0.Back");
                                int n1 = sc.nextInt();

                                if(n1 == 0) {break;}
                                }
                            }
                            else if (n == 0){break;}
                        }
                        break;
                case 3 :
                    while (true)
                    {
                        System.out.println("Bluetooth:");
                        System.out.println("=".repeat(28));
                        System.out.println("The Feature is not available");
                        System.out.println("=".repeat(28));
                        System.out.println("0.back");
                        int n1 = sc.nextInt();
                        if(n1 == 0)
                        {break;}
                    }
                    break;
                case 4 :
                    while (true)
                    {
                        System.out.println("Mobile Data:");
                        System.out.println("=".repeat(28));
                        System.out.println("The Feature is not available");
                        System.out.println("=".repeat(28));
                        System.out.println("0.back");
                        int n1 = sc.nextInt();
                        if(n1 == 0)
                        {break;}
                    }
                    break;
                case 5 :
                    while (true)
                    {
                        System.out.println("Hotspot:");
                        System.out.println("=".repeat(28));
                        System.out.println("The Feature is not available");
                        System.out.println("=".repeat(28));
                        System.out.println("0.back");
                        int n1 = sc.nextInt();
                        if(n1 == 0)
                        {break;}
                    }
                    break;
                case 6:
                    while (true)
                    {
                        System.out.println("Notification:");
                        System.out.println("=".repeat(28));
                        System.out.println("The Feature is not available");
                        System.out.println("=".repeat(28));
                        System.out.println("0.back");
                        int n1 = sc.nextInt();
                        if(n1 == 0)
                        {break;}
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if(choice == 0)
            {
                break;
            }
        }
        sc.close();
    }   
}
