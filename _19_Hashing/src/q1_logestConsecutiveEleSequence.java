import java.util.HashSet;

public class q1_logestConsecutiveEleSequence {
    /*
    given an unsorted array of integers nums, return the length of the longest consecutive elements sequence
    INPUT:- {100,4,200,1,3,2}
    OUTPUT:- 4

    INPUT :- {0,3,7,2,5,8,4,6,0,1}
    OUTPUT:- 9
    * */

    static int longestLength(int nums[]){
        HashSet<Integer> st = new HashSet<>();
        for (int num:nums) st.add(num);
        int maxStreak=0;
        for (int num : st){
            if (!st.contains(num-1)){ //num is starting point of a sequence
                int currNum = num;
                int currStreak = 1; //length of current consecutive sequence
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        int arrr[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestLength(arr));
        System.out.println(longestLength(arrr));
    }
}
