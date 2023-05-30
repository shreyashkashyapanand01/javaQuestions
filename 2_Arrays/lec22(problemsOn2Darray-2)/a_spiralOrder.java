import java.util.Scanner;

public class a_spiralOrder {

    static void printSpiralOrder(int [][] mat , int r , int c){
        int topRow=0, bottomRow=r, leftCol=0, rightCol=c-1, totalElements=0;

        while(totalElements<r*c){

            //topRow --> leftCol to rightCol
            for(int j = leftCol ; j<= rightCol && totalElements<r*c ; j++){
                System.out.print(mat[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements<r*c; i++) {
                System.out.print(mat[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //bottomRow --> rightCol to leftCol
            for(int j= rightCol; j>= leftCol && totalElements<r*c ; j--){
                System.out.print(mat[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol --> bottomRow to topRow
            for(int i = bottomRow ; i>=topRow && totalElements<r*c ; i--){
                System.out.print(mat[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void PrintSpiralOrder(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int left = 0, right = numCols - 1, top = 0, bottom = numRows - 1;

        while (left <= right && top <= bottom) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row (if not already printed)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (if not already printed)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns :-");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat [][]= new int [r][c];

        System.out.println("enter the elements of the array :-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("your matrix is :- ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("spiral order of the given matrix is :- ");
        
      //  printSpiralOrder(mat, r, c);
      PrintSpiralOrder(mat);

    }
}
