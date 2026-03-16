import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; 
        int count = 0;

        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {
            System.out.print("Input value in array at index " + count + ": ");
            arr[count] = sc.nextInt();
            count++;

            System.out.print("Do you want to add more (y/n): ");
            choice = sc.next().charAt(0);
        }

        if (count == 0) {
            System.out.println("No values entered.");
        } else {
            int max = arr[0];
            for (int i = 1; i < count; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("The biggest number among in Array: " + max);
        }

    }
}
