
import java.util.*;
public class nthterm{
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int a1=5,a2=8;
        int d=a2-a1;
        System.out.println("enter first term and second term"+a1 +a2);
        System.out.println("which nth term to choose T(n) ?");
        int n=in.nextInt();
        int tn;
        tn=a1+(n-1)*d;
        System.out.println("Nth Term in an AP Is"+ tn);
    
    }
}