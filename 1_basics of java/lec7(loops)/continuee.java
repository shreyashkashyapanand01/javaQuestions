import java.util.Scanner;

import javax.print.event.PrintEvent;
public class continuee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print all values between 1 and 50 except multiples of 3

        // for (int i = 1; i <= 50; i++) {
        //     if (i%3==0) {
        //         continue;
        //     }
        //     System.out.println(i);
           
        // }

        int num = 1;
        while( num <=50){
            if (num%3==0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
       
    }
}
