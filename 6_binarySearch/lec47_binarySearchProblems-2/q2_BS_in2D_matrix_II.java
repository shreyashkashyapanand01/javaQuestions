/*
 * same as previous question , but here matrix is sorted on  both row and column wise
 */

public class q2_BS_in2D_matrix_II {
    static boolean searchMatrix(int a[][], int target){
        int n = a.length, m =a[0].length;
        int i=0, j=m-1;

        while(i<n && j>=0){
            if(a[i][j]==target) return true;

            if(target<a[i][j]){
                j--; //move left
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        int target = 7;

        System.out.println("is target present in the given array :- ");
        System.out.println(searchMatrix(arr, target));
    }
}
