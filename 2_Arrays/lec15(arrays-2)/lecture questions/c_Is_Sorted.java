import java.util.Arrays;

//package lecture questions;

public class c_Is_Sorted {
    public static void main(String[] args) {
        boolean sorted = true;

        int array[]= {1,2,3,4,5};
        for (int i = 1; i < array.length; i++) {
            if (array[i-1]>array[i]) {
                sorted=false;
                break;
            }
        }

        System.out.println("the given array is sorted "+sorted);
    }
}
