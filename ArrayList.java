import java.util.*;
public class ArrayList
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    
	    // creating a ArrayList object
	   ArrayList<Integer> arr = new  ArrayList<Integer>();
	   int n=10;
	   for(int i=0;i<=5;i++){
	       // add element and taking input
	       arr.add(sc.nextInt());
	   } 
	   //print all elememt
		System.out.println(arr);
		//remove the 4th index elemet
		arr.remove(4);
		System.out.println(arr);
		//acessing the element by index -->method get(i)
		System.out.println(arr.get(2));
		
	}
}
