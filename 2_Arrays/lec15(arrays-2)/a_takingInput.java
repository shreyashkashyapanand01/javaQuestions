import java.util.Scanner;

/**
 * a_takingInput
 */
public class a_takingInput {

    public static void main(String[] args) {
        System.out.println("taking input in an array :- ");

        System.out.println("enter the size of the array :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[]= new int [n];

        System.out.println("enter the elements of the array :- ");

        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }

        System.out.println("array is :-");{
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
        }

    }
}