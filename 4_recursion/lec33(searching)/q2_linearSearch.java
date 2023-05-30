public class q2_linearSearch {
    //given an array of n integers and a target value x. Print whether x exist 
//in the given array or not
//if present return the index of the target element else return -1

static int findIndex(int arr[], int n , int target , int idx){
    if(idx>=n){
        return -1;
    }

    //self work
    if (arr[idx] == target) {
        return idx;
    }

    //recursive work
    return findIndex(arr, n, target, idx+1);
}

public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int n = arr.length;
    int target = 5;
    int idx=0;

    System.out.println(findIndex(arr, n, target, idx));


}
}


