//package 4_recursion.lec28(factorial&fabonacciNum);

import java.util.Scanner;

public class q1_factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :- ");
        // int n = sc.nextInt();
        int n = 5;
        System.out.print(factorial(n));

    }
}
