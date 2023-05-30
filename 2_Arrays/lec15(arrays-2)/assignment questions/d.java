import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        /*
         *  Given an unsorted array A of size N that contains only non-negative integers, find a 
 continuous sub-array which adds to a given number S.
 In case of multiple subarrays, return the subarray which comes first on moving from left 
 to right.
 You need to print the start and end index of answer subarray

 Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output:
1 3
         */

         Scanner scn = new Scanner(System.in);
        // System.out.println(“Enter the length of array: ”);
        System.out.println("enter the length opf the array");

 int n = scn.nextInt();
System.out.println("enter the value of s :- ");
 int s = scn.nextInt();

 int[] arr = new int[n];

 for(int i = 0; i < n; i++){

 arr[i] = scn.nextInt();

 }

 int i = 0;

 int j = 0;

 int sum = 0;

 while(j < n){

 sum += arr[j];

 if(sum > s){

 while(sum > s && i < j){

 sum -= arr[i];

 i++;

 }

 }

 if(sum == s){

 System.out.print(i + " ");

 System.out.print(j);

 break;

 }

 j++;

 }
    }
}
