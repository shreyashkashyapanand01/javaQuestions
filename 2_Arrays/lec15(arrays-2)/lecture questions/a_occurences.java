import java.util.Scanner;

//package lecture questions;

 class simple{
    static void input (int array[]){
        Scanner sc = new Scanner(System.in);
        // int array[]=new int [x];
        System.out.print("Enter the elements of the array :- ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        
    }

    static void output(int array[]){
        System.out.print("array is :- ");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

public class a_occurences {
    public static void main(String[] args) {
        //count the occurences of an element x in an array

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array :- ");
        int n = sc.nextInt();
        int array []= new int [n];

        System.out.print("enter the element whose number of occurences you want to find :-");
        int x = sc.nextInt();

        simple.input(array);
        simple.output(array);

        int occurence = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                occurence+=1;
            }
        }

        System.out.println("number of occurences of element "+x+" in the given array is "+occurence);

        

    }
}
