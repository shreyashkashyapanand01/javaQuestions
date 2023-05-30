public class q3hw {
    public static void main(String[] args) {
        //transverse through all elements of the array {1,2,3,4,5,6,7,8};
        //using for each loop and print all even elements

        int array[]= {1,2,3,4,5,6,7,8};

        
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.println(array[i]);
            }
        }
    }
}
