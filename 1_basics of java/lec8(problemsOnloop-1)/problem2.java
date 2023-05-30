import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //find the sum of digits in a given number n
        int number = sc.nextInt();
        
        int sum = 0;
       
        while(number>0){
            sum+= number%10;
            number = number/10;
            
            

            // number++;

        }
        System.out.println(sum);
    }
}
