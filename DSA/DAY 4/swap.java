
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
       int a ,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=in.nextInt();
        b=in.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Swap of two numbers is " +a+ " " +b);

    }
}
