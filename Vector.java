import java.util.*;

public class Vector
{ 
    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    //creating vector object 
		Vector<Integer> vec =new Vector<Integer>();
		for(int i=0;i<7;i++){
		    vec.add(i);
		}
		//print vec
		System.out.println("vec:"+vec);
		//vector size..
		System.out.println("vec_size:"+vec.size());
		//vector_capacity
		System.out.println("vec_capacity:"+vec.capacity());
		//add element vec
		vec.add(25);
		//add element at index i
		vec.add(1,45);
		//vector first element
		System.out.println("first_element:"+vec.firstElement());
		//vector last element
		System.out.println("first_element:"+vec.lastElement());
		//vector contains
		System.out.println("Element:"+vec.contains(26));
		//vector index of 
		System.out.println("Index:"+vec.indexOf(25));
	}
}
