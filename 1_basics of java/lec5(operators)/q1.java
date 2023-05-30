import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        //swap the two numbers without the use of third numbers
        System.out.println("enter the value of first number "); 
        int firstNum = sc.nextInt();

        System.out.println("enter the value of second number ");
        int secondNum = sc.nextInt();

        firstNum= firstNum+secondNum;
        secondNum = firstNum-secondNum;
        firstNum = firstNum-secondNum;

        System.out.println("output");
        System.out.println(firstNum);
        System.out.println(secondNum);

    }
}
