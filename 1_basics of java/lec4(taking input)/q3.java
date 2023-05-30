import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        System.out.println("total marks is "+(marks1+marks2+marks3));
        System.out.println("percentage is "+(marks1+marks2+marks3)/3+"%");

    }
}
