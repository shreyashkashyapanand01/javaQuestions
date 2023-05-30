/*- Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
if every diagonal from top-left to bottom-right has the same elements. (Medium)
Input1:
n = 3
m = 4
arr[]=[1, 2, 3, 4],
      [5, 1, 2, 3],
      [9, 5, 1, 2]

expected output:
true */

import java.util.Scanner;

public class q3_toeplitz {

    static void takeInput(int mat[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]= sc.nextInt();
            }
        }
    }

    static void printMatrix (int mat [] []){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean checkToeplitz(int [][] mat){
        boolean ans = false;

        for (int i = 0; i < mat.length-1; i++) {
            for (int j = 0; j < mat[i].length-1; j++) {
                if(mat[i][j]==mat[i+1][j+1]){
                    ans = true;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][]=new int [r][c];
        System.out.println("enter "+r*c+" elements of the matrix :- ");
        takeInput(mat);

        System.out.println("your matrix is :- ");
        printMatrix(mat);

        boolean ans = checkToeplitz(mat);
        System.out.println("is toeplitz = "+ans);

    }
}
