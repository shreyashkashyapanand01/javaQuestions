//package 4_recursion.lec32(arraySumAndMaxNum);

import java.util.Scanner;

public class q1_maxEle {

    //PRINTING THE ELEMENTS OF THE ARRAY
    static void print(int array[] , int idx){
        
        //base case
        if(idx==array.length) return;

        //self work

        System.out.print(array[idx]+" ");

        //recursive work - sub problem
        print(array, idx+1);

    }



    static int findMax(int arry[] , int idx){

        //base case 
        if(idx == arry.length-1){
            return arry[idx];
        }

        //small problem
        
        int smallAns = findMax(arry,idx+1);

        return Math.max(arry[idx], smallAns);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int array[]=new int[n];

        System.out.println("enter the elements of the array :- ");

        for(int i=0 ; i<n ; i++){
            array[i]=sc.nextInt();
        }

        System.out.println("elements present in the array is :-" );
        print(array, 0);


        System.out.println("\nlargest element present in the array is :- "+(findMax(array,0)));
        
    }
}
