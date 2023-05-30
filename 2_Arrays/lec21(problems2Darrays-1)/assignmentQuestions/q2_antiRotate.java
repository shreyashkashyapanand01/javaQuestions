/**
 Q2 - Given a square matrix, rotate it by 90 degrees in anti clockwise direction. (Medium)
Input1:

Expected Output:

// Store current cell in temp variable
// Move values from right to top
n = 3
m = 3
matrix =  [1,2,3]
          [4,5,6]
          [7,8,9]

3 6 9
2 5 8
1 4 7
 */

 import java.util.Scanner;
public class q2_antiRotate {

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

    static void transpose (int mat[][], int r , int c){
        int temp;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
               temp= mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp;
            }
        }
    }

    

    static void AntiRotate (int matrix [][] , int r , int c){
      transpose(matrix, r, c);
      int n = r;
      for (int i = 0; i < n/2; i++) {
        int[] temp = matrix[i];
        matrix[i] = matrix[n-1-i];
        matrix[n-1-i] = temp;
    }
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        System.out.println("enter number of rows and columns of MATRIX 1:- ");
       Scanner sc = new Scanner(System.in);
       int r1 = sc.nextInt();
        int c1 = r1;

      int mat[][]= new int [r1][c1];

      System.out.println("enter "+r1*c1+" the elements of the matrix :- ");
      takeInput(mat);

      System.out.println("orignal matrix :- ");
      printMatrix(mat);
      System.out.println(" matrix after rotating 90 anti clockwise :- ");
      AntiRotate(mat, r1, c1);
      
    }
    
}