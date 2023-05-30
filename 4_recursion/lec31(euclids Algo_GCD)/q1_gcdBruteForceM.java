/*
 * given two numers x and y. Find the divisor
 * INPUT :- X=4, Y=9
 * OUTPUT :- 1
 */

import java.util.Scanner;

public class q1_gcdBruteForceM {
    public static int findGCD(int number1, int number2) {
        int gcd = 1;
        int smallerNumber = Math.min(number1, number2);

        for (int i = 1; i <= smallerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2= sc.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
