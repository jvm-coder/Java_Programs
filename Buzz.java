import java.util.*;
public class Buzz
{
    public static void main(String args[])
    {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=scan.nextInt();
        if(n%7==0||n%10==7)
        {
            System.out.println(n+" is a Buzz number");
        }
        else
        {
            System.out.println(n+" is not a Buzz number");
        }
    }
}
