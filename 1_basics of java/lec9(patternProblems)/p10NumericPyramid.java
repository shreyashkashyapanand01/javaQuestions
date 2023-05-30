import java.util.Scanner;
public class p10NumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of r ");
        int r = sc.nextInt();
        System.out.println("enter the value of c ");
        int c = sc.nextInt();

        for (int i =1 ; i<= r ;i++){
            for (int j =1 ; j<=r-1;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i ;k++){
                System.out.print(k);
            }
            for(int l = 1 ; l>=1 ; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
