import java.util.Arrays;

public class c_RotateValues1 {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        // If k is greater than n, take the modulo to get the effective rotation amount
        k = k % n;
        // Rotate the array using an auxiliary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n-k+i];
        }
        for (int i = n-k-1; i >= 0; i--) {
            arr[i+k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));  // Output: [4, 5, 1, 2, 3]

    }
}
