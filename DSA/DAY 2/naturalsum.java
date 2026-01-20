
import java.util.Scanner;

public class naturalsum{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum= "+sum);
    }
}