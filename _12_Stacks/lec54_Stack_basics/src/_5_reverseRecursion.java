import java.util.Stack;

public class _5_reverseRecursion {

    public static void PushAtBottom(int x , Stack<Integer>st){
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        PushAtBottom(x,st);
        st.push(top);
    }

    static void reverseRecursion(Stack<Integer>st){
            if(st.size()==0) return;
            int top = st.pop();
            reverseRecursion(st);
            PushAtBottom(top,st);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("original Stack = ");
        System.out.println(st);

        reverseRecursion(st);
        System.out.println("after reversing :- ");
        System.out.println(st);

    }
}
