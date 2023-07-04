/**
 * quickSort
 */
public class quickSort {

    static void printArray(int array[]){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    static void swap(int arr[],int x , int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int partition(int arr[], int st, int end){
        int pivot = arr[st];

        int count =0;

        for(int i = st+1 ; i<=end ; i++){
            if(arr[i]<=pivot) count++;
        }
        int pivotIndex=st+count;
        swap(arr, st, pivotIndex);

        int i = st, j=end;

        //elements lesser then pivot or == pivot ;left me aa jaenge 
        //elements greater then pivot right side  me aa jaenge
        while(i<pivotIndex &&j>pivotIndex){
            while(arr[i] <=pivot) i++; //pivot k pehle chote element hai to skip
            while(arr[j] > pivot) j--; //pivot k baad bade element hai to skip

            if(i<pivotIndex && j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
          return pivotIndex;

    }

    static void QuickSort(int arr[], int st, int end){
        //base case
        if(st>=end) return;

        //self work
        int pi=partition(arr,st,end);

        //recursive work
        QuickSort(arr, st, pi-1); //left side k liye
        QuickSort(arr, pi+1, end);//right side k liye
    }

    public static void main(String[] args) {
        int arr[]={6, 6, 3, 1, 5, 5, 4};
        System.out.println("original array is :- ");
        printArray(arr);

        QuickSort(arr, 0, arr.length-1);

        System.out.println("\narray after sorting ");
        printArray(arr);

    }
}