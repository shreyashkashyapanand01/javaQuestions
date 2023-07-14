/*java program to reverse each word in a string */

public class q4_reverseEachWord {

    static void reverse(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }

        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "shreyash kashyap anand";
        reverse(s);

    }
}
