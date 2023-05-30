import java.util.Scanner;

public class q3 {
    /*
     *  Given a 2D array of n rows and m columns, return the sum of elements 
     *  along the range of row and column specified.
     Input:
n = 3
m = 3
arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
range = [0, 1], [1, 2]
Expected Output:
16
*/  

    public static void takeInput(int arr [] [], int n , int m ){
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
    }

    static void printArray (int arr [][], int n , int m){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            System.out.println("enter number of rows :- ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("enter number of columns :- ");
            int m = sc.nextInt();

            int arr [][] = new int [n][m];
            System.out.println("enter the elements of the array :- ");
            takeInput(arr,n,m);
            System.out.println("original array is :- ");
            printArray(arr, n, m);

            System.out.println("enter range upto which you want to get sum of the given arry :-  ");
            System.out.print("enter beginning number index:-  ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            System.out.print("enter end number index :- ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int sum = 0;

            for(int i = r1 ; i<=c1 ; i++){
                for(int j = r2 ; j<=c2 ; j++){
                    sum+=arr[i][j];
                }
            }
            
            System.out.println("sum = "+sum);




        }
}

