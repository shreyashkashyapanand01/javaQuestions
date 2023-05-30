

/**
 * a
 */
public class a {

    public static void main(String[] args) {
        /*
         Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
 greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
 integer)

 input:- 5
 int array []= {1,2,1,4,5,2,1,1,2,3};

 output:- false
         */

         int array []= {1,2,1,4,5,2,1,1,2,2};
         int m = 5;

         for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    array[i]=-1;
                    array[j]=-1;

                }
            }
         }
            boolean ans = false ;
         for (int i = 0; i < array.length; i++) {
            if (array[i]>0 && array[i]>m) {
                ans = true;
            }
         }

         System.out.println("is present "+ ans);
    }
}