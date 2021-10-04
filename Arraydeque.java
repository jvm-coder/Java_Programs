///Implementaion of Deque using ArrayDeque
//--->ArrayDeque does not support concurrent access by multiple threads.
//-->ArrayDeque class is likely to be faster than Stack when used as a stack.
//-->ArrayDeque class is likely to be faster than LinkedList when used as a queue.
import java.util.*;

public class Arraydeque
{
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	     Deque<Integer> deque = new ArrayDeque<Integer>();
		
		for (int i=0;i<6;i++){
		    deque.add(sc.nextInt());
		}
		System.out.println(deque);
		//add at end 
		deque.add(23);
		//add at first
		deque.addFirst(25);
		//add at last 
		deque.addLast(46);
		// get first 
		System.out.println(deque.getFirst());
		// get Last 
		System.out.println(deque.getLast());
		//push element at head;
		deque.push(89);
		System.out.println(deque);
		//pop element from end
		deque.pop();
		System.out.println(deque);
		//remove element first element 
	    deque.removeFirst();
	    System.out.println(deque);
		// remove last element 
		deque.removeLast();
		System.out.println(deque);
	}
}
