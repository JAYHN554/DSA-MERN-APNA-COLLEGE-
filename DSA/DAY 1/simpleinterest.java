
import java.util.Scanner;

public class simpleinterest
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p,r,t;
        int SI=0;
        int Amt=0;
        System.out.println("Enter the values of P ,R ,T");
        p=in.nextInt();
        r=in.nextInt();
        t=in.nextInt();
        SI=(p*r*t)/100;
        System.out.println("The Value of Simple Interest is "+SI);
        System.out.println("The Value of Amount is "+(p+SI));

    }
}