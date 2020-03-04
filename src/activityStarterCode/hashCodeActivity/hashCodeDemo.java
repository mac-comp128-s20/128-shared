package hashCodeActivity;

import java.util.*;



public class hashCodeDemo {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Slavica Teke", 160610));
        students.add(new Student("Alexandra Reis", 901211));
        students.add(new Student("Draven Reyer", 235054));
        students.add(new Student("Draven Reyer", 235054));
        students.add(new Student("Pallav Ahearn", 319131));
        students.add(new Student("Pallav McQueen", 531242));
        students.add(new Student("Victorius Wortham", 902373));
        students.add(new Student("Alexandra Reis", 234628));
        students.add(new Student("Gaios Best", 131537));
        students.add(new Student("Wigbrand Spalding", 704970));
        students.add(new Student("James McQueen", 902373));


        Map<Integer, List<Student>> collisionMap = new HashMap<>();
        Map<Integer, List<Student>> allEntriesMap = new HashMap<>();

// Insert all elements into buckets based on their hash value
        students.forEach(value -> {
            //TODO: Add the collided entries into the collisionMap as <hash code, [list of collided entries]> and
            // add all entries into the allEntriesMap in the same way
            // If no such hash code is generated before, place the code and an empty list to the collisionMap
            // also do the same for the allEntriesMap
            // Otherwise (if this code is already generated before, then this is a collision)
            // add this collided object to the list corresponding to the hash code key in collisionMap and
            // also do the same for allEntriesMap
            
            
            
            
        });

        // Sum up the number of values in each bucket
        int collisions = collisionMap.values().stream().map(List::size).reduce(0, Integer::sum);
        System.out.printf("Number of collisions: %d\n", collisions);

        System.out.println("============== Showing Collided Values ========================");
        //TODO: Display the <key, value> entries in collisionMap
        
        
        System.out.println("\n============== Showing All Values ========================");
        //TODO: Display the <key, value> entries in allEntriesMap
        
        

    }
}
