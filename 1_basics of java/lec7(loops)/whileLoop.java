import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print first n numbers, where n is useer input 

        // int n1 = 5;

        // int num = 1 ;
        
        // while (num<=n1) {
        //     System.out.println(num);
        //     num ++;
            
        // }
       

        //print the sum of first n natural numbers, n is user input

        System.out.println("enter the number upto which you want to add");
        int n = sc.nextInt();

        int sum = 0;
             int i = 1;
        while (i<=n) {
            sum = sum +i;
            i ++;
        }
        System.out.println("sum is "+sum);
        System.out.println(1+2+3+4+5);



    }
}
