public class q4r {
    public static void main(String[] args) {
        //search an element x in an array 
        //if x is present then return the index of x
        //else return -1

        int array [] = {1,2,3,4,5,6,7,8,9};
        int x = 100;

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("x not found "+ index);
            
        }
        else{
            System.out.println(x+" found at index "+index);
        }
    }
}
