/*given an array of size N contining only 0s,1s and 2s;
sort the array in ascending order
input:- N=6, arr[]={0,2,1,2,0,0};
output:- {0,0,0,1,2,2};
*/

//ALSO KNOWN AS DUCH NATIONAL FLAG ALGORITHM

public class q3_imp {
    static void print(int arr[], int idx){
        if(idx>=arr.length) return;
        System.out.print(arr[idx]+" ");
        print(arr, idx+1);
    }
    static void swap(int arr[] , int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void sort(int arr[], int n){
        int low=0, mid=0, high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,2,0,0};
        System.out.println("array before sorting :- ");
        print(arr, 0);

        System.out.println("\narray after sorting :- ");
       sort(arr,arr.length);
       print(arr, 0);
    }
}
