/*Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”. (Medium)
Assignment Solutions

Input1:

Expected Output:
n1 = 2
m1 = 3
arr1 = {{2,4,1}, {3,,6}}
n2 = 3
m2 = 2
arr2 = {{1,2}, {3,4}, {,7}}

19 27
48 68 */

import java.util.Scanner;

public class q1_matrixMul {

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

    static int[][] mulMatrix(int mat1[][], int mat2[][], int r1, int r2 , int c1 , int c2 ){
        int ans [][] = new int [r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
            
        }


        return ans;
    }
    public static void main(String[] args) {
       System.out.println("enter number of rows and columns of MATRIX 1:- ");
       Scanner sc = new Scanner(System.in);
       int r1 = sc.nextInt();
      int c1 = sc.nextInt();

       System.out.println("enter number of rows and columns of MATRIX 2:- ");
       int r2 = sc.nextInt();
       int c2 = sc.nextInt();

       if (c1 != r2) {
        System.out.println("multiplication not possible");
        return;
       }

      int mat1 [][] = new int[r1][c1];
      int mat2 [][] = new int [r2][c2];

      System.out.println("enter the elements of the matrix1 :- ");
       takeInput(mat1);

       System.out.println("enter the elements of the matrix2 :- ");
       takeInput(mat2);

       System.out.println("matrix1 is :- ");
       printMatrix(mat1);

       System.out.println("matrix 2 is :- ");
       printMatrix(mat2);

       System.out.println("matrix1 * matrix2 = ");
       int answ[][] = mulMatrix(mat1, mat2, r1, r2, c1, c2);
       printMatrix(answ);
       







    }
}
