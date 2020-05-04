package jackson;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        if (s1.startsWith("z") && !s2.startsWith("z")){
            return -1;
        }
        else if (!s1.startsWith("z") && s2.startsWith("z")) {
            return 1;
        }
        else {
            return s1.compareTo(s2);
        }
    }
}
