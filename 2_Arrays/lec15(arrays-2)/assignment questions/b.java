import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        /*
         - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find 
 union between these two arrays and print the number of elements of the union set.
 Union of the two arrays can be defined as the set containing distinct elements from both 
 the arrays. If there are repetitions, then only one occurrence of element should be printed 
 in the union.

 Input:
5 3
1 2 3
1 2 3 4 5
Output:
5
         */

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the length of the arrays:- ");
      int n = sc.nextInt();
      int m = sc.nextInt();

      int a []= new int[n];
      int b []= new int [m];

      for(int i = 0 ; i<n ;i++){
        a[i]=sc.nextInt();
      }

      for(int i = 0; i<n ; i++){
        b[i]=sc.nextInt();

        boolean check = false ;

        for (int j = 0; j < n; j++) {
            if (b[i]==a[j]) {
                check = true ;
                break;
            }
        }
        if(!check){
            System.out.println(b[i]);
        }

      }

    }
}
