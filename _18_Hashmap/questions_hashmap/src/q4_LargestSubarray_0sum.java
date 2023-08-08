import java.util.HashMap;
import java.util.Map;

public class q4_LargestSubarray_0sum {
/*
    given an array arr[] of length n , find the length of the largest subarray with sum equal to 0(zero);

    INPUT:- n=8; arr[]={15,-2, 2,-8,1,7,10,23};
    OUTPUT:- 5;

    INPUT :- n=3; arr[]={1,2,3}
    OUTPUT:- 0;
* */
    static int zeroSumLargestSubarray(int arr[], int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        //prefixSum , index
        int maxLen=0 , prefSum=0;
        mp.put(0,-1);

        for (int i =0 ; i<arr.length;i++){
            prefSum+=arr[i];
            if (mp.containsKey(prefSum)){
                maxLen= Math.max(maxLen,i-mp.get(prefSum));
            }else {
                mp.put(prefSum,i);
            }
        }return maxLen;
    }

    public static void main(String[] args) {
        int arr[]={15,-2, 2,-8,1,7,10,23};
        System.out.println(zeroSumLargestSubarray(arr,8));
    }
}
