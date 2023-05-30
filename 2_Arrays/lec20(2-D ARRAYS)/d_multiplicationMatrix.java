import java.util.Scanner;
public class d_multiplicationMatrix {
    
    static void TakeInput(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    static void PrintArray (int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

static void MultipliationArray(int arr1 [][], int r1 , int c1 , int arr2 [][] , int r2 , int c2){
            if(c1 != r2){
                System.out.println("muiltiplication not possible - wrong dimension ");
                return;
            }

            int mulMatrix [][]= new int [r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for(int k = 0 ; k<c1 ; k++){
                        mulMatrix[i][j]+=(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
            System.out.println("multiplication of given 2 matrices are :- ");
            PrintArray(mulMatrix);
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("enter number of rows of matrix 1 :- "); 
       int r1 = sc.nextInt();

       System.out.println("enter number of columns of matrix 1 :- ");
       int c1 = sc.nextInt();
       
       int arr1 [][]= new int [r1][c1];

       System.out.println("enter the elements of matrix 1 :- ");
       TakeInput(arr1);

       System.out.println("enter number of rows of matrix 2 :- "); 
       int r2 = sc.nextInt();

       System.out.println("enter number of columns of matrix 2 :- ");
       int c2 = sc.nextInt();

       int arr2 [][]= new int [r2][c2];

       
       System.out.println("enter the elements of matrix 2 :- ");
       TakeInput(arr2);

        System.out.println("matrix 1 is :- ");
        PrintArray(arr1);

        System.out.println("matrix 2 is :- ");
        PrintArray(arr2);
        
       MultipliationArray(arr1, r1, c1, arr2, r2, c2);
        
    }

 }
