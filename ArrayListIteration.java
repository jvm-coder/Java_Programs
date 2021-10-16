import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C","C++","Java","Spring");

        //Basic for loop
        for(int i=0; i<courses.size();i++){
            System.out.println(courses.get(i));
        }

        //Enhanced For loop
        for(String course: courses){
            System.out.println(course);
        }

        //basic loop with iterator
        for(Iterator<String> iterator = courses.iterator();iterator.hasNext();){
            String course = (String)iterator.next();
            System.out.println(course);
        }

        //iterator with while loop
        Iterator<String> iterate = courses.iterator();
        while(iterate.hasNext()){
            String course = (String)iterate.next();
            System.out.println(course);
        }

        //Java 8 stream + lambda
        System.out.println("Java 8 Lambda");
        courses.stream().forEach(course -> System.out.println(course));

        // Java 8 forEach + lambda
        courses.forEach(course -> System.out.println(course));
    }
}