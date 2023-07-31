import java.util.Scanner;
import java.util.Stack;

public class q2_insertBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer>st = new Stack<>();
        System.out.println("enter the size of the stack :- ");
        int n = sc.nextInt();

        System.out.println("enter the element you want to push at the bottom = ");
        int num = sc.nextInt();

        System.out.printf("enter %d elements of the stack :- ",n);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("your stack is :- "+st);

        Stack<Integer>gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        st.push(num);
        while(gt.size()>0){
            st.push(gt.pop());
        }

        System.out.printf("after adding %d at the bottom new Stack is \n",num);
        System.out.println(st);
    }
}