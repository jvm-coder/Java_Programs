import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    double withdrawl_bal = sc.nextDouble();
	    double curr_bal = sc.nextDouble();
	    
	    if (withdrawl_bal % 5 == 0 && curr_bal >= withdrawl_bal + 0.5){
	        curr_bal = curr_bal - (withdrawl_bal + 0.5);
	    }
		// your code goes here
		System.out.printf("%.2f",curr_bal);
	}
}
