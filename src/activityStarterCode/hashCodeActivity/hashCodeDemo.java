package hashCodeActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
            if (!collisionMap.containsKey(value.hashCode())) {
                collisionMap.put(value.hashCode(), new ArrayList<>());
                allEntriesMap.put(value.hashCode(), new ArrayList<>());
                allEntriesMap.get(value.hashCode()).add(value);

            }
            else {
                collisionMap.get(value.hashCode()).add(value);
                allEntriesMap.get(value.hashCode()).add(value);

            }
        });

        // Sum up the number of values in each bucket
        int collisions = collisionMap.values().stream().map(List::size).reduce(0, Integer::sum);
        System.out.printf("Number of collisions: %d\n", collisions);

        System.out.println("============== Showing Collided Values ========================");
        collisionMap.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println("\n============== Showing All Values ========================");
        allEntriesMap.forEach((key, value) -> System.out.println(key + ":" + value));


    }
}
