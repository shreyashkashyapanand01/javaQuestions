/*
 * rotate the given array a of size n by k steps
 * where k is non negative and k can be greater then n as well
 */

public class c_RotateValues {
    public static void main(String[] args) {
        
        int array [] = {1,2,3,4,5};
        int n = array.length;
        int k = 3;

        System.out.print("original array = ");
        for (int i : array) {
            System.out.print(array[i-1]+ " ");
        }
System.out.println();
        //expected output 5,6,7,1,2,3


        int ans [] = new int [n];
        int j = 0;

        for(int i = n-k ; i<n ; i++){
            ans [j++]= array [i];
        }
        for(int i = 0 ; i<n-k ; i++){
            ans[j++]= array[i];

        }

System.out.print("array after rotating = ");
        for (int i : ans) {
             System.out.print(array[i-1]+" ");
        }

    }
}
