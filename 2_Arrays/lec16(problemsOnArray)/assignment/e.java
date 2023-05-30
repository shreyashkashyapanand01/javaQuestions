import java.util.Arrays;

public class e {
    public static void main(String[] args) {
        /*
         *  Given an array sorted in increasing order, return an array of squares
         *  of each number sorted in increasing order
Input: 
N = 6
Arr[] = [-5, -2, -1, 0, 4, 6]
Expected Output: 
[0, 1, 4, 16, 25, 36]
         */

         int array []= {-5, -2, -1, 0, 4, 6};

         System.out.print("given array :- ");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
         }
          System.out.println();

         for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*array[i];
         }

         System.out.print("new array :- ");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
         }

         System.out.println();

         System.out.print("sorted new array :- ");
         Arrays.sort(array);
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
         }
    } 
}
