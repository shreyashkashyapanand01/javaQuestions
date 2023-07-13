/*
 * a rotated array is sorted array on whoch rotation operation has been performed some number 
 * of times. Given a rotsted sorted array, find the index of the minimum element in the array
 * Foloow 0 based indexing
 * 
 * it is guranteed that all the elements in the array are unique
 * 
 * input:- array={3,4,5,1,2}
 * 
 * output:- 3
 */

public class q1_indexMinInteger {
    static int findIndex(int arr[]){
        int n = arr.length;

        int start=0, end=arr.length;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=n-1){
                ans = mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,8,5,1,2};
        System.out.print("index of the minimum element present in the array is :- ");
        System.out.println(findIndex(arr));
    }
}
