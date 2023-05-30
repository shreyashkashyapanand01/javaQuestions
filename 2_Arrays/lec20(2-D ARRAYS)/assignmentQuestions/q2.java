

public class q2 {
    /*
     * Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix should also be
sorted row and column wise.
Input:
n = 2
m = 2
arr = [1,2,3,4]
Expected Output: 
[[1,2],[3,4]]
     */

     static void print (int arr [][]){
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
               }
               System.out.println();
          }
        
     }
public static void main(String[] args) {
     
     int n = 2;
     int m = 2;
     int index = 0;

     int arr[]= {1,2,3,4};
     System.out.println("1-d ARRAY IS :- ");
     for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
     }
     int arr2 [][]= new int [n][m];
          for(int i = 0 ; i<n ; i++){
               for(int j = 0 ; j<m ; j++){
                    arr2[i][j]=arr[index];
                    index ++;
          }
          }
          
          System.out.println("\n2-D ARRAY IS :- ");
          print(arr2);
}   
}
