//package 4_recursion.lec35(find subsequences&subsets);

/*
 * given a string WAM to return all its subsequences in an array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class q1_findSubsequences {

    static ArrayList<String> getSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();

        //base case
        if(s.length()==0) {
            ans.add("");
            return ans;
        }


        //storing first index of the string
        char curr = s.charAt(0);

        //recursive work
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        //self work
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string:- ");
        String s = sc.nextLine();

        ArrayList<String>ans=getSSQ(s);

        for( String ss : ans){
            System.out.print(ss+" ");
        }




    }
}
