//Encapsulation is the process of wrapping code and data together into a single unit.
//Just like a capsule which is mixed of several medicines. The medicines are hidden data to the end user.

// A Java class which is a fully encapsulated class.
public class Car{
      
    // private variable (Could not access directly) 
    private String name;
      
    // getter method for name  
    public String getName() {
           return name;     
    }
      
    // setter method for name  
    public void setName(String name){
           this.name = name  
    }
      
}
  
  
// Java class to test the encapsulated class.  
public class Test{

    public static void main(String[] args){
          
            // creating instance of the encapsulated class  
            Car car = new Car();
          
            // setting value in the name member  
            car.setName("Ford");
          
            // getting value of the name member  
            System.out.println(car.getName());   
    }
      
}
