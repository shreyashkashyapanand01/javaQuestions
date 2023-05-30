import java.util.Scanner;


public class b_sortEvenOdd {
    
    public static void TakeInput(int array[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<array.length; i++){
         array[i]=sc.nextInt();
        }
     }
 
     public static void Print(int array [])
     {
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i]+" ");
         }
     }
     
     public static void swap(int []array , int i , int j ){
         int n = array.length;
              int temp = array[i];
              array[j]=array[i];
              array[i]=temp;
     }

     public static void sortByParity (int arr[]){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]%2==0 && arr[right]%2==1 ){
                swap(arr, left,right);
                left ++;
                right --;
            }
            
        }      
        if(arr[left]%2==0) {
            left ++;
        }

        if(arr[right]%2==1){
            right --;
        }
      
    }



     public static void main(String[] args) {
            
        System.out.println("enter the size of the array :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("enter the elements of the array :- ");
        TakeInput(arr);

        System.out.println("\noriginal array is :- ");
        Print(arr);


        System.out.println("\n array after sorting odd and even number is :- ");
        sortByParity(arr);

        Print(arr);
     }
}
