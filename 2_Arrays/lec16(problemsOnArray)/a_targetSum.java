

public class a_targetSum {
    public static void main(String[] args) {

        //find the total number of pairs in the given array whose sum is equal to the given value of x;

        int array[] = {4,6,3,5,8,2};
        int x = 7; int ans =0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==x) {
                    ans++;
                }
            }  
        }
        System.out.println("total number of pairs having sum = "+ x +" is "+ ans);
    }
}
