public class q4 {
    /*Given a 2D array for n rows and m columns, reverse each row.
Input:
n = 3
m = 3
arr[][] = {{1, 2, 3}, {6, 7, 8}, {9, 10, 11}} 
Expected Output:
{{3, 2, 1}, {8, 7, 6}, {11, 10, 9}}*/

static void print (int arr [][], int n , int m ){
    for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<m ; j++){
            System.out.print(arr [i][j]+ " ");
        }
        System.out.println();
    }
}

static void reverse (int arr [][], int n , int m){
        for (int i = 0; i < n; i++) {            
         int a = 0;
         int b = m-1;
         while(a<b){
            int temp = arr[i][a];
            arr[i][a]= arr[i][b];
            arr[i][b]= temp;
            a++;
            b--;
         }
           
        }
        System.out.println("reverse array :- ");
        print(arr, n, m);

}

public static void main(String[] args) {
    int n= 3 , m=3;
    int arr[][] = {{1, 2, 3}, {6, 7, 8}, {9, 10, 11}} ;
   

    System.out.println("original array :- ");
    print(arr, n, m);

    System.out.println("array after reversing :- ");
    reverse(arr, n, m);
    
 }
}
