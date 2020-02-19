package jackson;

import java.util.*;

public class ListIteratingExamples {

    public static void main(String[] argv) {

        // create list
        List<String> companies = new ArrayList<>();

        companies.add("Facebook");
        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Apple");

        //Another way to define a list
        List<String> otherList = Arrays.asList("Facebook", "Google", "Microsoft");

        //Generally discouraged for lists, particularly LinkedLists
        for(int i=0; i < companies.size(); i++){
            System.out.println(companies.get(i));
            //This is bad! Don't modify the list while iterating with a for loop
           // if (i == 2) {
           //     companies.remove(0);
            //}
        }

        System.out.println("=====================");
        for(String cur : companies ){
            System.out.println(cur);

            // This is bad and will throw a concurrent Modification exception. Use the iterator.remove method instead with an iterator
            if (cur.equals("Google")){
                companies.remove(cur);
            }

        }

        System.out.println("=====================");
        Iterator<String> iterator = companies.iterator();
        while(iterator.hasNext()){
            String current = iterator.next();

            //This is the appropriate way to remove from a list while iterating.
            // Call the iterator remove method
            if (current.equals("Google")) {
                System.out.println(current);
                iterator.remove();
            }
        }

        ListIterator<String> listIter = companies.listIterator(1);
        while(listIter.hasNext()){
            String current = listIter.next();
            if (current.equals("Microsoft")) {
                System.out.println(current);
                iterator.remove();
            }
        }




    }

}












