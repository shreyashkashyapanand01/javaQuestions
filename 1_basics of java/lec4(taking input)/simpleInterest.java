//import java.net.Socket;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your principle amount:- ");
        float principleAmount  = sc.nextInt();

        System.out.print("enter your rate :- ");
        float rate = sc.nextInt();

        System.out.print("enter your amount:- ");
        float amount = sc.nextInt();

        float simpleInterest = (principleAmount*amount*rate)/100;

        System.out.println("your simple interst is :- "+simpleInterest);

    }
}
