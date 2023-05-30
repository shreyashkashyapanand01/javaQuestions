import java.util.Scanner;

public class q4_decimalToBinary {
    public static int find(int decimal_number) {
        if (decimal_number == 0)
                return 0;
        else
                return (decimal_number % 2 + 10 *
                        find(decimal_number / 2));
}
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number n: ");
    int n = scn.nextInt();
    System.out.println(find(n));
}
}
