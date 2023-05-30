import java.util.Arrays;

public class c {
    public static void main(String[] args) {
        /*      *  Given an array arr[] and an integer K where K is smaller than size of array, the task is to 
 find the Kth smallest element in the given array. It is given that all array elements are 
 distinct.
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output:
7
         */

         int array []= { 7 ,10, 4, 3, 20, 15};
         Arrays.sort(array);

         int k = 3;
         System.out.println(array[k-1]);
    }
}
