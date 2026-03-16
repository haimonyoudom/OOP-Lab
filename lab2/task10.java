import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        char cont;

        while(true)
        {
            System.out.println("=== Math Menu ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quit");

            System.out.print("Please choose an option: ");
            option = sc.nextInt();

            if(option < 1 || option > 5)
            {
                System.out.println("Please choose an option again.");
                continue;
            }

            if(option == 5)
            {
                System.out.println("Program ended.");
                break;
            }

            System.out.print("Please input value A: ");
            int A = sc.nextInt();

            System.out.print("Please input value B: ");
            int B = sc.nextInt();

            switch(option)
            {
                case 1:
                    System.out.println("=== Addition (+) ===");
                    System.out.println("Answer of A + B = " + (A + B));
                    break;

                case 2:
                    System.out.println("=== Subtraction (-) ===");
                    System.out.println("Answer of A - B = " + (A - B));
                    break;

                case 3:
                    System.out.println("=== Multiplication (x) ===");
                    System.out.println("Answer of A x B = " + (A * B));
                    break;

                case 4:
                    System.out.println("=== Division (/) ===");
                    System.out.println("Answer of A / B = " + (A / B));
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            cont = sc.next().charAt(0);

            if(cont == 'n' || cont == 'N')
            {
                break;
            }
        }

        sc.close();
    }
}