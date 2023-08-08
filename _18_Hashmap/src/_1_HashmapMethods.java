import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class _1_HashmapMethods {
    static void hashMapMethods(){
        //SYNTAX
        Map<String,Integer> mp = new HashMap<>();
        //ADDING ELEMENTS
        mp.put("Akash",21); //key-->akash, value-->21
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        /*so we can say that mp.put() is used to add/update the value of keys in a Hashmap*/

        //GETTING VALUE OF A KEY FROM THE HASHMAP
        System.out.println(mp.get("Akash")); //returns the value of the key
        System.out.println(mp.get("shreyash")); //return null because there is no any key named shreyash
        /*so we can say that mp.get() is used to get the value of keys (if existed) in a Hashmap
        * or it will return null*/

        //CHANGING AND UPDATING THE VALUE OF A HASHMAP KEYS
        mp.put("Akash",20); //now the value of akash will be updated to 20
        System.out.println(mp.get("Akash"));
        //Note:- the key of hashmap is always unique

        //REMOVE A PAIR FROM THE HASHMAP
        System.out.println( mp.remove("Akash"));
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("riya"));
        /*so we can say that mp.remove() is used to remove/get the value of keys(if existed) in a Hashmap
        * or it will return null*/

        //CHECKING IF A KEY IS IN THE HASHMAP
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));
        /*so we can say that mp.containsKey() is used to check if the given key is existing in the hashmap or not*/

        //ADDING A NEW ENTRY ONLY IF THE NEW KEY DOESN'T EXIST ALREADY
        mp.putIfAbsent("Yashika",25); //will enter
        mp.putIfAbsent("Yash",30); //will not enter
        System.out.println(mp);

        //GET ALL KEYS IN A HASHMAP
        System.out.println(mp.keySet());

        //GET ALL VALUES IN A HASHMAP
        System.out.println(mp.values());

        //GET ALL ENTRIES IN THE HASHMAP
        System.out.println(mp.entrySet());

        //TRAVERSING ALL THE ENTRIES OF HASHMAP -- MULTIPLE METHODS
                //M-1 (for-each loop)
        for(String key : mp.keySet()){
            System.out.printf("age of %s is %d \n", key , mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        hashMapMethods();
    }
}
