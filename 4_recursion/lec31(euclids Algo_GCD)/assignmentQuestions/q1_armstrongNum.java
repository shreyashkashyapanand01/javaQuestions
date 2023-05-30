/*
 * given a number n, print if it is armstrong number or not.
 * 
 * INPUT :- 153
 * OUTPUT :- yes
 */

 import java.util.Scanner;
 
public class q1_armstrongNum {
    
    public static int pow(int a, int b){
        if(b == 0)return 1;
        if(b%2 == 0)return pow(a , b/2) * pow(a , b/2);
        return a * pow(a  , b/2) * pow(a , b/2);
}
public static int isArmstrong(int n , int dig){
        if(n == 0)return 0;
        return pow(n%10 , dig) + isArmstrong(n/10 , dig);
}


    public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the number n: ");
            int n = scn.nextInt();
            int digits = 0;
            int temp = n;
            while(temp > 0){
                    digits++;
                    temp/=10;
            }
            if(n == isArmstrong(n , digits))
                    System.out.println("yes");
            else
                    System.out.println("no");
}
    
}
