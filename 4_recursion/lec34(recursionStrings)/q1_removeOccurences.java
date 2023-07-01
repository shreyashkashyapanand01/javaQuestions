//remo ve all occurences of 'a' in the given string

public class q1_removeOccurences {

    static String remove(String s, int idx) {
        // base case
        if (idx == s.length())
            return "";

        // recursive work
        String smallAns = remove(s, idx + 1);

        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }

        // return smallAns;
    }

    public static void main(String[] args) {
        String s = "abcax";

        System.out.println(remove(s, 0));

    }
}
