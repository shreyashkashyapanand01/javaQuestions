import java.util.Arrays;

/**
 * d_secondLargest
 */
public class d_secondLargest {

    public static void main(String[] args) {
        int array []={11,1,5,1000,9090,0,25};

        Arrays.sort(array);

        System.out.println("second largest element in the given array is "+array[array.length-2]);
    }
}