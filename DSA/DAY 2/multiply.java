
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        int x,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to display its multiplication table: ");
        x = scanner.nextInt();
        scanner.close();
        System.out.println("Multiplication table of " + x + ":");
        for (n = 1; n <= 10; n++) {
            int result = x * n;
            System.out.println(x + " x " + n + " = " + result);
        }
    }
    
}
