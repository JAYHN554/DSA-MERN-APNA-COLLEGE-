import java.util.Scanner;
public class max2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers:");
        a = in.nextInt();       
        b = in.nextInt();
        in.close();
        // using TernaryIfElse(a, b);
        int max = (a > b) ? a : b;
        System.out.println("Using Ternary Maximum is= " + max);
        // using if else
        System.out.print("Using If-Else:");
        if (a > b) {
            System.out.println("Maximum= " + a);
        } else {
            System.out.println("Maximum= " + b);
        }
    }
    
}
