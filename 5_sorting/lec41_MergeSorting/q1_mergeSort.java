import java.util.Scanner;

public class q1_mergeSort {

    static void input (int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
    }

    static void printArray(int arr[], int idx) {
        if (arr.length == idx)
            return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1; // left array size
        int n2 = r - mid; // right array size

        int left[] = new int[n1];
        int right[] = new int[n2];

        int i, j, k;

         for(i = 0; i < n1; i++) left[i] = arr[l+i];
        for(j = 0; j < n2; j++) right[j] = arr[mid+1+j];
        

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

    }

    static void mergeSort(int arr[], int l, int r) {

        // base case
        if (l >= r)
            return;

        // recursive work
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid); // first half
        mergeSort(arr, mid + 1, r); // second half

        // self work
        merge(arr, l, mid, r); // merge first half and second half

    }

    public static void main(String[] args) {
        // divide ethe array in two equal halves
        // sort the 2 subarrays seperately using recursion
        // merge the 2 sorted subarrays to create an overall sorted array


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter " +n +" elements of the array :-");
        input(arr,n);
        
        System.out.println("array before sorting ");
        printArray(arr, 0);

        mergeSort(arr, 0, n - 1);

        System.out.println("\narray after sorting ");
        printArray(arr, 0);

    }
}