import java.util.Scanner;

public class b_rotate {
    /*given a square matrix turn it by 90 degrees clockwise direction without using an
     * extra space
     */

    static void input (int arr[][]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    static void print (int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

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

    static void reverse (int arr[]){
       int i = 0;
       int j = arr.length-1;
       
       while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
    }

    static void rotate(int [][] arr, int r  ){
        TransposeInPlace(arr, r, r);
        for (int i = 0; i < r; i++) {
            reverse(arr[i]);           
        }  
        print(arr);
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows :- ");
        int r = sc.nextInt();
        System.out.println("enter number of columns :- ");
        int c = sc.nextInt();
        int arr[][]= new int [r][c];

        System.out.println("enter the elements of the matrix:- ");
        input(arr);

        System.out.println("original matrix is :- ");
        print(arr);

        System.out.println("matrix after rotating 90 degree clockwise becomes:- ");
        rotate(arr, r);
        // print(arr);
     }
}
