import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your decimal number ");
        int decimalNum= sc.nextInt();

        int ans= 0; 

        int pow = 1;

        while (decimalNum>0) {
            int parity = decimalNum%2;
            ans += parity*pow;
            pow *= 10;
            decimalNum/=2;
        }

            System.out.println("your binary nnumber is "+ans);
    }
}
