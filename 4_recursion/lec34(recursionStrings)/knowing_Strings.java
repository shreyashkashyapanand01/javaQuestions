//package 4_recursion.lec34(recursionStrings);

import java.util.Scanner;

public class knowing_Strings {
    public static void main(String[] args) {
        
        //taking input in strings

        Scanner sc = new Scanner(System.in);


        //TAKING INPUT ANF PRINTING AN STRING
        
        //METHOD-1

       // String s1 =sc.next();
       // System.out.println(s1);

       //METHOD-2

        // String s2 = sc.nextLine();
        // System.out.println(s2);

        //METHOD-3

        String s = sc.nextLine();
        char ch = s.charAt(3);
        System.out.println("output-"+ch);

        //METHOD-4

        for(int i =0 ; i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //METHOD-5

        System.out.println(s.substring(0, 4));
        //NOTE:- begin index is inclusive and end index in exclusive

        System.out.println(s.substring(0));
    }
}
