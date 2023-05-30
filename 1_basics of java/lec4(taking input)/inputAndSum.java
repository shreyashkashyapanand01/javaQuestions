import java.util.Scanner;

public class inputAndSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //ye input lene ke liye command de rhe hai
        
        System.out.println("enter yor first number :- ");
        int num1 = sc.nextInt();

        System.out.println("enter your second number :- ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("sum of first and second number is "+ sum);

    }
}
