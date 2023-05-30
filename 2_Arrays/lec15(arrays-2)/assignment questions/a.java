/**
 - Given an unsorted array arr[] of size N having both negative and positive integers, place 
 all negative elements at the end of array without changing the order of positive elements 
 and negative elements
input:
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1 3 2 11 6 -1 -7 -5
 */
public class a {

   public static void main(String[] args) {
//       int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };

//       System.out.print("original array :- ");
//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i]+" ");
//       }
// System.out.println();
//       int ans[]=new int [arr.length];

//       int index = 0;

//       for (int i = 0; i < ans.length; i++) {
//          if (arr[i]>=0) {
//             ans[index]=arr[i];
//             index++;
//          }
//       }

//       for (int i = 0; i < ans.length; i++) {
//          if(arr[i]<0){
//             ans[index]=arr[i];
//             index++;
//          }
//       }

//       for (int i = 0; i < ans.length; i++) {
//          System.out.print(ans[i]+" ");
//       }

               int array []={1, -1, 3, 2, -7, -5, 11, 6 };
               int n = array.length;
               int ans []=new int [n];
               int index =0;

               System.out.print("original array is :- ");
               for (int i = 0; i < ans.length; i++) {
                  System.out.print(array[i]+" ");

               }
System.out.println();


               for (int i = 0; i < ans.length; i++) {
                  if (array[i]>=0) {
                     ans[index]=array[i];
                     index ++;
                  }
               }

               for (int i = 0; i < ans.length; i++) {
                  if (array[i]<0) {
                     ans[index]=array[i];
                     index ++;
                  }
               }


               System.out.print("required array is :- ");
               for (int i = 0; i < ans.length; i++) {
                  System.out.print(ans[i]+ " ");
               }

   }
}