//Inheritance is the process of one class inheriting properties and methods from another class in Java. 
//It's just like father and son relationship.
//Son inherit fathers things as well as things of his own
//Here is a Car example senario to that


// super class
class Car {
    // the Car class have one field
    public String wheelStatus;
    public int noOfWheels;
  
    // the Car class has one constructor
    public Car(String wheelStatus, int noOfWheels)
    {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
  
    // the Car class has three methods
    public void applyBrake()
    {
        wheelStatus = "Stop"
    }
  
    // toString() method to print info of Car
    public String toString()
    {
        return ("No of wheels in car " + noOfWheels + "\n"
                + "status of the wheels " + wheelStatus);
    }
}
  
// sub class
class Ford extends Car {
  
    // the Ford subclass adds one more field
    public Boolean alloyWheel;
  
    // the Ford subclass has one constructor
    public Ford(String wheelStatus, int noOfWheels,
                 Boolean alloyWheel)
    {
        // invoking super-class(Car) constructor
        super(wheelStatus, noOfWheels);
        alloyWheel = alloyWheel;
    }
  
    // the Ford subclass adds one more method
    public void setAlloyWheel(Boolean alloyWheel)
    {
        alloyWheel = alloyWheel;
    }
  
    // overriding toString() method of Car to print more info
    @Override 
    public String toString(){
        return (super.toString() + "\nCar alloy wheel "
                + alloyWheel);
    }
}
  
// driver class
public class Main {
    public static void main(String args[]){
  
        Ford ford = new Ford(3, 100, 25);
        System.out.println(ford.toString());
    }
}
