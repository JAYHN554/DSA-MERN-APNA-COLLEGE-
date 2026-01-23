
import java.util.Scanner;

public class palindrome
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        int rev=0;
        while(n>0)
        {
        }
        if(rev==n)
            System.out.println("It is an palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}