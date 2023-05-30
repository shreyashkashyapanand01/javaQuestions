import java.util.Scanner;

public class a_initialisationOf2dArray {

    static void PrintArray (int arr [] []){
        for (int i = 0; i < arr.length; i++) {//row
            for (int j = 0; j < arr[i].length; j++) {//column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(); //before to going to loop 2
        }
    }


    public static void main(String[] args) {
        //method 1
        int arr [][] = new int [2][2];
        arr [0][0]=1;
        arr [0][1]=1;
        arr [1][0]=11;
        arr [1][1]=10;

        //method 2
        int arr2 [][]= {{1,5,6},
                        {7,9,11},
                        {8,1,1},
                        };
        System.out.println("elements of array1 are :- ");
        PrintArray(arr);
        System.out.println("elements of array2 are :- ");
        PrintArray(arr2);


    }
}