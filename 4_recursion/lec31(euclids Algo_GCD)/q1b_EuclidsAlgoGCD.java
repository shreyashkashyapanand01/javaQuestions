//package 4_recursion.lec31(euclids Algo_GCD);

import java.util.Scanner;

public class q1b_EuclidsAlgoGCD {
    
    /*
     * euclids algo says that the gcd of (x,y) is equal to the
     * gcd of the (y,y%x) 
     */

     static int gcd (int x , int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("gcd of the given numbers is :- "+ gcd(x, y));
    }
}
