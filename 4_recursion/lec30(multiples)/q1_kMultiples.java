import java.util.Scanner;

public class q1_kMultiples {

    static void printMultiples(int n , int k){
        //base case
        if(k==0){ //if (k==1)
            //System.out.println(n);
            return;
        }

        //recursive case

        printMultiples(n, k-1);

        //self work

        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :- ");
        int n = sc.nextInt();
        System.out.println("enter number of multiples:-");
        int k = sc.nextInt();

        System.out.println("answer = ");
        printMultiples(n, k);
    }
}