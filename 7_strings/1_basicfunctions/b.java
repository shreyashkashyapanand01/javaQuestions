import java.util.*;
public class b {
    public static void main(String[] args) {
        //charAt()  and  length()

        String s = "shreyash",str="shreyash";
        int l = s.length();
        System.out.println(l);
        
        char c = s.charAt(3);
        System.out.println(c);                          System.out.println();
        
        //indexOf()    and  comapreTo()

        String s1 = "shreyash kashyap anand";
        System.out.println(s1.indexOf('a'));

        /*comapreTo()...results
        if string1 == string2 (ans=0)
        if string1>string2 (ans>0; )
        if string1<string2 (ans<0; )
        */

        System.out.println( s1.compareTo(s));
        System.out.println( s.compareTo(s1));
        System.out.println( s.compareTo(str));                              System.out.println();

        //coantains()   startsWith()

        System.out.println(s.contains("shre")); System.out.println(s.contains("slakfjl"));
        System.out.println(s.startsWith("k"));
        System.out.println();

        //toLowerCase()  toUpperCase()    concat()

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(s1));
        System.out.println();
    }
}
