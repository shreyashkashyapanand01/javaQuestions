/*
 * given a mountain array 'a' of length grater than w, return the index 'i' such that arr[0]< arr[l]<...<arr[i-l]<arr[i]>arr[i+l]>...arr[arr.length-1].
 * this index is known as the peak index
 * 
 * input :- array =[0,4,1,0];
 * output:- 1
 */

public class q3_findingPeak {
    static int peakIndexnMountainArray(int a[]){
        int st=0, end=a.length-1;
        int ans=-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(a[mid]<a[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }

    public static void main(String[] args) {
        int arr[]={0,4,1,0};
        System.out.print("peak  index in the given mountain array is :- ");
        System.out.println(peakIndexnMountainArray(arr));
    }
}
