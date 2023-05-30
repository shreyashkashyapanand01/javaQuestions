

/**
- Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix. (Medium)
Input1:
n = 3
m = 3
arr[]=  [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]

Expected Output:
        1, 4, 2,
        7, 5, 3,
        8, 6, 9
 */

 import java.util.Scanner;
public class q4_digonalMat {
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

    static void diagonal(int mat [][], int m , int n){
        int[] arr = new int[n*m];
 int idx = 0;
 int row = 0;
 int col = 0;
        while(col < m){
            int i = row;
            int j = col;
        while(i >= 0 && j < m){
             arr[idx] = mat[i][j];
                idx++;
                i--;
                j++;
                    }
            row++;
            if(row >= n){
                row = n-1;
            col++;
        }
    }
        for(int i = 0; i < arr.length; i++){

         System.out.print(arr[i] + " ");
   
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows and columns of the matrix :- ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    int mat[][]=new int [r][c];
    System.out.println("enter "+r*c+" elements of the matrix :- ");
    takeInput(mat);

    System.out.println("your original matrix is :- ");
    printMatrix(mat);

    System.out.println("diagonal elements of the matrix is :- ");
    diagonal(mat, r, c);
  }
    
}