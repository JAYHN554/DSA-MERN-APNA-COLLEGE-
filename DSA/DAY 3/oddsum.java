import java.util.Scanner;
public class oddsum
{
    public static void main(String[] args) 
    {
        int n,sum=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=in.nextInt();
        // forula based   
        sum=n*n;
        System.out.println("The sum of Odd Natural Number upto N is "+sum);
    }
}
