import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        int divisor = 0;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                divisor = i;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            if (divisor != 0) {
                System.out.println(num + " is not a prime number, because it is divisible by " + divisor);
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}