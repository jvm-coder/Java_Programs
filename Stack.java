import java.util.*;

public class Stack
{ 
    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    Stack<Integer> stack = new Stack<Integer>();
	    for(int i=0;i<7;i++){
	        stack.push(i);
	    }
	    System.out.println(stack);
	    //insert element 
	    stack.push(20);
	    System.out.println(stack);
	    //remove element  from last
	    stack.pop();
	    System.out.println(stack);
	    //check the stack is empty 
	    System.out.println(stack.empty());
	    //peek return the index of element
	    System.out.println(stack.peek());
	    // Iterator instace 
	    Iterator<Integer> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
	    
	}
}
