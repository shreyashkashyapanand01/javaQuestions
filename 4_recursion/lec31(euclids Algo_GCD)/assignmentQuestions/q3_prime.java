//check wheter a number is prime or not using recursion

import java.util.Scanner;

public class q3_prime {
    
    static boolean isPrime (int x , int i){
        //base case 
        if(x==1 && x>0  || x==2) return true ;

        //self work
        if (x%i==0) {
            return false ;
        }

        if (i*i >x) {
            return true;
        }
        //recursive work
        return isPrime(x,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :- ");
        int n = sc.nextInt();

        System.out.println(isPrime(n, 2));
    }
}
