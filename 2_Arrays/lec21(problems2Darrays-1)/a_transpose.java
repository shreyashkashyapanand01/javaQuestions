import java.util.Scanner;

public class a_transpose {

    static void input(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length ; i++){
          for (int j = 0; j < arr[i].length; j++) {
              arr[i][j]=sc.nextInt();
          }
        }
    }

    static void print (int arr[][]){
        for(int i = 0 ; i<arr.length ; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
        //method 1 to transpose a matrix 
    static int [][] Transpose (int arr[][] , int r , int c ){ 
        int reverse[][]= new int [c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                reverse[i][j]=arr[j][i];
            }
        }
        return reverse;
    }

    //metod-2 ro find transpose of a matrix
    //note:- this method is used only to find transpose of a square matrix 

    static void TransposeInPlace (int arr [][] , int r , int c ){
        for(int i = 0 ; i< r ; i++){
            for (int j = i; j<c ; j++){
                //swap the given values 
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("enter number of rows and columns :- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int r = sc.nextInt();
        System.out.print("column = ");
        int c = sc.nextInt();

        System.out.println("enter the elements of the matrix :- ");
        int arr [][]= new int [r][c];
        input(arr);
        
        System.out.println("original matrix :- ");
        print(arr);

        int transpose  [][]= Transpose(arr, r, c);
        System.out.println("transpose of given matrix using m-1 :- ");
        print(transpose);

        System.out.println("transpose of given matrix using m-2");
        TransposeInPlace(arr, r, c);
        print(arr);

    }
}
