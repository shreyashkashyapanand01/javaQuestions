import java.util.Scanner;

public class b_M2sumOfRect {
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
    static void PrefixSum(int [][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //traverse vertically to calculate row- wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        //traverse vertically to calculate col-wise sum

        for(int j =0 ; j<c ; j++){
            for(int i =1; i<r ; i++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }

    static int findSum0(int mat[][], int l1 , int r1 , int l2 , int r2){

        int sum=0;
        for(int i = l1 ; i<=l2 ; i++){
            for(int j = l1 ; j<=r2 ; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    static int findSum(int matrix [][], int l1 , int r1 , int l2 , int r2){
        int sum =0;
        PrefixSum(matrix);
        for (int i = l1; i < l2; i++) {//r1 --> r2 ka sum froe row i
            if(r1>=1){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }
        else{
                sum+=matrix[i][r2];
        }
        }
        
        return sum;
    }

    static int findSum3(int matrix [][], int l1 , int r1 , int l2 , int r2)
{
   
    PrefixSum(matrix);
    int ans =0,sum =0, up=0, left=0, leftUp=0;

    sum = matrix[l2][r2];
    if(r1>=1)
    left = matrix[l2][r1-1];
    if(l1>=1)
    up = matrix[l1-1][r2];
    if(l1>=1 && r1>=1)
    leftUp = matrix[l1-1][r1-1];

    ans = sum - up - left + leftUp;

    return ans;
}



    public static void main(String[] args) {
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

        int sum = findSum3(mat, l1, r1, l2, r2);

        System.out.println("sum of the elements which comes under the area of the rectangle is M3 :- "+sum);

        int sum0 = findSum0(mat, l1, r1, l2, r2);
        System.out.println("sum of the elements which comes under the area of the rectangle is M1 :- "+sum);
    }
}
