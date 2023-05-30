import java.util.Scanner;

 class product{
    int multiply(int a , int b ){
        int pro= a*b;
        return pro;
    }
}

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        product pro = new product();

        System.out.println("enter the value of a ");
        int a = sc.nextInt();

        System.out.println("enter the value of b ");
        int b = sc.nextInt();

        int c = pro.multiply(a, b);

        System.out.println("product of the given numebers is "+c);
    }
}