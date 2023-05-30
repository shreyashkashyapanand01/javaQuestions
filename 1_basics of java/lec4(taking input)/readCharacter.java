import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class readCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your character :- ");
        char ch = sc.next().charAt(0);
        System.out.println("your charachter is :- "+ ch);
         
    }
}
