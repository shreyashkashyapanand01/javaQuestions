
import java.util.*;

public class _3_SortedHashmap {
    static void sortedHashmapExamples(){
        //used for sorting
        TreeMap<Integer, String> mp = new TreeMap<>();

        mp.put(2, "shreyash");// mp.put(element1,element2) --> is used to add elements in the hashmap
        mp.put(1, "kashyap");
        mp.put(3, "Anshu");

        System.out.println(mp);
    }

    public static void main(String[] args) {
        sortedHashmapExamples();
    }
}
