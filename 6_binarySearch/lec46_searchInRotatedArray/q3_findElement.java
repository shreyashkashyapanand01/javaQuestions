/*
 * search element in rotated sorted array with duplicate elements.
 * return true if the element is found,
  else return false
 
 * input:- [0,0,0,1,1,1,2,0,0,0,0], target=2
 * output:- true
 */

public class q3_findElement {

    static int search_(int[] a, int target){
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[st] == a[mid] && a[end] == mid){
                st++;
                end--;
            }
            else if (a[mid] <= a[end]){ // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else { // st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 3, 1};
        int target = 1;
        System.out.printf("is target %d present in the array :- ",target);
        
        int ans=(search_(a, target));
        if(ans==1) System.out.println("true");
        else{System.out.println("false");}
    }
}
