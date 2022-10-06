import java.lang.*;
import java.util.*;
public class ZigZag{
    public static void main(String arg[])
    {
        int n,k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till you want to print the numbers");
        n = in.nextInt();
        System.out.println("Enter the no. of rows");
        k = in.nextInt();
        String grid[][] = new String[k][n];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=" ";
            }
        }
        for(int i=0;i<n;i++)
        {
            int m = k-1;
            int colm = m-Math.abs(i%(2*m)-m);
            grid[colm][i]=Integer.toString(i+1);
        }
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}