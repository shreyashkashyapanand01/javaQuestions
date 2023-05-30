import java.util.Scanner;
import java.util.Arrays;
/*Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals, 
 and return the count of the non-overlapping intervals that cover all the intervals in the input. (Medium)
Input1:

n = 4

m = 2

arr[]=[[1,4],[2,3],[5,8],[6,9]]


Expected Output:

2 */

public class q5_countNonOverlappingIntervals {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the dimensions of the array: ");

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        
        System.out.println("Enter " + n * m + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        Arrays.sort(mat, (a, b) -> a[0] - b[0]);
        int count = 0;
        int i = 0;
        while (i < n) {
            while (i < n - 1 && mat[i + 1][0] <= mat[i][1]) {
                mat[i + 1][0] = mat[i][0];
                mat[i + 1][1] = Math.max(mat[i][1], mat[i + 1][1]);
                i++;
            }
            i++;
            count++;
        }
        System.out.println("count is = " + count);
    }
}
