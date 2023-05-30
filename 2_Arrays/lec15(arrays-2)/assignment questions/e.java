//import javax.swing.SpringLayout;

public class e {
    public static void main(String[] args) {
        //write a java program to test the equality of two arrays 

        int array1 []= {1,2,3,4,45,6,7,8,9,10};
        int array2 []={1,2,3,4,45,6,7,8,67,10};

        boolean equal=true;

        for (int i = 0; i < array2.length; i++) {
            if(array1[i]!=array2[i]){
                equal=false;
                break;
            }
        }

        System.out.println("is equal "+ equal);

    }
}
