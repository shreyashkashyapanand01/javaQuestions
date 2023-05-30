public class q2r {
    public static void main(String[] args) {
        //print out the sum of all elements of an array

        int array [] = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        System.out.println("SUM = "+sum);
    }
}
