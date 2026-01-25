import java.util.*;
public class input
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(a);

        char ch=in.nextLine().charAt(0);
        System.out.println(ch);

        String s=in.nextLine();
        System.out.println(s);
        boolean bool=in.nextBoolean();
        System.out.println(bool);
        
        float f=in.nextFloat();
        System.out.println(f);

        double d=in.nextDouble();
        System.out.println(d);
    }
}