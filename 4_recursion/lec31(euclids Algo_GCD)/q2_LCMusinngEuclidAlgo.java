import java.util.Scanner;

public class q2_LCMusinngEuclidAlgo {
    /*
     * we know that the gcd*lcm = num1*num2;
     * 
     * here we use this formula to find tout the gcd of the given num
     * 
     * here LCM = (x*y)/gcd
     */

     static int gcd(int num1 , int num2 ){
        if (num2 ==0){
            return num1;
        }

      return gcd(num2, num1%num2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter two numbers :- ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int ans = gcd(x, y)/x*y;

            System.out.println("lcm of the given numbers is :- "+ans);
        }
     }

