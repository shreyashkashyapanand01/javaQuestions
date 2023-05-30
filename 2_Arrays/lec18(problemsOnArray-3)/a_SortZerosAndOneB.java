import java.util.Scanner;

public class a_SortZerosAndOneB {

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

   public static void sort(int arr[]){
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                zeros ++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (i<zeros) {
                arr[i]=0;
            }
            else{
                
                arr[i]=1;
            }
        }

       
   }


    public static void main(String[] args) {
        
        int []array={1,1,1,1,0,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};

        System.out.print("original array :- ");
        Print(array);

        sort(array);
        System.out.print("\narray after sorting zeros and one :- ");
        Print(array);
    }
}
