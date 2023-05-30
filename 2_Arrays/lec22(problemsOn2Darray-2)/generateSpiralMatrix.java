import java.util.Scanner;

public class generateSpiralMatrix {

    static void print (int mat [][] ){
        for(int i =0 ; i<mat.length ; i++){
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] generateSpiral (int n){
        int mat [][]= new int [n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1, curr=1;

        while(curr<=n*n){

            //topRow --> leftCol to rightCol
            for(int j = leftCol ; j<= rightCol && curr<=n*n; j++){
               mat[topRow][j]=curr;
               curr++;
            }
            topRow++;

            //rightCol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr<=n*n; i++) {
                mat[i][rightCol]=curr;
               curr++;
            }
            rightCol--;

            //bottomRow --> rightCol to leftCol
            for(int j= rightCol; j>= leftCol && curr<=n*n; j--){
               mat[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;

            //leftCol --> bottomRow to topRow
            for(int i = bottomRow ; i>=topRow && curr<=n*n ; i--){
                mat[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return mat;
    }
    

    public static void main(String[] args) {
        System.out.print("enter the size :- ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int matrix [][]= generateSpiral(n);
        print(matrix);
    }
    }
