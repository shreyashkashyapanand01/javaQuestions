// package 6_binarySearch.lec45_intro-to-binarySearch;

public class ex1_usingRecursion {
    static boolean binarySearch(int arr[], int start , int end , int target){
        //base case
        if(start>end) return false;

         //self work
        int mid=(start+end)/2;

       //recursive work
        if(target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
          return  binarySearch(arr, start, mid-1, target);
        }
        else{
           return binarySearch(arr, mid+1, end, target);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
       
        int target=0;
        while(target != 11){
             System.out.printf("is %d exists in the given array = %b \n",target,binarySearch(arr, 0, arr.length-1, target));
             target++;
        }
    }
}
