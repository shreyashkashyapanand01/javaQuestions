import java.util.Scanner;
public class reverseInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n ");
        int n = sc.nextInt();

        //print numbers from n to 1 

        for(int i =n ; i>=1 ;i-- ){
            System.out.println(i);
        }
        
    }
}
