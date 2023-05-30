public class d {
    public static void main(String[] args) {
        /*
         *  Given a 1-indexed array of integers numbers that is already 
         * sorted in non-decreasing order, find two
numbers such that they add up to a specific target number. 
Return the indices of the two numbers added by one. Return -1 if pair does not exist.
numbers = [2,7,11,15]
target = 9
Expected Output: 
1 2
         */

         int array []={2,7,11,15};
         int target = 9;
         int num1=-1;
         int num2=-1;

         for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    num1=i+1;
                    num2=j+1;
                }             
            }
         }

         System.out.println(num1+" "+num2);


    }
}
