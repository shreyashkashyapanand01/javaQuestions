import java.util.Scanner;

public class b_QueriesRangeSum {

    public static int [] prefixSum (int arr []) {
        for(int i = 1 ; i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void TakeInput(int arr[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= arr.length; i++) //because given array is 1 based indexing
        {
            arr[i]=sc.nextInt();
        }
    }

    public static void printArray(int arr[]){
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :- ");
        int n = sc.nextInt();
        int arr []= new int [n];
        System.out.println("enter the elements of the array :- ");
        TakeInput(arr);
        System.out.println("original array is :- ");
        printArray(arr);

        int []prefSum=prefixSum(arr);

        System.out.println("\n enter number of queries :- ");
        int q = sc.nextInt();

        while(q-->0)
        {
            System.out.println("\n enter range :- ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r]-prefSum[l-1];
            System.out.println("\nsum = "+ans);
        }

    }
}
