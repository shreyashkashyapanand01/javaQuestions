import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        //input 2 different strings and print them in same line
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first word ");
        String s1 = sc.nextLine();
        System.out.println("enter second word ");
        String s2 = sc.nextLine();

        System.out.println(s1+s2);
    }
}
