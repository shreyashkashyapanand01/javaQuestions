import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        //write a program to print absolute value of an integer
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num<0) {
            num = num*-1;
            System.out.println("absolute value of given number is "+num);
        }
        else{
            System.out.println("absoute value of given number is "+ num);
        }
    }
}
