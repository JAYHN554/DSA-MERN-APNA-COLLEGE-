public class binary
{
    public static void main(String args[])
    {
        int a=10;
        for(int i=2;i<=a-1;i=i+2)
        {
            if(a%i==0)
                System.out.print("0");
            else
                System.out.print("1");
        }   
    }
}