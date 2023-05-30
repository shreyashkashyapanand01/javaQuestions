import java.util.Scanner;

/*
 * find the mth summation of the first n natural numbers where mth 
 * summation of first n natural nunbers is defined as the folowing
 * 
 * if m>1:SUM(n,m)=sSUM(n,m-1),1)
 * else : SUM(n,1)= SUM OF THE FIRST N NATURAL NUMBERS .
 * 
 * INPUT: n =3 , m=2;
 * EXPECTED OUTPUT: 21
 */

public class q2 {
    public static int rec(int n, int m) {
        if (m == 1)
                return sumofn(n);

        int sum = rec(n, m - 1);
        return sumofn(sum);
}
public static int sumofn(int n){
        int ans = 0;
        if(n == 1){
                ans++;
                return ans;
        }
        ans += n + sumofn(n-1);
        return ans;
}
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values of n amd m");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(rec(n, m));
    }
}
