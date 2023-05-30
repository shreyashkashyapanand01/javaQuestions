import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print first n number, n is input given by the user

        System.out.println("enter value of n :- ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum = sum + i;
           
        }
        System.out.println(sum);
    }
}
