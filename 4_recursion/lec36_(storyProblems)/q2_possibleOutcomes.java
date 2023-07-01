//package 4_recursion.lec36_(storyProblems);

//given a astring containing digits from 2-9 inclusive, 
//return all possible letter combinations that the number could represent.
//retuen the answer in any order

public class q2_possibleOutcomes {
    static void combinations(String dig , String res, String kp){
        //base case
        if(dig.length()==0) {
            System.out.print(res+" ");
            return;
        }

        int currNum = dig.charAt(0)-'0'; //char ko num me convert karne k liye bero

        String currChoices = kp[currNum];

        for(int i=0 ;i<currChoices.length();i++){
            combinations(dig.substring(1), res+currChoices.charAt(i), kp);
        }
    }

    public static void main(String[] args) {
        String s = "23";

        //kepad ka mapping  kar rhe hai

        String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(s, "", kp);
    }
}
