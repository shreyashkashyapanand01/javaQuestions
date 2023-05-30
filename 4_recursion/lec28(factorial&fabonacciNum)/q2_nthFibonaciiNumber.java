//package 4_recursion.lec28(factorial&fabonacciNum);

import java.util.Scanner;

public class q2_nthFibonaciiNumber {
   static int fibonacciNum(int n){
        if(n==0 || n==1){
            return n;
        }
        
        //subproblme
        // int prev = fibonacciNum(n-1);
        // int prevPrev=fibonacciNum(n-2);

        // return prev+prevPrev;

        return fibonacciNum(n-1)+fibonacciNum(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :-");
        int n =sc.nextInt();
        System.out.println("fibonacii series upto "+n+" is :- ");
        for (int i = 0; i <=n; i++) {
            System.out.print(fibonacciNum(i)+" ");
        }
        int ans = fibonacciNum(n);
        System.out.println();
        System.out.println(n+"th fabonacii number is :- "+ans);

    }
}
