import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //write a program to calculate the marks to grade...follow the conversion rule as given below
        // 100-90=A+
        // 90-80=A
        // 80-70=B+
        // 70-60=B
        // 60-50=C
        // 50-40=D
        // 40-30=E
        // 30-0 =F
        System.out.println("enter your marks :- ");
        int marks = sc.nextInt();
        
      if (marks>=90 && marks<=100) {
        System.out.println("your grade is A+");
      }
      else if (marks>=80 && marks<90) {
        System.out.println("your grade is A");
      }
      else if (marks>=70 && marks<80) {
        System.out.println("your grade is B+");
      }
      else if (marks>=60 && marks<70) {
        System.out.println("your grade is B");
      }
      else if (marks>=50 && marks<60) {
        System.out.println("your grade is c");
      }
    }
}
