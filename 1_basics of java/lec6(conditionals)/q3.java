import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        //write a program to take input for cost pricce and selling price and calculate profit or loss

        Scanner sc = new Scanner(System.in);

        System.out.println("enter cost price:- ");
        int cp = sc.nextInt();

        System.out.println("enter selling price :- ");
        int sp = sc.nextInt();

        if (cp>sp) {
            System.out.println("you made a loss of " +  (cp-sp));
        } else if (cp<sp) {
            System.out.println("you made a profit of "+(sp-cp));
        } 
        else{
            System.out.println("zero profit");
        }
    }
}
