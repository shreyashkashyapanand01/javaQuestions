import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to print Fibonacci series of n terms where n is input by user.
        //input: 6...expected output: 112358

        int n = sc.nextInt();
        int a = 1 ;
        int b =1;
        for(int i =1 ; i<= n ; i++){
            System.out.print(a+" ");
            int sum = a +b;
            a=b;
            b = sum;
        }

       
    }
}
