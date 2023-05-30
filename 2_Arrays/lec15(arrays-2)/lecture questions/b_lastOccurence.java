//package lecture questions;

public class b_lastOccurence {
    public static void main(String[] args) {

        //find the index of the last occurence of an element x in the given array 
        int array[] = {1,2,3,4,1};
        int lastIndex = -1;
        int firstIndex = -1;
        int x = 1; //element whose occurence we have to find

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                firstIndex=i;
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                lastIndex=i;
            }
        }

        System.out.println("first occurence of "+x+" in the given array is :- "+firstIndex);
        System.out.println("last occurence of "+x+" in the given array is :- "+lastIndex);

    }
}
