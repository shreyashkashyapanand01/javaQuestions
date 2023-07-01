import java.util.Scanner;

public class q3_secondMethod {
    static boolean palindrome(String s , int idx){
        //base case
        if(s.length()<=idx) return true;

        //self work &recursive work
        return(s.charAt(idx)==s.charAt(s.length())&&palindrome(s, idx+1));



    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string:- ");
        String s = sc.nextLine();

        System.out.println("is palidrome = "+palindrome(s, 0));


    }
}
