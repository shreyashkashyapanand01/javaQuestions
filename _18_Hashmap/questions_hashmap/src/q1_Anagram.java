import java.util.HashMap;

public class q1_Anagram {
    /*
    check whether two strings are anagram of each other. Return true if they are else return false
    An anagram of a string is another string that contains the same characters, only rhe order of characters
    can be different. For example , "abcd" and "dabc" are an anagram of each other

    INPUT :- listen , silent
    OUTPUT :- true

    INPUT :- anagram, gram
    OUTPUT :- false
    * */

    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();

        for (int i = 0 ; i<str.length(); i++){
            Character ch = str.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
    //1st APPROACH - SPACE CONSUMING
    public static boolean isAnagram1(String s , String t ){
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> mp1 = makeFreqMap(s);
        HashMap<Character,Integer> mp2 = makeFreqMap(t);

        return mp1.equals(mp2);
    }

    //2nd APPROACH LESS SPACE CONSUMING
    public static boolean isAnagram2(String s , String t ){
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> mp = makeFreqMap(s);
        for(int i = 0 ; i<t.length() ; i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch,currFreq-1);
        }
        //all f=values in mp should be 0 for s and t tobe anangrams
        for (Integer i : mp.values()){
            if(i!=0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("is Anagram :- ");
        String s1 = "abcd";
        String s2 = "dbac";
        System.out.println(isAnagram1(s1,s2)); //method 1
        System.out.println(isAnagram2(s1,s2)); //method 2
    }
}
