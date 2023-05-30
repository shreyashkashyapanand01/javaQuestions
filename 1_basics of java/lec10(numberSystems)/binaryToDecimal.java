import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        System.out.println("enter your binary number ");
        Scanner sc = new Scanner(System.in);

        int binaryNum=sc.nextInt();

        int ans=0;
        int pow = 1 ;

        while (binaryNum>0 ) {
            int unitDigit = binaryNum%10;
            ans+=unitDigit*pow;

            binaryNum/=10;
            pow*=2;
        }
        System.out.println("your number is "+ ans);
    }
}