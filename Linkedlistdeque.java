// deque implementation using LinkedList
import java.util.*;

public class Linkedlistdeque
{   
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i=0;i<6;i++){
		    deque.add(sc.nextInt());
		}
		System.out.println(deque);
		 // add at the last
        deque.add(344);
        // add at the first
        deque.addFirst(77);
        // add at the last
        deque.addLast(89);
        // add at the first
        deque.push(56);
        // add at the last
        deque.offer(90);
        // add at the first
        deque.offerFirst(800);
        System.out.println(deque);
        // remove First
        deque.removeFirst();
        // remove Last
        deque.removeLast();
        System.out.println(deque);
	}
}
