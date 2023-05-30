import java.util.Scanner;

public class a_M1sumOfRect {

    static void input(int [][]mat){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }

    static void print (int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int findSum(int mat[][], int l1 , int r1 , int l2 , int r2){

        int sum=0;
        for(int i = l1 ; i<=l2 ; i++){
            for(int j = l1 ; j<=r2 ; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //bruteforce method
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows of the matrix :- ");
        int r = sc.nextInt();
        System.out.println("enter number of columns of matrix :- ");
        int c = sc.nextInt();

        System.out.println("enter "+r*c+" elements of the matrix :- ");
        int mat[][]=new int [r][c];
        input(mat);
        
        System.out.println("enter rectangle boundries \n");
        System.out.println("enter value of l1:- ");
        int l1 = sc.nextInt();

        System.out.println("enter value of r1:-");
        int r1 = sc.nextInt();

        System.out.println("enter value of l2");
        int l2 = sc.nextInt();

        System.out.println("enter value of r2");
        int r2 = sc.nextInt();

        System.out.println("your matrix is:- \n");
        print(mat);

       
        int rectSum = findSum(mat, l1, r1, l2, r2);

        System.out.println("sum of the elements which comes under the area of the rectangle is :- "+rectSum);
        

        

    }
}
