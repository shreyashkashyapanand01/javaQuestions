/*
 * given the rotated sorted array of integers, which contains distinct elements,
 * and an integer target,
 * return the index of target if it is in the array, otherwise return -1.
 * 
 * input :- array ={3,4,5,1,2}
 * target =4;
 * 
 * output:- 1
 */

public class q2_indexTarget {
    
    static int findIndex(int arr[], int target){
        int start=0 , end=arr.length-1;
        int ans=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target) return mid;
            else if(arr[mid]<arr[end]){
                if(target>arr[mid]  &&target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target>=arr[start] && target <arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,4,1,5,2};
        int target=4;

        System.out.printf("index of the target %d in the given array is %d",target,findIndex(arr, target));
    }
}
