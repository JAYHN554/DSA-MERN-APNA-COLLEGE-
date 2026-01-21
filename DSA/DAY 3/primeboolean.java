import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println("Invalid input");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break; // no need to check further
            }
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
