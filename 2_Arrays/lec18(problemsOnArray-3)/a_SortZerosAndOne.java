import java.util.Scanner;

public class a_SortZerosAndOne {

    public static void TakeInput(int array[]){

        Scanner sc = new Scanner(System.in);
       for(int i = 0 ; i<array.length ; i++){
        array[i]=sc.nextInt();
       }
    }

    public static void print(int array[]){
        int n = array.length;
       for(int i = 0 ; i<n ; i++){
        System.out.print(array[i]+" ");
       }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void reverseArray(int array []){
        int n = array.length;
        int zeros = 0;
        for(int i = 0 ; i<n; i++){
            if(array[i]==0){
               zeros ++;
            }
        }

        for(int i = 0 ; i<n ; i++){
            if (i<zeros) {
                array[i]=0;
            }
            else{
                array[i]=1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:- ");
        int n = sc.nextInt();

        System.out.print("enter the elements of the array:- ");
        int array [] = new int [n];
        TakeInput(array);

        System.out.println("original array is :- ");
        print(array);


        System.out.println("\nsorted array is :- ");
        print(array);

    }
}