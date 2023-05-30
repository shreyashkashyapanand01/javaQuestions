import java.util.Arrays;



public class c_sortSquaresInIncreasingOrder {
    public static void Print(int arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void  swap (int arr [] , int i , int j ){
        int temp = arr[i];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void reverse (int arr []){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }


   
    public static void main(String[] args) {
        int arr []= {-10,-3,-2 ,1,6,9};
        System.out.println("original array is :- ");
        Print(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }

        Arrays.sort(arr);

        System.out.println("\narray after squaring and sorting in increaing order:- ");
        Print(arr);

        
        
        System.out.println("\narray after squaring and sorting in decreaing order:- ");
        reverse(arr);
        Print(arr);


    }
}
