/*
 * given a number n, print the following pattern without using any loop
 * n, n-5, n-10  ,...0,5,10,...n-5, n
 * 
 * input : n = 16
 * expected output : 16,11,6,1,-4,1,6,11,16
 * 
 */

import java.util.Scanner;

public class q1 {
    static int pattern(int n ){
        //base code
        int i =1;
        if(n==1){
            return 1;
        }

       if(n>0){
        return pattern(n-1)*5*i++;
       }
       else{
        return pattern(n-1)*5;
       }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :- ");
        int n = sc.nextInt();
        
        System.out.println(pattern(n)+" ");
    }
}
