public class pattern8{
    public static void main(String[] args) {
        int i,j,s;
        int n=5;
         for ( i = 1; i <= n; i++) 
         {
            for ( s = 1; s <= n - i; s++) 
            {
                System.out.print(i*s+" ");
            }
            System.out.println();     
         }
    }   
}
