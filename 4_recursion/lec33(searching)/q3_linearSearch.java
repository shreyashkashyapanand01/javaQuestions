public class q3_linearSearch {
//given an array of n integers and a target value x. Print whether x exist 
//in the given array or not
//if the target element is present at multiple places in the given array
//return the all index of the target element 

static void findAllIndices(int arr[], int n , int idx , int target){
   //base case
    if(idx>= n) return;

    //self work 
    if (arr[idx]==target) {
        System.out.print(idx+" ");
    }

    //recursive work
    findAllIndices(arr, n, idx+1, target);
} 

public static void main(String[] args) {
    int arr[]={1,2,3,4,4,5,6,4,1};
    int n = arr.length;
    int index =0;
    int target =4;

    findAllIndices(arr, n, index, target);

}
}
