/*
 * find the square root of the given non negative value of x.
 * round it off to the nearest floor integer value
 * input:- x=4;
 * output:2
 * 
 * input: x=11;
 * output:3;
 */

import java.util.Scanner;

public class q2_squareRoot {
    
    static int findRoot(int x){
        int st=0, end=x , ans=-1;

        while(end>=st){
            int mid = st+(end-st)/2;
            int val = mid*mid;

            if(val==x) return mid;
            else if(val<x){
                ans= mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x :- ");
        int x = sc.nextInt();

        System.out.printf("sqare root of the given number to the nearest floor value is %d",findRoot(x));
    }
}
