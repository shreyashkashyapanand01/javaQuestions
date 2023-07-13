/*
 * find the first occurence of a given element x, in that the given array is sorted.
 * if no occurence of x is found return -1;
 * 
 * input:- arr={2,5,5,5,6,6,8,9,9,9};
 * int x=5;
 * output:- 1
 */

public class q1 {

    static int findIndex(int arr[],int x){
       int n = arr.length;
       int start = 0 ; int end =n-1;
       int firstIdx=-1;

       while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==x){
            firstIdx=mid;
            end=mid-1;
        }
        else if(x<arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
       return firstIdx;
    }
    public static void main(String[] args) {
        int arr[]={2,5,5,5,6,6,8,9,9,9};
        int x=5;
        System.out.printf("first occurence of %d is found at index %d",x,findIndex(arr, x));
    }
}
