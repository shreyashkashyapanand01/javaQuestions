import java.util.Scanner;

public class q5 {

    /* Check if an element x exists in the given sorted matrix or not. Each row and column is sorted in itself. If it 
does not exist, return -1, else return its row and column index.
Input:
n = 3
m = 3
arr[][] = {{1,4,7}, {2,5,8}, {3,6,9}}
x = 6
Expected Output:
Row = 2
Column = 1 */

static void takeInput (int arr [][] , int n , int m ){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j]=sc.nextInt();
        }
    }
}

static void print (int arr [][] , int n , int m ){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

static void checkNumber (int arr [][] , int x ){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]==x){
                System.out.print("desired num found at :- ");
                System.out.print("\nrow = "+i);
                System.out.print("\ncolummn = "+j);
                return;
            }
        }
    }
    System.out.println("ERROR desired nnumber not found -1");
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows of the matrix:- ");
    int n = sc.nextInt();
    System.out.println("enter number of columns :- ");
    int m = sc.nextInt();

    int arr [][]= new int [n][m];

    System.out.println("enter the elements of the array :- ");
    takeInput(arr, n, m);

    System.out.println("orginal array is :- ");
    print(arr, n, m);

    System.out.println("enter number which you want to search :- ");
    int x = sc.nextInt();

    System.out.println();
    checkNumber(arr, x);

 }
}