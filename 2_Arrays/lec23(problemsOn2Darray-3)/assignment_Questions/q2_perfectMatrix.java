//package 2_Arrays.lec23(problemsOn2Darray-3).assignment_Questions;
/*Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
a) All the elements in the diagonals of the matrix are non-zero integers.
b) All other elements except the diagonal elements are 0.
Given a 2D integer array grid of size n*n representing a square matrix, return true if the grid is a perfect matrix.
Otherwise, return false.
Input: 
n = 4
arr[] = [[1,0,0,1],[0,2,1,0],[0,1,2,0],[3,0,0,1]]
Expected Output: 
true */

import java.util.Scanner;

public class q2_perfectMatrix {
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

   static boolean perfectMatrix(int mat[][], int n) {
        boolean ans = true ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (mat[i][j] == 0) {
                        ans=false;
                    }
                } else{
                    if (mat[i][j] != 0) {
                        ans = false;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix :- ");
        int r = sc.nextInt();

        int c = r;

        int mat[][] = new int[r][c];
        System.out.println("enter " + r * c + " elements of the matrix :- ");
        takeInput(mat);

        System.out.println("your original matrix is :- ");
        printMatrix(mat);

        boolean answ = perfectMatrix(mat, c);
        System.out.println("is perfect = "+answ);
    }
}
