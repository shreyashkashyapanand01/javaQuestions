/*
 * given a number m, find the sum of the natural numbers till n 
 * but with alternate signs
 * that means of n = 5 then you have to return 1-2+3-4+5=3 as your answer
 * 
 * costraints : 0<=n<=1e6
 * 
 * input  1 : n=10
 * output 1 : -5
 * 
 * input  2 : n=5
 * output 2 : 3 
 */

import java.util.Scanner;

public class q2_sumAlterSign {
    static int seriesSum(int n ){
        //base case 
        if(n==0){
            return 0;
        }
        //recursive case and self work
        return seriesSum(n-1)+n;
    }

    //main question
    static int seriesSum1( int n){
        if(n==0) return 0;

        if (n%2==0) {
            return seriesSum1(n-1)-n;
        }
        else return seriesSum1(n-1)+n;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :- ");
        int n = sc.nextInt();
        System.out.println("ssreis sum = "+seriesSum(n));

        System.out.println("alternate + - sum = "+seriesSum1(n));
        

    }
}
