import java.util.Scanner;
public class p3Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of row ");
        //int r = sc.nextInt();
        // System.out.println("enter the value of coloumn ");
        // int c = sc.nextInt();

       for(int i = 1 ; i<=4 ;i++){
        for(int j =1 ; j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
       }

    }
}
