import java.util.Scanner;


public class ifElseConditiional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //program for taking input

        System.out.print("enter your number");
         int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("this is even");
        }
        else{
            System.out.println("this is odd");
        }

        System.out.println("enter your age ");
        int age = sc.nextInt();


        if (age<=12) {
            System.out.println("you are a child");
        }
        else if (age>=12 && age <=18) {
            System.out.println("you are a teenager");
        }
        else{
            System.out.println("you are a adult");
        }
        


    }
}
