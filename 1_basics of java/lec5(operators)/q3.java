import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // write a program to calculate the sum of a three digit number 

       System.out.println("enter your number :- ");
       int num = sc.nextInt();

        int firstNum = num/100;
        System.out.println(firstNum);

        int secondNum = (num%100)/10;
        System.out.println(secondNum);
        
        int thirdNum =  num%10;
        System.out.println(thirdNum);

        int sum = firstNum+secondNum+thirdNum;

        System.out.println("sum pf digits of the number is "+sum );

    
    // System.out.println(135/100);
    // System.out.println((135%100)/10);
    // int num = ((135%100)/10);
    // System.out.println(135%10);


    }
}
