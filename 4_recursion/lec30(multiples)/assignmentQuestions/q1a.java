

import java.util.Scanner;
public class q1a {
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the number n: ");
                int n = scn.nextInt();
                rec(n, n, true);
        }
        public static void rec(int n, int m, boolean flag) {
                System.out.print(m + " ");
                // If we are moving back towards n and we have reached there, then we are done
                if (flag == false && n == m)
                        return;
 
                // If we are moving towards 0 or negative.
                if (flag) {
                        // If m is greater, then 5, recur with true flag
                        if (m - 5 > 0)
                                rec(n, m - 5, true);
 
                        else // recur with false flag
                                rec(n, m - 5, false);
                }
 
                else // If flag is false.
                        rec(n, m + 5, false);
        }
}

