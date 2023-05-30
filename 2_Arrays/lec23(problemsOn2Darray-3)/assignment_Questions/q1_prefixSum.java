/* Given a matrix arr[][] of integers, print the prefix sum matrix for it. 
Input:
n = 3
m = 3
[[1,2,3],[4,5,6],[7,8,9]]
Expected Output:
[[1,3,6],[5,13,25],[12,33,67]] */

import java.util.Scanner;

public class q1_prefixSum {
    static void takeInput(int mat[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void prefixSum(int mat[][],int r , int c){
        int arr[][]= new int [r][c];

        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j] = mat[i][j];
                if(i == 0 && j == 0){
                    continue;
                    }else if(i == 0){
                    arr[i][j] += arr[i][j-1];
                    }else if(j == 0){
                    arr[i][j] += arr[i-1][j];
                    }else{
                    arr[i][j] += arr[i-1][j] + arr[i][j-1];
                    }
            }
        }
      printMatrix(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][] = new int[r][c];
        System.out.println("enter " + r * c + " elements of the matrix :- ");
        takeInput(mat);

        System.out.println("your original matrix is :- ");
        printMatrix(mat);

        System.out.println("prefix sum matrix :- ");
        prefixSum(mat, r, c);
    }
}
