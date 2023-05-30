import java.util.Scanner;

public class p2HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n :- ");
        int n = sc.nextInt();

        System.out.println("enter the value of m :- ");
        int m = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j=1 ;j<=m;j++){

                if (i==1||i==n||j==m||j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }

            }     
            System.out.println("");     
        }
        
    }
}