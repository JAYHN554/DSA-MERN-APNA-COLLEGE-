
import java.util.Scanner;

public class practice {
   public static void main(String[] args) {
    try(Scanner in = new Scanner(System.in)){

   
     int $=24;
     System.out.println($);

     int a ,b,c;
     System.out.println("Enter three numbers");
     a=in.nextInt();
     b=in.nextInt();
     c=in.nextInt();
     System.out.println("Average = " +(a+b+c)/3);

     int s=10;
     System.out.println("Area= " +(s*s));
        }
   } 
   
}
