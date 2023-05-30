
public class q1 {
    public static void main(String[] args) {
        /*
         * . Check if an element x exists in the given matrix or not.
         *  If it does not exist, return -1, 
         * else return its row and column index.
Input:
x = 12
arr[][] = {{3, 8, 0}, {6, 3, 2}, {12, 9, 10}}
Expected Output:
Row = 2
Column = 0
         */

         int arr [][]= {{3, 8, 0}, {6, 3, 2}, {12, 9, 10}};
         int x = 12;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==x) {
                    System.out.println("row = "+ i);
                    System.out.println("col = "+j);
                    return;
                }
                
            }
           
        } 
        System.out.println("-1");   
    }
}
