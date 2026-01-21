import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int marks;
        int total = 0;

        System.out.println("Enter the number of students:");
        n = in.nextInt();

        System.out.println("Enter their marks:");
        for (int i = 1; i <= n; i++) {
            marks = in.nextInt();
            total = total + marks;
        }

        System.out.println("Average = " + (total / n));
    }
}
