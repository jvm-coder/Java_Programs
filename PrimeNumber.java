import java.util.*;
public class PrimeNumber{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = in.nextInt();
        int flag=0;
        for(int i =2;i<num;i++)
        {
            if(num%i==0)
            {
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("NOT A PRIME NUMBER");
        }
        else{
            System.out.println("PRIME NUMBER");
        }
    }
}