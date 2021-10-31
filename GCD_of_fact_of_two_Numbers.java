// Program to find  GCD of Factorial of Two Numbers

import java.util.Scanner;

public class GCD_of_fact_of_two_Numbers {
    static int factorial(long x)
    {
        if (x <= 1)                                                                 //terminating condition
            return 1;
        int res = 2;
        for (int i = 3; i <= x; i++)                                                //calculating factorial of the smaller number
            res = res * i;
        return res;
    }

    static int gcdOfFactorial(long m, long n)
    {
        long min = Math.min(m, n);                                                    //checking which number is smaller
        return factorial(min);                                                      //Method call for the factorial of smaller number
    }

    /* Driver program to test above functions */
    public static void main (String[] args)                                         //main function to initialize variables and call the function
    {
        long i , j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of numbers you want to check : ");
        i = in.nextLong() ;                                                       //taking inputs from the User say "6" and "8"
        j = in.nextLong();
        System.out.println("The GCD of numbers "+ i + " and " + j + " is : " +  gcdOfFactorial(i, j));                                   //Method Call with parameter pass as "i" and "j"
    }
}
