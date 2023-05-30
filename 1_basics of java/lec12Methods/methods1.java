import java.util.Scanner;

class Algebra{
    int Sum (int a , int b ){

        int ans = a +b;

        return ans;
    }
}

public class methods1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Algebra obj = new Algebra();

        System.out.println("enter the value of x ");
        int x = sc.nextInt();
        System.out.println("enter the value of y ");
        int y = sc.nextInt();

        int ans = obj.Sum(x, y);

        System.out.println("sum of given numbers is "+ ans);

       
      

    }
}