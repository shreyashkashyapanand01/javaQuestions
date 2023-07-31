import java.util.Scanner;
import java.util.Stack;

public class q1_copyStack {
    public static void main(String[] args) {
        //copy contents of one stack to another in same order

        //declaration of stack
        Stack<Integer> st = new Stack<>();

        int n;
        System.out.println("Enter elements you want to insert :- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("enter the elements :- ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("your stack is = "+st);

        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            gt.push(st.pop());
        }

        Stack<Integer> rt = new Stack<>();
        while (gt.size() > 0) {
            rt.push(gt.pop());
        }

        System.out.println("copied stack is = "+rt);
    }
}
