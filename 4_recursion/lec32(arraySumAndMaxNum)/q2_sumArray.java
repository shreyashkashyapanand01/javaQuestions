import java.util.Scanner;

public class q2_sumArray {

    static int calcSum(int arr[] , int idx){
        //base case 
        if(idx==arr.length){
            return 0;
        }

        //recursive work- subproblem

        int smallAns = calcSum(arr, idx+1);

        //self work
        return smallAns + arr[idx];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:-");
        int n = sc.nextInt();

        int arr[]=new int [n];

        System.out.println("enter the elements of the array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("sum of the elements of the given array is :- "+calcSum(arr, 0));
    }
}
