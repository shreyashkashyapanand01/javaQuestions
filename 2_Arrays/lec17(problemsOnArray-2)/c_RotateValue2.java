public class c_RotateValue2 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverse (int arr[] , int i , int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j++;
        }
     }

    public static void rotateInPlace (int arr[], int k){
        int n = arr.length;
        int  K = k%n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

     }

    public static void print (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
     }


    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println("array before rotating upto "+ k +" places = ");
        print(arr);

       rotateInPlace(arr, k);

       System.out.println("array after rotating upto "+ k +" places = ");
       print(arr); // expected output 987123456
    }
}
