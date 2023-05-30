import java.util.Scanner;

public class q2_reverseOrderNaturalNum {

    static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            System.out.print(n + " ");
            printDecreasing(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :-");
        int n = sc.nextInt();

        printDecreasing(n); 
    }
}