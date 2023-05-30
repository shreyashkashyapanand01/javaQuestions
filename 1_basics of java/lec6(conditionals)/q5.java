import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create a calculator using switch statement to perform addition substraction multiplication and division

        System.out.println("enter your first number:- ");
        int num1 = sc.nextInt();

       System.out.println("enter your second number :- ");
        int num2 = sc.nextInt();

        System.out.println("enter operation you want to perform :- ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1+num2);
                break;
                case '-':
                System.out.println(num1-num2);
                break;
                case '*':
                System.out.println(num1*num2);
                break;
                case '/':
                System.out.println(num1/num2);
                break;
        
            default:
            System.out.println("error! cannot perform this operation");
                break;
        }

    }
}
