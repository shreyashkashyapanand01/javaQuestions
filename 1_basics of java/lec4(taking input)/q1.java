import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        //input name , roll number and field of interest of a stuedent and print the output

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name :- ");
        String name = sc.nextLine();

        System.out.println("enter your roll number :- ");
        int roll = sc.nextInt();

        System.out.println("enter your field of interest :- ");
        String interest = sc.next();

        System.out.println("name : "+name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Field of Interest : "+interest);
        
    }
}
