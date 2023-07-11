/*
 * given an array where all its elements are stored in increasing order except two swapped elements,
 * sort it in linear time, Assume there are no duplicates in the array
 * 
 * input:- a[]={3,8,6,7,5,9,10}
 * output:- a[]={3,5,6,7,8,9,10}
 */

public class q1 {
    static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sort(int arr[]) {
        int n = arr.length;
        int x = -1, y = -1;

        // process all adjacent elements
        if (n <= -1)
            return;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) { //first conflict
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {   //2nd conflict
                    y = i;
                }
            }
        }
        // swap x and y
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        int a[] = { 3, 8, 6, 7, 5, 9, 10 };

        System.out.println("original array is :- ");
        print(a);
        sort(a);
        System.out.println("\narray after sorting is :- ");
        print(a);
    }
}
