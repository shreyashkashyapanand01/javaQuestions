/*
 * search the target value in 2d integer matrix of dimensions n*m and return true if found,else return fa.se.
 * this matrix has the following properties:
 * 1:-integers in each ro sorted from left to right
 * 2:-the first integer of each row is greater than the last integer of the previous row.
 * 
 */

import java.util.Scanner;

public class q1_BS_in2D_matrix {

    static void takeInput(int arr[][] , int m, int n){
        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i<m ; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    static boolean searchMatrix(int arr[][], int target){
        //nunber if rows =n , number of cols=m
        int n =arr.length;
        int m =arr[0].length; 

        int start =0 , end=(n*m)-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int midElement = arr[mid/m][mid%n];

            if(midElement==target) return true;

            if(target<midElement){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target=10;

       System.out.println("is target element present in the given array :- ");
       System.out.println(searchMatrix(arr, target));
    }
}
