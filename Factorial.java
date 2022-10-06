import java.util.*;
public class Factorial 
{
    public static int fact(int n)
    {
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int f = fact(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
}