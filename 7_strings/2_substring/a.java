import java.util.*;

public class a {
    public static void main(String[] args) {
        // substring is the continious part of a string

        String s1 = "abcdef";
        System.out.print(s1.substring(0, 3)); // d will not be printed...why???\
        System.out.println();

        System.out.print(s1.substring(0)); // whole string will be printed
        System.out.println();

        String s2 = "physics";
        for (int i = 2; i < 4; i++) {
            System.out.print(s2.substring(i));
        }
        System.out.println();

        // print all substring of the below given substring
        String s3 = "abcd";

        for (int i = 0; i < s3.length() - 1; i++) {
            for (int j = i + 1; j < s3.length(); j++) {
                System.out.println(s3.substring(i, j));
            }
        }
    }
}
