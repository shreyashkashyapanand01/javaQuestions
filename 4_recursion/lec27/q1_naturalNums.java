import java.util.Scanner;


public class q1_naturalNums {
    static void printIncreasing(int n ){
        //base case is if(n==1) wala code
    if (n==1){
        System.out.print(n+" ");
        return;
    }
    printIncreasing(n-1);
    System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:-");
        int n =sc.nextInt();
        printIncreasing(n);
    }
}