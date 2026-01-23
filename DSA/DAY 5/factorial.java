
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        int n;
        int fact=1;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check its factorial");
        n=in.nextInt();
        System.out.print("The factorial of number "+n+"! is  ");
        for(int i=1;i<=n;i++)
        {
            
            fact=fact*i;
        }
        System.out.println(fact);
    }

    
}
