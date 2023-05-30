//given an array of n integers and a target value x. Print whether x exist 
//in the given array or not

import java.util.Scanner;

public class q1_linearSearch {
    static boolean search(int arr[] , int idx , int target){
        //base case
        int n = arr.length;
        if(idx>=n){
            return false;
        }

        //self work
        if (arr[idx] == target) {
            return true;
        }

        //recursive work
        if (search(arr, idx+1, target)) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[]= new int [n];

      //  System.out.println("enter the elements of the array":- );
      System.out.println("enter the elements of the array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target:-");
        int y = sc.nextInt();

        System.out.print("is present ");
        if (search(arr, 0, y)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
