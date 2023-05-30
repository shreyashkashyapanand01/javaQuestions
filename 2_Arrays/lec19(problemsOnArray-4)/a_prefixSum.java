

public class a_prefixSum {

    static void print (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static  int[] prefixSum(int arr []){
        
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println("original array :- ");
        print(arr);

        int sum []=prefixSum(arr);
        System.out.println("\narray after prefix sum :- ");
        print(sum);

    }
   
}
