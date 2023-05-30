import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reverese the digits of a number
        int n = sc.nextInt(); 

        int ans=0;

        while(n>0){
            ans = ans*10 + n%10;
            n=n/10;
        }
        System.out.println(ans);


    }
}
