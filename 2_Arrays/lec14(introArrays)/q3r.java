public class q3r {
    public static void main(String[] args) {
        //calculate the max value out of all elements in an array

        int array [] = {1,2,4,3,9,6,5};
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }

        System.out.println("maximum value among the elements of the given array is "+ max);
    }
}
