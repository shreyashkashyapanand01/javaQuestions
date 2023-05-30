

public class b_targetSum {
    public static void main(String[] args) {
        //count the number of triplets whose sum is equal to the given value of x

        int array[]= {1,4,5,6,3};
        int x = 12;
        int pair = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int j2 = j+1; j2 < array.length; j2++) {
                    if (array[i]+array[j]+array[j2]== x) {
                        pair ++;
                    }
                }
            }
        }
        System.out.println("total number of triplets having sum = "+x+" are "+ pair);
            
    }
}
