//package 4_recursion.lec35(find subsequences&subsets);

public class q3_sumOfSubsets {
    //given an array of integers, print sums of all subsets in it.
    //output sums can be printed in any order

    static void subsetSum(int arr[] , int  idx , int currentSubsetSum){
        int n =arr.length;
        //base case
        if(idx>=n){
            System.out.println(currentSubsetSum);
            return;
        }


        //curr idx+sum
        subsetSum(arr, idx+1, currentSubsetSum+arr[idx]);

        //current ans
        subsetSum(arr, idx+1, currentSubsetSum);
    }

    public static void main(String[] args) {
        int arr[]={2,4,5};

        int idx=0, currentSubsetSum=0;

        subsetSum(arr, idx, currentSubsetSum);
    }
}
