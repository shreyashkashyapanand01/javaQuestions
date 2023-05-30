import java.util.Scanner;

class Algebra{
    int average(int a , int b , int c){
        int avg = (a+b+c)/3;

        return avg;
    }
}

public class q1 {
    public static void main(String[] args) {
        //write a method to compute the average of three numbers 

        Scanner sc = new Scanner(System.in);
         
        Algebra al = new Algebra();

        System.out.println("enter the value of x ");
        int x = sc.nextInt();

        System.out.println("enter the value of y ");
        int y = sc.nextInt();

        System.out.println("enter the value of z ");
        int z = sc.nextInt();

      int ans=  al.average(x, y, z);

      System.out.println("average of given numbers is "+ans);


    }
}
