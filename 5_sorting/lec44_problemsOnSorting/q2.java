/*
 * given an array of positive and negative integerrs, segregate them in linear time and constant space.
 * the output should print all negative numbers, followed by all positive numbers 
 * 
 * input:- [19,-20,7,-4,-13,11,-5,-3]
 * output:- [-20,-4,-13,-5,7,11,19,3]
 */

public class q2 {
    static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //we'll be using quick sorting
    static void sort(int arr[]){
        int l =0, r=arr.length;

        while(l<r){
            while(arr[l]<0)l++;
            while(arr[r]>=0)r--;

            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }

    }
    public static void main(String[] args) {
        int a[]={19,-20,7,-4,-13,11,-5,-3};

        System.out.println("array before sorting :- ");
        print(a);

        sort(a);

        System.out.println("\n array after sorting :- ");
        print(a);
    }
}
