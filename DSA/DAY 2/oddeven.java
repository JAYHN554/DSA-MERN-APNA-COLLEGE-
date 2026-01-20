
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        sc.close();
        int a;
        System.out.println("Enter a number to check whether it is odd or even:");
        a=sc.nextInt();
        if( (a & 1) == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
    
}

// Problem occur in this code despite being logically correct.
// ANS. ERROR GENERATED HERE IS:Resource leak: 'sc' is never closed
// In Java, Scanner uses a resource (usually System.in, a stream).
// Java opens a resource.
// When your program ends quickly, the OS cleans it up anyway.
// But Java is old-school disciplined—it prefers you to close what you open.
// So the compiler says:
// “Hey… you opened something. You didn’t close it. I’m not mad, just concerned.”
// Why does Java care?
// Resources like:
// fileS input streams database connections are limited.
// If you keep opening them and never closing them (especially in big apps), memory leaks happen. Bad things follow.
// For small programs, it’s harmless.
// For real systems, it’s deadly.
// How to fix it (two correct ways)
// ✅ Way 1: Close it manually
// Scanner sc = new Scanner(System.in);
// // use sc
// sc.close();
// ⚠️ Small note:
// Closing Scanner on System.in also closes System.in.
// In large programs, that can be annoying—but for learning, it’s fine.
// ✅ Way 2: try-with-resources (cleanest)
// try (Scanner sc = new Scanner(System.in)) {
//     int a = sc.nextInt();
// }
// Java auto-closes it.
// Elegant. Safe. Interview-friendly.
// Should YOU worry about this now?
// Tell it like it is
// ❌ For beginner DSA programs → don’t stres
// ✅ For production / interviews → know the reason
// Interviewers don’t reject you for this.
// But understanding it shows engineering maturity.
// One-line memory trick 🧠
// If you open a resource, Java expects you to close it.
// Old rule. Still true.
