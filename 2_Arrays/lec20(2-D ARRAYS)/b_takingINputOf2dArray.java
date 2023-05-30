import java.util.Scanner;

public class b_takingINputOf2dArray {
    
    static void TakeInput(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    static void PrintArray (int arr [] []){
        for (int i = 0; i < arr.length; i++) {//row
            for (int j = 0; j < arr[i].length; j++) {//column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(); //before to going to loop 2
        }
    }


    public static void main(String[] args) {
        
        // //TAKING INPUT OF THE ELEMENTS OF THE 2D ARRAY
        System.out.println("enter number of rows of the 2d array:- ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("enter number of columns :- ");
        int c = sc.nextInt();

        int arr3 [][]= new int [r][c];
        System.out.println("enter "+r*c+" elements :- ");
        TakeInput(arr3);
        System.out.println("elemets of array3 are :- ");
        PrintArray(arr3);
    }
}
