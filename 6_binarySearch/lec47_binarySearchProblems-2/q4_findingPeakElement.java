/* given a 0-indexed integer array nums, find a peak elemet and return its index
 * if the array contains multiple peaks return the index to any of the peaks
*/

public class q4_findingPeakElement {

    static int findPeakElement(int a[]){
        int st=0, end = a.length-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(( mid==0 || a[mid]>a[mid-1])&&(mid==a.length-1 || a[mid]>a[mid+1])){
                return mid;
            }
            if(a[mid]<a[mid+1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }
    
    public static void main(String[] args) {
       int arr[]={1,2,1,3,5,6,4};
        if (findPeakElement(arr)==-1) {
            System.out.println("error");
        }else{
            System.out.println("peak element is :- "+findPeakElement(arr));
        }
    
    
}
}
