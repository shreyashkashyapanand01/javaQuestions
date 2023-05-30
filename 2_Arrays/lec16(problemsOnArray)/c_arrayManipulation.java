

public class c_arrayManipulation {
    public static void main(String[] args) {
        //find a unique number in the given array where all the elements are being repeated
        //twice with one value being unique

        int array [] = {1,2,3,4,3,2,1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    array[i]=-1;
                    array [j]= -1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                System.out.println("unique number in the given array is "+array[i]);
            }
        }
    }
}
