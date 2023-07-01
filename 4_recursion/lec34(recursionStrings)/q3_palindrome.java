import java.util.Scanner;

public class q3_palindrome {
    static String isPalindrome(String s, int idx) {
        // base case
        if (s.length() == idx)
            return "";

        // recursive work
        String smallAns = isPalindrome(s, idx + 1);

        // self work
        return smallAns + s.charAt(idx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your string:- ");
        String s = sc.nextLine();

        String rev = isPalindrome(s, 0);
        if (rev.equals(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        // System.out.println("is the given string palindrome "+isPalindrome(s,0));
    }
}
