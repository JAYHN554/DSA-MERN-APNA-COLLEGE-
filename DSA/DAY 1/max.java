    
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a and b and c");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a>b) && (a>c)){
            System.out.println("Max number is "+a);
        }
        else if((b>c) && (b>a)){
            System.out.println("Max number is "+b);   
        }
        else
        System.out.println("Max number is "+c);

    }
}
