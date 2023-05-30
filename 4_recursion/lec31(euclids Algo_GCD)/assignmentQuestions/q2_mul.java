import java.util.Scanner;
//find multiplication of two numbers using recursion

public class q2_mul {
    
    static int multiplication (int x , int y){
        //base case
        if(x<y){
            return multiplication(y, x);
        }

        //recursive work 
        else if(y!=0) {
        return (x+multiplication(x, y-1));
        }

        else return 0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of x and y :- ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("multiplication = "+multiplication(x, y));
    }
}
