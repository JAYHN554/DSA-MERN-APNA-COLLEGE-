
import java.util.Scanner;

public class practice2
{
    public static void main(String[] args) 
    {
         try(Scanner in = new Scanner(System.in))
        {
            // float pencil,pen,eraser;
            // System.err.println("enter the cost of pencil pen and eraser");
            // pencil=in.nextFloat();
            // pen=in.nextFloat();
            // eraser=in.nextFloat();
            // System.err.println("Cost will be ="+(pen+pencil+eraser)*1.18);
            byte b=4;
            char c='a';
            short s=512;
            int i=1000;
            float f= 3.14f;
            double d=99.9954f;
            double result=f*b+i%c-d*s;
            System.err.println("Result =" +result);
        }
    }
}
