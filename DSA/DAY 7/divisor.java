
import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,sum=0;
        System.err.println("Enter a number");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.err.println("Sum of divisor of " + n +" is "+sum);
       
    }    
}
