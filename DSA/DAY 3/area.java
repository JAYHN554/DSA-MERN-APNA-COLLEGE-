
import java.util.Scanner;

public class area
{
    public static void main (String args[])
    {
        Scanner in =new Scanner (System.in);
        int a;
        System.out.println("Enter your choice \n 1.Area of Rectangle \n 2. Area of Square \n 3.Area of Triangle \n 4.Area of Circle");
        a=in.nextInt();
        switch (a) {
            case 1:
                int l,b;
                System.out.println("enter the values of length and breadth");
                l=in.nextInt();
                b=in.nextInt();
                System.out.println("The area of Rectangle is " +l*b);
                break;
            case 2:
                int s;
                System.out.println("enter the value of side");
                s=in.nextInt();
                System.out.println("The area of Square is " +s*s);
            case 3:
                 int s1,s2;
                 System.out.println("enter the value of base and height");
                 s1=in.nextInt();
                 s2=in.nextInt();
                 System.out.println("The area of Traingle is " +(1/2)*s1*s2);
            case 4:
                int r;
                System.out.println("Enter the value of Radius");
                r=in.nextInt();
                System.out.println("The area of radius is "  +3.14*r*r);
            default:
            
        }
    }
}