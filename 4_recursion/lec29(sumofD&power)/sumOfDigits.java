
import java.util.Scanner;

public class sumOfDigits {
    static 
    int SOD(int n){
        if (n>=0 && n<=9) {
            return n;
        }
        //recursive work 
        // int smallAns = SOD(n/10);
        // //self work
        // return smallAns+n%10;

        return SOD(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :- ");
        int n = sc.nextInt();
    
        int ans = SOD(n);
        System.out.println("sum of digits of "+n+" is = "+ans);
    }
}
