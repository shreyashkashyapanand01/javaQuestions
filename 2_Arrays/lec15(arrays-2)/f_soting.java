import java.util.Arrays;

public class f_soting {
    public static void main(String[] args) {
        int array[]= {1,2,3,5,9,6,8};
        int sortedArray[]= Arrays.copyOf(array,array.length);
        Arrays.sort(sortedArray);

        System.out.print("given array is :-  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
System.out.println();
        
        System.out.print("sorted array is :- ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }
}
