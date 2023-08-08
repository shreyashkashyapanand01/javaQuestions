import java.util.HashMap;

public class q2_Isomorphic_Strings {
    /*
    Given 2 strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.

    All occurrences of a character must be replaced with another character while perceiving the order of characters.
    No two characters may map to the same character, but a character may map to itshelf.

    INPUT :- AAB XXY
    OUTPUT:- TRUE

    INPUT :- ABCDEC VIOUG
    OUTPUT:- FALSE

    * */

    public static boolean isIsomorphic(String s , String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = s.charAt(i);

            if (mp.containsKey(sCh)) {
                if (mp.get(sCh) != tCh) return false;
            } else if (mp.containsKey(tCh)) {
                return false;
            } else {
                mp.put(sCh, tCh);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean ans = isIsomorphic("aab","xxy");
        System.out.println(ans);

        boolean ans1 = isIsomorphic("sskC","VIOUG");
        System.out.println(ans1);
    }
}
