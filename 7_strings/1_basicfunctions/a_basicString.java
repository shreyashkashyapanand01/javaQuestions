import java.util.*;

public class a_basicString {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        String s1 = "shreyash kashyap";

        System.out.println("enter string:- ");

        //this will print before space only
        String s2 = sc.next();
        System.out.println("enter string :- ");
        //this will print whole(including space)
        String s3 = sc.nextLine();

        System.out.println("string 1 :- "+s1);
        System.out.println("string 2 :- "+s2);
        System.out.println("string 3 :- "+s3);
    }
}
