import java.util.*;
public class _1_HashMap {
    static void MapInterfaceExamples(){
        Map<Integer,String>mp=new HashMap<>();

        mp.put(2,"shreyash");// mp.put(element1,element2) --> is used to add elements in the hashmap
        mp.put(1,"kashyap");
        mp.put(3,"Anshu");

        //iterating over keys in a map
        for(var i:mp.keySet()){
            System.out.println(i);
        }
        //iterating over values in a map
        for(var i:mp.values()){
            System.out.println(i);
        }

        //iterate over key, value, mapping
        for (var i: mp.entrySet()){
            System.out.println(i);
        }

        for (var i: mp.entrySet()){
            System.out.println(i.getValue());
        }

        System.out.println(mp);
        System.out.println(mp.get(2)); //(mp.get(index) --> is used to print the object at the particular index

        mp.put(1,"Anand"); //over-rides kashyap to anand
        System.out.println(mp);
        System.out.println(mp.get(1));

        //to overcome Over-ride we use mp,putIfAbsent(index,name);
        mp.putIfAbsent(2,"jha");
        System.out.println(mp.get(2)); //fir v shreyash hi print karega

        System.out.println(mp.containsKey(4)); //used to check the integer value present in the hashmap or not
        System.out.println(mp.containsValue("shreyash"));//used to check the String value present in the hashmap or not

        System.out.println(mp.keySet()); //returns all the integer values present in the hashmap
        System.out.println(mp.values()); //returns all the string values present in the HashMap

        System.out.println(mp.entrySet()); //prints whole keys and value
    }

    public static void main(String[] args) {
        MapInterfaceExamples();
    }
}
