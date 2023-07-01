//package 4_recursion.lec35(find subsequences&subsets);

//solve qeustion 1 without using extra space(ArrayList)

import javax.swing.SizeRequirements;

public class q2_method2_findSubsiquences {
   static void  printSSQ(String s , String currAns){
    
    if(s.length()==0){
        System.out.print(currAns+" ");
        return;
    }

    char curr = s.charAt(0);
    String remString = s.substring(1);
    printSSQ(remString, currAns+curr);
    printSSQ(remString, currAns);
       }

    public static void main(String[] args) {
      String s = "abc";

      printSSQ(s, "");
    }
}
