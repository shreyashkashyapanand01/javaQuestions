import java.util.HashMap;
import java.util.*;

public class _2_LinkedHashMap {
    //order is preserved in this

    static void LinkedHashMapExamples(){
        Map<Integer, String> mp = new LinkedHashMap<>();

        mp.put(2, "shreyash");// mp.put(element1,element2) --> is used to add elements in the hashmap
        mp.put(1, "kashyap");
        mp.put(3, "Anshu");

        System.out.println(mp);
    }

    public static void main(String[] args) {
        LinkedHashMapExamples();
    }
}
