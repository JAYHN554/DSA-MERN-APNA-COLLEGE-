import java.util.*;
public class even {
    public static void main(String args[])
    {   int n;
        Scanner in =new Scanner (System.in);
        System.out.println("enter the value");
        n=in.nextInt();
        System.out.println("The even numbers are:");
        for (int i=9;i<=n;i++)
        {   
            if(i%2==0)
            {
                System.out.println(i);
            }

        }

    }
    
}
