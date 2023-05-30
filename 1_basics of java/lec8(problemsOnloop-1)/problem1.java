import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //count the number of digits in a given number n
        //example 1234578 = 7
        int n = sc.nextInt();

        int originalNumber=n;
        
        int numberOfDigits = 0;

        while (n>0) {
            n = n /10;

            numberOfDigits++;
            
        }
        System.out.println("number of digits in "+originalNumber+"is "+numberOfDigits);
    }
}
