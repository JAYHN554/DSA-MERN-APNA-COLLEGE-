
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner in = new Scanner (System.in);
        System.err.println("Enter the values of a and b");
        a=in.nextInt();
        b=in.nextInt();
        sum = a+b;
        System.out.println("The Sum of " +a+ " and " +b+ " is "+sum);
    }
    
}
