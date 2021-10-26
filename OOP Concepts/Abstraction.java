// Abstraction is a process of hiding implementation details and exposes only the functionality to the user. 
// As an example, a driver will only focus on the car functionality (Start/Stop -> Accelerate/ Break)
// He/she does not bather about how the Accelerate/ brake mechanism works internally. This is how the abstraction works.

// Abstract class
public abstract class Car {
	public abstract void stop();
}

// Concrete class
public class Ford extends Car {
	// Hiding implementation details
	@Override 
	public void stop(){
		System.out.println("Ford::Stop");
	}
}

public class Main {
	public static void main(String args[]){
		Car obj = new Ford(); // Car object 
		obj.stop(); // Call the method
	}
}

