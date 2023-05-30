import java.util.Scanner;

public class q1a_gcdLongDivisionM {
    
    //iterative method to find gcd
    static int gcd(int x , int y){
        
        while(x%y==0){
            int rem = x%y;

            x=y;
            y=rem;

        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers :- ");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("gcd using iterative method :- "+gcd(num1, num2));
    }
}
