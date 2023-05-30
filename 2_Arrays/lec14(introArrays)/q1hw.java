public class q1hw {
    public static void main(String[] args) {
        //given an array {2,5,-5,-1,0,4,-9} 
        //print only positive values given in the array

        int array[]= {2,6,-5,-1,0,4,-9} ;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>=0) {
                System.out.println(array[i]);
            }
        }
    }
}
