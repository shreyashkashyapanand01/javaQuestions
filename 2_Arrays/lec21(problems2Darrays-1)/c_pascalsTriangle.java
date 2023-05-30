import java.util.Scanner;

public class c_pascalsTriangle {
    
    static int [][]Pascal (int n){
            int pascal [][]= new int [n][];

            for (int i = 0; i < n; i++) {
                //ith row has i+1 columns
                pascal[i]=new int [i+1];

                //1st and last element of every column is 1'
                pascal[i][0]=pascal[i][i]=1;
                for (int j = 1; j < i; j++) {
                    pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
                }
            }

        return pascal;
    }



    public static void main(String[] args) {
        System.out.println("enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("pascal triangle for n = "+n+" is ");
        int ans [][]= Pascal(n);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
