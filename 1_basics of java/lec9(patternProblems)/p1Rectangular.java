import java.util.Scanner;
public class p1Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printing rectanguar pattern
        System.out.println("enter n ");
        int n = sc.nextInt();
        System.out.println("enter m ");
        int m = sc.nextInt();

        for(int row = 1; row<=n; row++){
            for(int col = 1 ; col<=m; col++){
                System.out.print("*");
            } 
            System.out.println("");
        }    

    }
}
//here the code is correct but the compiler is enterpreting it wrong.