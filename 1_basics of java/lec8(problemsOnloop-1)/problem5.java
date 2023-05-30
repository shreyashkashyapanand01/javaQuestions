import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print the first n factorial numbers
        int n = sc.nextInt();

        int fact = 1 ;

        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
            System.out.println("factorial of "+i+" is "+fact);

        }

    }
}
