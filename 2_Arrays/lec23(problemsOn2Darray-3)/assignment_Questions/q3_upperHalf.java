//package 2_Arrays.lec23(problemsOn2Darray-3).assignment_Questions;
/*Q3. Write a user defined function upper() which takes an integer square matrix as an input and its size N and prints
the upper half of the matrix.
•
Input:
N=4
arr[][]=[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]] 
Expected Output: 
1 2 3 4
  6 7 8
    11 12
       16 */

import java.util.Scanner;;

public class q3_upperHalf {

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

    static void printUpperHalf(int mat[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
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

        System.out.println("upper matrix :- ");
        printUpperHalf(mat, c);
    }
}
